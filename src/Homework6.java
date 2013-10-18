//Anthony Mace  CSC205AB
//This program is design to implement, use, and manipulate
//a list

import java.util.*;

public class Homework6 {
    public static void main(String[] args) {
        List test = new List();
        test.insertItem("Hello", 1);
        test.insertItem("Hello", 2);
        test.insertItem("hi", 3);
        test.insertItem("Hello", 4);
        test.insertItem("Hello", 10);
        System.out.println(test);

        /*
        int[] intArray = new int[5];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray));
        int[] temp = new int[intArray.length + 1];
        for (int i = intArray.length; i > 3; i--) {
            temp[i] = intArray[i - 1];
        }
        temp[3] = 7;
        for (int i = 0; i < 3; i++) {
            temp[i] = intArray[i];
        }
        System.out.println(Arrays.toString(temp));
        */
    }

    public static void insertInt(int insert, int index) {

    }
}

class List {
    private Object listArray[];
    private int count;

    public List() {
        count = 0;
        listArray = new Object[50];
    }

    public Object getListItem(int index) {
        Object item = null;
        for (int i = 0; i < listArray.length; i++) {
            if (index == (i + 1)) {
                item = listArray[i + 1];
            }
        }
        return item;
    }

    public void insertItem(Object insert, int index) {
        Object[] temp = new Object[listArray.length];
        for (int i = 0; i < listArray.length; i++) {
            temp[i] = listArray[i];
            temp[index - 1] = listArray[i];
        }
        temp[index - 1] = insert;
        listArray = temp;
        count++;
    }

    public String toString() {
        String currentList = "";
        System.out.println(listArray.length);
        System.out.println(count);
        for (int i = 0; i < listArray.length; i++) {
            currentList += listArray[i] + "\n";
        }
        return currentList;
    }
}
