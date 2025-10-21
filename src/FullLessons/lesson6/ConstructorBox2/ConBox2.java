package FullLessons.lesson6.ConstructorBox2;

public class ConBox2 {

    int width, height, depth;

    ConBox2(int w, int h, int d) {       //krnank arten obyekt@ stexceluc argumentner@ tank, or veragre global
                                         // popoxakannerin
        width = w;
        height = h;
        depth = d;
    }

    int volume(){
        return width * height * depth;
    }

}