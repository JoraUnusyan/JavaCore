package FullLessons.lesson7.PrivateTest;

public class PrivateTest {
    int a;
    public int b; //dostupnien menak es klassi mej
    private int c;

    void setc(int i) {
        c = i;  //iranc dostup krnank stanank metodnerov
    }

    int getc() {
        return c; // naev cherez metod krnank hanenk
    }
}
