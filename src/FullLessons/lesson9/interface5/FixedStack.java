package FullLessons.lesson9.interface5;

public class FixedStack implements IntStack{
    private int stack[];
    private int tos;              //vochmi nor ban prost@ metodner@ brnink realizacrink u fsyo

    FixedStack(int size){
        stack = new int[size];
        tos = -1;
    }

    public void push(int item){
        if(tos == stack.length-1){
            System.out.println("стек заполнен");
        }
        else{
            stack[++tos] = item;
        }
    }

    public int pop() {
        if (tos < 0) {
            System.out.println("стэк не загружен");
            return -1;
        } else
            return stack[tos--];
    }



}
