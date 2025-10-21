package FullLessons.lesson7.ObjectReturn3;

public class HeroDemo2 {


    public static void main(String[] args) {
        Hero2 myhero = new Hero2();

        myhero.lvlup().heal(20).equip("sworld"); //himnakan mitk@ ene or krnank cepochkekov kanchenk
        //metodner@, vortev irank return this exneluc heto, k veradarcnen obyekti ssilken kanchac tex@

        //aysinqn ira gorc@ metod@ kene, bayc et meji tvyalner@ chi veradarcne, vortev tvyalneric hetoe grac return,
        //ink@ zut ssilken nuyn obyekti k veradarcne
        //u et ssilki vra krnank eli metod kanchenk
        //aysinqn myhero.lvlup().heal().equip; inchxor spes ga myhero.ssilka nuyn myhero-i.ssilka nuyn myhero.ssilka nuyn myhero-i

        System.out.println();
        myhero.lvlup().heal(10);

    }

}
