package FullLessons.lesson6;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};          //for-each@ k ogtagorcvi tvyalneri bazmazanucyun parunakox inchor
                                                   // obyektneri vrayov ancnelu hamar. orinak massivneri


        for (int num : numbers) {           // num - uxaki ira mej k pahe numbers-i indexneri tak @ngac tver@ hertov.
                                            // num = 10, heto num = 20, heto num = 30;
            System.out.println(num);
        }

        //num-@ masivi vra chi azde u masivi meji elementner@ chi poxe, uxaki k vercne


        // nuynn e inchxor ete for-ov greink
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            System.out.println(num);
//        }

    }
}
