package FullLessons.lesson8.DynamicDispatch2;

public class Triangle extends Figure{
    Triangle(double a3, double b3){
        super(a3, b3);

    }                      //logikan nuynne

    double area(){
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}
