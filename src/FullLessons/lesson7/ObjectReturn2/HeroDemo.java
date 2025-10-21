package FullLessons.lesson7.ObjectReturn2;

public class HeroDemo {
    public static void main(String[] args) {
        Hero pers = new Hero("David", 100, 20);
        Hero pers2 = pers.lvlap().lvlap().lvlap();  // amen me kanchic heto parametrer@ meji k elnin, bayc menk inchxor
                                                    // 3 hat obyekt stex stexcenk, bayc pahpanvik@ menak verjin@
                                                    // en naxordner@ k jnjvin heap-ic heto
         pers.show();
        pers2.show();  //3 ankam kanchink - 3 ankam mej@ xarakteristikaner@ + exan
    }
}
