package FullLessons.lesson8.InHeritor5;

public class Shipment extends BoxWeight{  //jarangink jarangic
    double cost;
    Shipment(Shipment obj){
        super(obj);
        cost = obj.cost;
    }

    Shipment(double width, double height, double depth, double len, double cost){
        super(width, height, depth, len);  //de mnacac@ parze
        this.cost = cost;
    }

    Shipment(){
        super();
        this.cost = 0;
    }

    Shipment(double len, double m, double cost){
        super(len, m);
        this.cost = cost;
} }
