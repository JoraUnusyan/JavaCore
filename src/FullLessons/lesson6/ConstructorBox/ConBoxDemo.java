package FullLessons.lesson6.ConstructorBox;

public class ConBoxDemo {
    public static void main(String[] args) {
        ConBox myconbox = new ConBox();
        ConBox myconbox2 = new ConBox();
        double vol;
        vol = myconbox.volume();
        System.out.println(vol);
        vol = myconbox2.volume();
        System.out.println(vol);
    }
}