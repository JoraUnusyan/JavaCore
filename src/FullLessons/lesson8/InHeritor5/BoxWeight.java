package FullLessons.lesson8.InHeritor5;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(BoxWeight obj) {
        super(obj); //kanchink cnoxi konstruktr@
        weight = obj.weight;
    }

    BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth); //cnoxi kanstruktri mas@
        this.weight = weight; //mer mas@
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double weight, double len){
        super(len);
        this.weight = weight;
    }
}
