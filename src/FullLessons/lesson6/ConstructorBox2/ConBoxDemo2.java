package FullLessons.lesson6.ConstructorBox2;

public class ConBoxDemo2 {
    public static void main(String[] args) {
        ConBox2 mybox = new ConBox2(30, 20, 10);  // hmi krnank tarber ekzemplyaner stexcenk tarber skzbnakan
                                                           // tvyalnerov
        ConBox2 mybox2 = new ConBox2(3, 6, 9);

        int rezult = mybox.volume();
        System.out.println(rezult);

        rezult = mybox2.volume();
        System.out.println(rezult);


    }
}