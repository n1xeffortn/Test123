package Sasha.Chernovik;

import java.util.Arrays;
import java.util.Objects;

public class CloneExample {

    public static void main(String[] args) {

     /*   Color black = new Color(1,1,1);
        Object clone = black.clone();
        System.out.println(black == clone);

        Color clonedColor = (Color) clone;

        System.out.println(black.equals(clonedColor));
        System.out.println(clonedColor);
      */

        String[] users =  {"A", "B", "C"};

        Users users1 = new Users(users);
        Users users2 = users1.clone();

        System.out.println(Arrays.toString(users));
        users1.getArgs()[0] = "AA";
        System.out.println(Arrays.toString(users));
        users2.getArgs()[1] = "BB";
        System.out.println(Arrays.toString(users));





    }
}

class Users implements Cloneable {
    private String[] args;

    public Users(String[] args) {
        this.args = args;
    }

    public String[] getArgs() {
        return args;
    }

    @Override
    public Users clone()  {
        try {
            return (Users) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}


















































class Color implements Cloneable {
    private byte red; // 0
    private byte green; // 0
    private byte blue; // 0

    public Color(byte red, byte green, byte blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(int red, int green, int blue) {
        this((byte) red, (byte) green, (byte) blue);
    }

    public byte getRed() {
        return red;
    }

    public byte getGreen() {
        return green;
    }

    public byte getBlue() {
        return blue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Color)) return false;
        Color color = (Color) o;
        return red == color.red && green == color.green && blue == color.blue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(red, green, blue);
    }

    @Override
    public Color clone() {
        try {
            Object clone = super.clone();
            return (Color) clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

}