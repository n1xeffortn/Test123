package LocalProject;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryEXP2 {

    public static String[] isbns = {};
    public static String[] titles = {};
    public static String[] authors = {};
    public static int[] years = {};
    public static double[] prices = {};
    private static int countBooks = 0;

    public static void main(String[] args) {
        System.out.println("Programm is started");
        Scanner sc = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("User input: ");
            userInput = sc.nextLine().toUpperCase();
            String[] tokens = userInput.split(", ");

            String command = tokens[0];
            switch (command) {
                case "ADD": {
                    String isbn = tokens[1];
                    addBook(isbn, tokens[2], tokens[3], Integer.parseInt(tokens[4]), Double.parseDouble(tokens[5]));
                    break;
                }

                case "REMOVE": {
                    String isbn = tokens[1];
                    removeBookByIsbn(isbn);
                    break;
                }

                case "PRINT":
                    printStorage();
                    break;

                case "GET":
                    getBookByIsbn(isbns[1]);
                    break;

                case "GET_BY_AUTHOR":
                    getBookByAuthor(tokens[1]);
                    break;

                case "GET_BY_YEAR":
                    break;

                case "GET_TOTAL_PRICE":
                    break;

                case "EXIT":
                    break;

                default:
                    System.err.println("Provided unknown command, please try again");
            }
        } while (!userInput.equalsIgnoreCase("exit"));
        System.out.println("Program is finished.");
    }

    private static void getBookByAuthor(String author) {
        for (int i = 0; i < countBooks; i++) {
            if (authors[i].equals(author)) {
                System.out.println(String.join(", ", isbns[i], titles[i], authors[i], String.valueOf(years[i]), String.valueOf(prices[i])));
            }
        }
    }

    private static void getBookByIsbn(String isbn) {
        for (int i = 0; i < countBooks; i++) {
            if(isbns[i].equals(isbn)) {
                System.out.println(String.join(", ", isbns[i], titles[i], authors[i], String.valueOf(years[i]), String.valueOf(prices[i])));
            }
        }
    }

    private static void printStorage() {
        for (int i = 0; i < countBooks; i++) {
            System.out.println(String.join(", ", isbns[i], titles[i], authors[i], String.valueOf(years[i]), String.valueOf(prices[i])));
        }
    }

    private static void removeBookByIsbn(String isbn) {
        int removeIndex = -1;
        for (int i = 0; i < countBooks; i++) {
            if (isbns[i].equals(isbn)) {
                removeIndex = i;
                break;
            }
            if (removeIndex < 0) {
                System.out.println("No book to remove was not found");
            }
        }
        if (removeIndex != countBooks - 1) {
            System.arraycopy(isbns, removeIndex + 1, isbns, removeIndex, countBooks - removeIndex);
            System.arraycopy(titles, removeIndex + 1, titles, removeIndex, countBooks - removeIndex);
            System.arraycopy(authors, removeIndex + 1, authors, removeIndex, countBooks - removeIndex);
            System.arraycopy(years, removeIndex + 1, years, removeIndex, countBooks - removeIndex);
            System.arraycopy(prices, removeIndex + 1, prices, removeIndex, countBooks - removeIndex);
        }
        countBooks--;
    }

    private static void addBook(String isbn, String title, String author, int year, double price) {
        if(isbns.length == countBooks) {
            increaseStorageCapacity();
        }
        isbns[countBooks] = isbn;
        titles[countBooks] = title;
        authors[countBooks] = author;
        years[countBooks] = year;
        prices[countBooks] = price;
    }

    private static void increaseStorageCapacity() {
        isbns = Arrays.copyOf(isbns, countBooks * 2 + 1);
        titles = Arrays.copyOf(titles, countBooks * 2 + 1);
        authors = Arrays.copyOf(titles, countBooks * 2 + 1);
        years = Arrays.copyOf(years, countBooks * 2 + 1);
        prices = Arrays.copyOf(prices, countBooks * 2 + 1);
    }
}
