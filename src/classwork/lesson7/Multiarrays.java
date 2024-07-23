package classwork.lesson7;

public class Multiarrays {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int i, j, k = 0; //переменные можно сразу и в фор обьявить

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        //второй двойной цикл можно и не писать
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {

                    System.out.print(twoD[i][j] + " ");
            }

                System.out.println();



        }


    }
    
}
