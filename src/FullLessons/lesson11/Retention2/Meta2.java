package FullLessons.lesson11.Retention2;


import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface  MyAnno{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String Description();
}


@MyAnno(str = "OO", val = 20)
public class Meta2 {

    @What(Description =  "Аннотация тест метода")
    @MyAnno(str = "Тестинг", val = 100)

    public static void meth2(){
        Meta2 obj = new Meta2();
    try{
        Annotation annos[] = obj.getClass().getAnnotations(); //es obyekti mej inchkan annotacya ka k pahe mej@ es depkum
        System.out.println("Все анотации");
        for (Annotation anno : annos) {
            System.out.println(anno);
        }
        System.out.println();


        Method m = obj.getClass().getMethod("meth2");
        annos = m.getAnnotations();
        System.out.println("Все анотации для метода myMeth");
        for (Annotation anno : annos) {
            System.out.println(anno);

    }
    } catch(NoSuchMethodException e){
        System.out.println("метод не найден ");
    }
}

    public static void main(String[] args) {
        meth2();
    }
    }
