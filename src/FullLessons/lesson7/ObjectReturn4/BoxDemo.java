package FullLessons.lesson7.ObjectReturn4;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box(19, 20);
        Box newbox = new Box(10, 30);
        Box newbox2 = mybox.doubleSize(newbox);
        mybox.show(); //araji obyekt@
        newbox.show(); // erkrord obyekt@, vor@ vorpes argument enk tve newbox2-in
        newbox2.show(); // erord obyekt@, vorpes argument stacele newbox-in
    }
}
