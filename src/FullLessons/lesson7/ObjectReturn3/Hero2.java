package FullLessons.lesson7.ObjectReturn3;

public class Hero2 {
    int level = 1;
    int hp = 100;
    String weapon = "none";

    Hero2 lvlup() {             //sarkink Hero2 tipi metod,
        level++;
        System.out.println("новый лвл" + level); //erec ira gorcoxucyunner@
        return this;  //veradarcrav menak ira obyekti (Hero2 obyekti) ssilken;
    }

    Hero2 heal(int amount) {
        hp += amount;
        System.out.println("Исцеление: HP = " + hp);
        return this;
    }

    Hero2 equip(String newWeapon) {
        weapon = newWeapon;
        System.out.println("Экипирован: " + weapon);
        return this;
    }


}
