package homework.homework4;

public class Sort {
    void distribution() {
        int[] array = {4, 7, 7, 1, 3, 9, 0, 2};
        int tempStorage = 0;
        boolean proof;
        for (int i = 0; i < array.length; i++) {
            proof = false;
            for (int j = 0; j < array.length; j++) {

                if (array[i] <= array[j]) {
                    tempStorage = array[i];
                    array[i] = array[j];
                    array[j] = tempStorage;
                    proof = true;
                }
            }
        }
        for (int distribution : array) {
            System.out.println(distribution);
        }
    }
}
