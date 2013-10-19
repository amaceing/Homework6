//Anthony Mace  CSC205AB
//This program is designed to implement, use, and manipulate
//a list

public class Homework6 {
    public static void main(String[] args) {
        List test = new List();
        test.insertItem("Hi", 1);
        test.insertItem("Hello", 2);
        test.insertItem("Hey", 3);
        test.insertItem("Test", 2);
        test.insertItem("Done", 4);
        test.insertItem("DoneDone", 6);
        test.insertItem("Done", 4);
        test.insertItem("Emily", 8);
        test.insertItem("Test2", 10);
        System.out.println(test.getListItem(8));
        System.out.println(test.getIndex("Emily"));
        System.out.println(test);
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
        for (int i = 0; i < count; i++) {
            if ((i + 1) == index) {
                item = listArray[i];
            }
        }
        return item;
    }

    public void insertItem(Object insert, int index) {
        boolean ignore = false;
        Object[] temp = null;
        if (index > count + 1) {
            ignore = true;
        } else {
            temp = new Object[listArray.length + 1];
            for (int i = 0; i < index - 1; i++ ) {
                temp[i] = listArray[i];
            }
            temp[index - 1] = insert;
            for (int i = index; i <= count; i++) {
                temp[i] = listArray[i - 1];
            }
            listArray = temp;
            count++;
        }
    }

    public int getIndex(Object search) {
        int index = 0;
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (listArray[i].equals(search) && !found) {
                index = i + 1;
                found = true;
            }
        }
        return index;
    }

    public String toString() {
        String currentList = "";
        for (int i = 0; i < count; i++) {
            currentList += listArray[i] + "\n";
        }
        return currentList;
    }
}