package FullLessons.lesson7.InnerClass;

public class InnerClass {
int outer_x = 100;

void test() {
    Inner inner = new Inner(); //metodi mej mer nerdrvac klassic obyekt sarkink u hmi  Inerrclass-i obyektov krnank
                               //ashxatcnenk Inner-i meji display()-@ cherez test metod@
    inner.display();

}

class Inner{
    void display() {
        System.out.println("display " + outer_x);  //iran dostupnien himnakan klassi popoxakanner@

    }  int hello = 20;
}

//hello = 30; //bayc ira popoxakanner@ himnakan klass@ chi tesni

}
