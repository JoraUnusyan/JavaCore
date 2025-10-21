package FullLessons.lesson6.This;

public class This {
    int x;
    int y;

    This(int x, int y) {  //obyekt@ stexcvelu pahin mer konstrukt@ ashxatav
       this.x = x;
       this.y = y;         //this-@ metodi parametrer@ veragrec obyekti global popoxakannerin (x, y)
    }

    int metod() {
        return x + y;
    }

}
