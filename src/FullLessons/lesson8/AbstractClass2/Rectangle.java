package FullLessons.lesson8.AbstractClass2;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("в ОБЛАСТИ ЧЕТЫРЕХУГОЛЬНИКА ");
        return dim1 * dim2;
    }
}
