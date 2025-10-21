package FullLessons.lesson6.Box4;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myboxl = new Box4();
        Box4 mybox2 = new Box4();
        double vol;

      myboxl.setDim(10, 20, 30); //argumentner@ tvink, tarav setDim-i shnorhiv poxancec mer popoxakannerin
      mybox2.setDim(3, 6, 9);

      vol = myboxl.volume(); //volume-@ ira gorc@ erav arjekne return erav vol-i mej
        System.out.println(vol);

        vol = mybox2.volume();
        System.out.println(vol);
    }
}
