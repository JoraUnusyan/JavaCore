package HomeWork.homework7;

import HomeWork.homework6.DynamicArray;

public class DynamicArrayDemo2 {
    public static void main(String[] args) {
        DynamicArray2 dynam = new DynamicArray2();
        for (int i = 0; i < 13; i++) {
            dynam.add(i);
        }


        dynam.deleteByIndex(2);
        dynam.set(3, 10);
        dynam.add(2, 41);
        boolean exis = dynam.exists(3);
        System.out.println(exis);
        dynam.getIndexByValue(3);


    }
}
