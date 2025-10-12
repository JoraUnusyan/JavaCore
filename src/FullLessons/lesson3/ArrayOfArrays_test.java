package FullLessons.lesson3;

public class ArrayOfArrays_test {
    public static void main(String[] args) {
        int b[][] = new int[3][3];
        b[0] = new int[10];  //karelie sarkel 3 darakani bayc heto darcnel 10, uxaki @dik taza masiv k darna hin@ k kori;
        b[0][9] = 100;
        System.out.println(b[0][9]);


        int a[][] = new int[3][3];
        a[0][1] = 1;
        a[0][2] = 2;
        System.out.println(a[0][2]);  // k tpe 2

        a[0] = new int[10];
        System.out.println(a[0][2]);   //k tpe 0

        //vortev menk uxaki taza masiv stexcink 10 texani, vochte chap@ shatcrink


    }

}
