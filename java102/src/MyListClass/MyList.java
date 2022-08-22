package MyListClass;

import java.util.Arrays;

public class MyList<T> {
    private int capacity;
    private T[] array;
    private T[] tempArray;
    public MyList() {
        this(10);
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T[] getTempArray() {
        return tempArray;
    }

    public void setTempArray(T[] tempArray) {
        this.tempArray = tempArray;
    }

    public int size() {
        int number = 0;
        for (int i = 0; i < getCapacity(); i++) {
            if (array[i] != null)
                number++;
        }
        return number;
    }

    public void add(T data) {
        if (size() >= getCapacity()) {
            tempArray = array;
            setCapacity(getCapacity() * 2);
            array = (T[]) new Object[getCapacity()];
            array = Arrays.copyOf(tempArray, getCapacity());
        }
        array[size()] = data;
    }

    public T get(int index) {
        if (size() < index | index < 0)
            return null;
        return array[index];
    }


    public T remove(int index) {
        if (size() < index | index < 0)
            return null;
        T removed = array[index];
        array[index] = null;
        for (int i = 0; i < size(); i++) {
            if (array[i] == null) {
                array[i] = array[i + 1];
                array[i + 1] = null;
            }
        }
        return removed;
    }

    public T set(int index, T data) {
        if (size() < index | index < 0)
            return null;
        array[index] = data;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder printList = new StringBuilder("List: [");
        for (int i = 0; i < size(); i++) {
            if (array[i] == null) {
                printList.append("]");
                break;
            }
            else if (i == size() - 1)
                printList.append(array[i]).append("]");
            else
                printList.append(array[i]).append(",");
        }
        return printList.toString();
    }

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == data)
                return i;
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size() - 1; i >= 0; i--) {
            if (array[i] == data)
                return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public T[] toArray() {
        return getArray();
    }

    public void clear() {
        for (int i = 0; i < size(); i++) {
            array[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> list = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            list.add(array[i]);
        }
        return list;
    }

    public boolean contains(T data) {
        for (int i = 0; i < size(); i++) {
            if (array[i] == data)
                return true;
        }
        return false;
    }
}
