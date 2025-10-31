package FullLessons.lesson8.DynamicDispatch2;

public class Figure {
    double dim1;
    double dim2;  //hayr metodi mej prost@ tvink himk@

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;}

    double area(){
        System.out.println("площадь фигуры не определена");
        return 0;
    }

}
