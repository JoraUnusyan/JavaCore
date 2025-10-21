package FullLessons.lesson7.ObjectReturn5;

public class Box {
    int width;
    int height;

    Box(int w, int h) {
        width = w;
        height = h;
    }

    void show() {
        System.out.println("Box: " + width + "x" + height);
    }


    void grow() {
        width *= 2;
        height *= 2;
    }



}
