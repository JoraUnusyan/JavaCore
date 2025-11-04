package FullLessons.lesson10.exc9;

public class MyException extends Exception{
    private int detail;   //sarkenkk@ mer sepakan Exception@
    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "MyException [" + detail + "] "; //override erink toString-@ vornor jarangeleink Exception-ic
    }

}
