package Sasha.Chernovik;

import java.util.Objects;

public class tetsttt {

    public static void main(String[] args) {

    }

    }






class TransparentColor extends Color {

    private int alpha;

    public TransparentColor(byte red, byte green, byte blue) {
        super(red, green, blue);
    }

    public TransparentColor(int red, int green, int blue, int alpha) {
        super((byte) red, (byte) green, (byte) blue);
        this.alpha = alpha;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TransparentColor that = (TransparentColor) o;
        return alpha == that.alpha;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), alpha);
    }



}




















    class Y {
    static int basicStaticField = 0;

    static {
        basicStaticField = 1;
    }
    int basicField = 3;
        {
            basicField = 4;
        }
        public Y() {
            basicField = 5;
        }

        {
            basicField = 6;
        }
    }

    class Z extends Y {
        static int ChildStaticField = 0;

        static {
            ChildStaticField = 1;
        }

        int childField = 3;

        {
            childField = 4;
        }

        public Z() {
            super();
            childField = 5;
            System.out.println("aaa");
        }

        {
            childField = 6;
        }
    }

    class Holder {
        private int field;

        public Holder(int field) {
            this.field = field;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof Holder)) {
                return false;
            }

            return this.field == ((Holder) obj).field;

        }
    }









