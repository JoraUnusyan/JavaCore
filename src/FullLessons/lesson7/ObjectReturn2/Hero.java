package FullLessons.lesson7.ObjectReturn2;

public class Hero {
    String name;
    int health;
    int attack;

    Hero(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    Hero lvlap() {
       return new Hero(name, health + 20, attack + 5);  //hmi return kene obyekt@, urdex or mer personaj@
                                                                     // avelcrac xarakteristikaner uni
    }

    void show() {
        System.out.println(name + " — HP: " + health + ", Attack: " + attack);
    }

}
