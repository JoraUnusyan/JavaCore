package classwork.lesson7;

public class TwoDAgain {
    public static void main(String[] args) {
        int twoD [][] = new int [4][];

        // тут мы просто пишем что в массиве 0 у второго массива 1 место
        // у массива 1 у второго массива 2 места и т.д

        twoD[0] = new int[1];
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4]; 
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1 ; j++) {
                twoD [i] [j] = k;
                k++;
                
            }
            // второй двойной цикл можно и не писать
            
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(twoD[i][j] + " ");

            }
            System.out.println();
        }
    }
}
