package FullLessons.lesson8.DynamicDispatch;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; // A tipi ssilka stexcink vori anun@ r -e, vor@ krna nae A tipi obyektnerin kam ira jarangnerin u jarangneri
        // mej tesni A tipi infon

        r = a; //k nae a-obyektin mer ssilken, vprincipi mej@ inch ka k tesni
        r.callme();

        r = b;
        r.callme(); // hmi ete metod@ pereopredelyonni chexner, ink@ eli kertar a-i metod@ k kancher, bayc qani or
                   // override e erac, kerta konkret B obyektin@ k bere

        r = c;
        r.callme();

    }



}
