package HomeWork.homework6;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] superarray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            superarray[i] = array[i];
        }
        array = superarray;
    }

    public int getByIndex(int index) {
        if (index >= size) {
            System.out.println("Такого индекса еще не сделали");
            return -1;
        } else if (index < 0) {
            System.out.println("Отрицательных индексов в массиве нет");
            return -1;
        } else {
            return array[index];
        }
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}