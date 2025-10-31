package FullLessons.lesson9.interface6;

public class myClass implements B{


    @Override
    public void meth1() {
        System.out.println("метод 1");
    }

    public void meth2(){     //B-i koxmic jarangvac A-i metodnerne realizacrink
        System.out.println("метод 2");
    }

    public void meth3(){
        System.out.println("метод 3");
    }
}
