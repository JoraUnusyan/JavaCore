package FullLessons.lesson11.Reflection1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy; //sonk urish paketnericen, bdi stipvac import enenk or ashxatin
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)  //ete ch nshenk or RUNTIME-e brne standartov class tipi kuda, el chenk krnana refleskya enenk
@interface MyAnno{
    String str();
    int val();
}


public class Meta {
@MyAnno(str = "Пример аннотаций", val = 100) //es annotacyan hmi kapvace arten meth-metodi het
    public static void meth(){
    Meta ob = new Meta(); //mer klassi obyekt@ sarkink or het@ ashxtink, chnayac vabshe partadir cher
    try{
        Class<?> c = ob.getClass(); //vprincipi karelier Meta.class-e grel, ban cher poxvi
        Method m = c.getMethod("meth"); //mer stacac classi-mejic gtnink@ meth anunov metod@
        MyAnno anno = m.getAnnotation(MyAnno.class); //ay et metodi vraic nor k gtnink mer uzac anotacyan
        System.out.println(anno.str() + ", " + anno.val()); //krnank arten meji tvyalner@ ogtagorcenk
    }
    catch(NoSuchMethodException e){
        System.out.println("мЕТОД НЕ НАЙДЕН");
    }
}

    public static void main(String[] args) {
        meth();
    }
}
