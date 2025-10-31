package FullLessons.lesson8.DynamicDispatch2;

public class Rectangle extends Figure{
    Rectangle(double a2, double b2){
        super(a2, b2);
    }                               //stex poxancink mer uzac parametrer@ u sarkink arandzin metod konkret es klassi
                                    // hashavarkneri hamar

    double area(){
        System.out.println("В области четырехугольникa");
        return dim1 * dim2;
    }



}
