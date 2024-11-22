package OOPS.L6.Custom_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAUTL_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAUTL_SIZE];

    }

    private void reSize() {
        int[] temp = new int[data.length * 2];
        for (int index = 0; index < data.length; index++) {
            temp[index] = data[index];
        }
        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public void add(int num) {
        if (isfull()) {
            reSize();
        }
        data[size++] = num;
    }

    public int remove(int index) {
        int removed = data[index];
        return removed;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {

        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        ArrayList<Integer> list2 = new ArrayList<>() ; 
        for (int i = 0; i < 15; i++) {
            list.add(2 * i);
        }

        System.out.println(list.remove(2));
        list.set(4, 11);
        System.out.println(list.size());
        ;

        System.out.println(list);
    }
}
