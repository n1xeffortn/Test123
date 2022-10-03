package Sasha.OOP;

public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add("a");
        dynamicArray.add("b");
        dynamicArray.add("c");

        System.out.println(dynamicArray);

        System.out.println(dynamicArray.getSize());

        System.out.println(dynamicArray.isEmpty());

       dynamicArray.remove(2);
       dynamicArray.remove(0);

        System.out.println(dynamicArray);

        dynamicArray.set("q", 0);

        System.out.println(dynamicArray);

        System.out.println(dynamicArray.contains("q"));



    }
}
