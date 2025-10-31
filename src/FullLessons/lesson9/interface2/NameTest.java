package FullLessons.lesson9.interface2;

public class NameTest {
    public static void main(String[] args) {
        YourName meth = new Jora(); // krnank interface-i tipi ssilka sarkenk vornor k nae konkret obyekti, u k bere et
                                    // obyekti meji metodi realizacyan. JVM-@ kompilyacyaic heto or kancni gorci, guka
                                    // heap-i meji ssilkov kerta MetaSpace, gtnik@ te Itable-i(interfaycneri table-i) mej
                                   // interface-i tvac metod@ vor obyekti realizacyaov e, u @dur kashxatcne
        YourName meth2 = new Poxos();

        meth.name(); //gnac cherez iTable gtav or Jora-i meji realizacyan bdi kanche, kanchec

        //u qanii or 1 interface-ic krna 100 hat tarber klass ogtvi, es tarberakov harmare cherez interface-i kanchel konkret
        //obyekti meji realizacyaner@
        meth2.name();


        meth2 = meth;
        meth2.name(); //krnank ssilkek@ veragrenk




    }
}
