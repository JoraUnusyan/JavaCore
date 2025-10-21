package FullLessons.lesson7.ObjectReturn;

public class Obyekt {
double width;
double height;

    Obyekt(double width, double height){
        this.width = width;
        this.height = height;
    }

    Obyekt Doublemethod() {              //sarkenkk@ Obyekt tip veradarcnox metod
        return new Obyekt(width * 2, height * 2); // return kene taza obyekt, x2 parametrerov en tex@, urdex
                                                              // or iran k kanchenk
    }

}
