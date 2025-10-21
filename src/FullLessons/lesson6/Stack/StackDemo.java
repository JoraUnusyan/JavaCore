package FullLessons.lesson6.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack mystack = new Stack(10);
        Stack mystack2 = new Stack(20);

        for (int i = 0; i < 10; i++) {
            mystack.push(i);                       //qcink tver@
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Содержание");

        for (int i = 0; i < 10; i++) {
            System.out.println(mystack.pop());        //haneluce verjic hanelov guka
        }

        System.out.println("второй");

        for (int i = 0; i < 20; i++) {
            System.out.println(mystack2.pop());
        }



    }
}
