package Sasha.OOP;

import java.util.Arrays;

public class DynamicArray {
    private Object[] values = {};
    int size = 0;

    public void add(Object value) {
        resizeIfNeeded();
        values[size++] = value;
    }

    protected void resizeIfNeeded() {
        if (values.length == size) {
            values = Arrays.copyOf(values, size * 2 + 1);
        }
    }

    public void set(Object value, int position) {
        if (position < 0 || position >= size) {
            System.err.println("IllegalArgument: position = " + position);
            return;
        }
        values[position] = value;
    }

    //2           //4
    public void add(Object value, int position) {
        if (position > size) {
            System.err.println("IllegalArgument: position = " + position);
        } else if (position == size) {
            add(value);
        } else {
            resizeIfNeeded();
            System.arraycopy(values, position, values, position + 1, size - position);
            values[position] = value;
            size++;
        }
    }
    // values[0] = 3;          size = 5;   value = 4; position = 4;                  v
    // values[1] = 2;
    //values[2] = null;
    //values[3] = might be 4;
    //values[4] = null

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object get(int position) {
        if (position < 0 || position >= size) {
            System.out.println("IllegalArgument: position = " + position);
            return null;
        }
        return values[position];
    }

    public void remove(int position) {
        if (position < 0 || position >= size) {
            System.out.println("IllegalArgument: position = " + position);
        } else if (position == size - 1) {
            values[position] = null;
            size--;
        } else {
            System.arraycopy(values, position + 1, values, position, size - position);
            values[size - 1] = null;
            size--;
        }

    }

    public boolean contains(Object value) {
        for (Object val : values) {
            if (val.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(values);

    }
}





