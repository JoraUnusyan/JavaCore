package FullLessons.lesson11.Retention3;



import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno{
    String str() default "тестирование";  //zut default-i vaxt ete ches ta es znacheninerov guka
    int val() default 9000;
}

public class Meta3 {
    @MyAnno(str = "Пример аннотаций", val = 100)
    public static void myMeth(){
        Meta3 ob = new Meta3();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + ", " + anno.val());
        }
        catch(NoSuchMethodException e){
            System.out.println("мЕТОД НЕ НАЙДЕН");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
