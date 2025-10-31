package FullLessons.lesson7.StaticTest;

public class UseStatic {
    static int a = 3;  //inchor banm or static k sarkenk, ink@ arten zut klassine, kerta MetaSpace-i mej k pahe
                       //ink@ krna aranc obyekt kanchvi vortev MetaSpace-i mej klassi strukturi mej arten ka
                       // static popoxakanner/metodner@, JVM-@ prost@ ira baytkod@ gtni kene, staticne (ira metodner@)
                      // this-chunin, irank chen ga inchor obyekti kpnin, aranc obyekte kashxatin
    static int b;

   static void meth(int x) {      //staticner@ me hatmem et klassi hamar, guze 100 hat ekzemplyar sarkes irank 100-i
                                  // hamare nuyn@ kexnin, krnas aranc obyekte klassi anunov kanches enes
       System.out.println("x = " + x);
       System.out.println("a = " + a);   //static metodneri mej karelie ashxatel menak static popoxakanneri het
       System.out.println("b = " + b);
                                        // bayc zato sovorakan metodneri mej karelie ashxatel static popoxakanneri het
   }

   static {
       System.out.println("static блок инициализирован");
       b = a * 4;
   }

}
