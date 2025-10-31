package FullLessons.lesson8.InHeritor4;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(double width, double height, double depth, double weight){
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void newvolume(){
        width = width + 10;
    };



}
