//Anthony Mace  CSC205AB
//This program is design to implement, use, and manipulate
//a list

public class Homework6 {
    public static void main(String[] args) {
        List test = new List();
        test.insertItem("Hi", 1);
        test.insertItem("Hey", 2);
        test.insertItem("Yo", 3);
        test.insertItem("Hi", 4);
        test.insertItem("Howdy", 5);
        System.out.println(test.getListItem(2));
        System.out.println(test.getIndex("Howdy"));
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
        listArray = new Object[5];
    }

    public Object getListItem(int index) {
        Object item = null;
        for (int i = 0; i < listArray.length; i++) {
            if ((i + 1) == index) {
                item = listArray[i];
            }
        }
        return item;
    }

    public void insertItem(Object insert, int index) {
        Object[] temp = new Object[listArray.length + 1];
        for (int i = count; i > index; i--) {
            temp[i] = listArray[i - 1];
        }
        temp[index - 1] = insert;
        for (int i = 0; i < index - 1; i++) {
            temp[i] = listArray[i];
        }
        listArray = temp;
        count++;
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
        System.out.println(listArray.length);
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            currentList += listArray[i] + "\n";
        }
        return currentList;
    }
}
