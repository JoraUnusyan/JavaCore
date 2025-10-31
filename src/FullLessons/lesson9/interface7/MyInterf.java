package FullLessons.lesson9.interface7;

public interface MyInterf {
    int getNumber();
    default String getString(){
        return "обьект типа стринг";
    }


}
