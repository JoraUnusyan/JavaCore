package FullLessons.lesson7.ObjectParametr2;

public class Box {

    double width;
    double height;

    Box(double width, double height){
        this.width = width;
        this.height = height;
    }

    Box(BoxS other) {
        width = other.width;
        height = other.height;
    }


}
