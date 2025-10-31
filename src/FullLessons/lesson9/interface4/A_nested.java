package FullLessons.lesson9.interface4;

public class A_nested {
    public interface nestedif{   //nerdrvac interface-@ araji hertin @nur hamare or verabervik@ konkret es klassin,
                                //aysinqn iran bdi hxvink cheres A_nested.nestedif.

                               // + nerdrvac interface-neri shnorhiv kod@ aveli akuratni kexni, 100 hat tarber texer grac
                             //interface-ner chenk pahe

                          //+ urish klassner@ k krnanan es nuyn anunov urish interface-ner sarken u konflikt chexni iranc
                         // mej
        boolean isNotNegative(int x);
    }
}

class B implements A_nested.nestedif{
    public boolean isNotNegative(int x){
        return x < 0 ? false : true;
    }
}

class nestedIfDemo{
    public static void main(String[] args) {
        A_nested.nestedif meth = new B();  //B-in naenk@ nestedif-i tipi link-ov

        if(meth.isNotNegative(10)){    //qani or implements kexni a-i meji interfacei het, ameninch normal kashxati
            System.out.println("Число 10 не отрицательное");
        }
        if(meth.isNotNegative(-12)){
            System.out.println("это не будет выведено");
        }
    }
}
