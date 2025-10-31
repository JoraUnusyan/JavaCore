package FullLessons.lesson8.InHeritor4;

public class Box {
    double width = 100;
    double height;
    double depth;

    Box(Box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(){
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}
