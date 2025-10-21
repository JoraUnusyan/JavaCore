package HomeWork.homework6;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynam = new DynamicArray();
        for (int i = 0; i < 13; i++) {
            dynam.add(i);
        }

        System.out.println(dynam.getByIndex(0));

        dynam.print();


    }
}

