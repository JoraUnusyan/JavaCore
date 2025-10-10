package FullLessons.lesson4;

public class Array {

    public static void main(String[] args) {
        int [] arr = new int[10];
        // arr = {10, 20, 30}  - chi kareli,

        // 1 tarberak

        int[] arr2;
        arr2 = new int[10];

        //2 tarberak

        int[] arr3 = new int[10];

        //3 tarberak

        int[] arr4 = new int[] {1, 2, 3};


        //4 tarberak

        int[] arr5;
        arr5 = new int[] {1, 2, 3};

        //5 tarberak

        int[] arr6 = {1, 2, 3, 4, 5};


        //..................

        int [] arr7 = new int[10];

        arr7[0] = 5; //ti dnel

        int x = arr7[0]; //tiv hanel
        System.out.println(x);

         //.....................

        //masivic masiv xrkel

        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = arr6[i];
            System.out.println(arr6[i]);}


        //kam xoski

        arr7[0] = arr6[4];
        System.out.println(arr6[4]);


    }

}
