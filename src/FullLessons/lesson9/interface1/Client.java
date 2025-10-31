package FullLessons.lesson9.interface1;

public class Client implements CallBack {
    public void back(int p){
        System.out.println("метод callback " + "и его значение " + p); //mer realizacyan metodi
    }

    public void newback(String name){
        System.out.println("My name is " + name);
    }  //interface@ realizacnox klassi mej krnank urish metodnere hangist grenk

}
