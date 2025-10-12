package FullLessons.lesson3;

public class ArrayOfArrays {
    public static void main(String[] args) {
        int twoD[][] = new int[4][];
        twoD[0] = new int[1];  //inchxor 1 ssilki tak @ngac masivi daraknerin erkarucuyun tvink, heto 2 ssilki taki
        // ev ayln
        twoD[1] = new int[2];
        twoD[2] = new int[3];
        twoD[3] = new int[4];
        int i, j, k = 0;     //spes greluc menak k=0 arjek k stana, i, j- uxaki haytararac en

        //i-in masivneri qanak@[]-n e, j-ira meji masivneri darak@ gtnelu hamar

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {   // i+1-i tex@ krnank grenk twoD[i].lenght

                twoD[i][j] = k;             //hertov k fra 4 masivneri vra, iranc darakeneri mej k dne "k" tiv@ vornor
                // amen ankam k mecna 1 hatovm
                k++;

            }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();

        }
    }
}
