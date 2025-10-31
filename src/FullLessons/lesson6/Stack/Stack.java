package FullLessons.lesson6.Stack;


public class Stack {
    int array[] = new int[10];
    public int tos;

    public Stack() {
        tos = -1;
    }

    public void push(char item) {
        if (tos == array.length-1) {
            extend();
        }
        array[++tos] = item;
    }

    private void extend(){
        int[] superarray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            superarray[i] = array[i];
        }
        array = superarray;
    };

    public int pop() {
        if (tos < 0) {
            return 0;
        }
        else {
            return array[tos--];
        }
    }



}