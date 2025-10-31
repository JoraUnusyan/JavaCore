package FullLessons.lesson8.InHeritor3;

public class Box {
    double width;
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
                                      //hechme nor ban, milyon tesaki peregruzkov kanstruktrner stexcink
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len){
        width = height = depth = len;
    }

    double volume(){
       return width * height * depth;
    }
}
