package FullLessons.lesson9.interface5;

public class Test {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(10);
        FixedStack mystack2 = new FixedStack(20);

        for(int i=0; i<10; i++) mystack1.push(i);
        for(int i=0; i<20; i++) mystack2.push(i);

        System.out.println("Стэк 1");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Стэк 2");
        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
