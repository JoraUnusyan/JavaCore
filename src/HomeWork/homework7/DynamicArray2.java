package HomeWork.homework7;

public class DynamicArray2 {
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

    public void deleteByIndex(int index) {
        if (index >= size-1) {
            System.out.println("Такого индекса еще не сделали");
        } else if (index < 0) {
            System.out.println("Отрицательных индексов в массиве нет");
        }
        else{
            for (int i = index; i < size; i++) {
                array[i] = array[i+1];

            }System.out.println("Индекс" + index + "Удален");
            size--;
        }


    }

    public void set(int index, int value) {
        if (index >= size) {
            System.out.println("Такого индекса еще не сделали");
        } else if (index < 0) {
            System.out.println("Отрицательных индексов в массиве нет");
        } else{
                array[index] = value;
            System.out.println("Число " + value + " был добавлен на позицию " + index);
        }
    }

    public void add(int index, int value) {
          if (size == array.length){
              extend();
          }
        if (index < 0) {
            System.out.println("Отрицательные индексы не принимаются");
        } else{
            for (int i = size; i > index; i--) {
               array[i] = array[i-1];

            }
            System.out.println("Число " + value + " был добавлен на позицию " + index);

            array[index] = value;
            size++;

        }
    }

    public boolean exists(int value) {

        for (int i = 0; i < size; i++) {
            if(array[i] == value) {
                System.out.println("Число существует в массиве");
                return true;
            }
        } return false;


    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if(array[i] == value) {
                System.out.println("Найдено число " + value);
                return i;

            }
        }
        return -1;
    }


}
