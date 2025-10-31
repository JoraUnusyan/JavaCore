package FullLessons.lesson8.DynamicDispatch2;

public class FindAreas  {

    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);         //amen mekin tvink ira parametrer@
        Triangle t = new Triangle(10, 8);

        Figure figuref; //logikan nuynne

        figuref = f;
        System.out.println("Площадь равна " + figuref.area());

        System.out.println();

        figuref = r;
        System.out.println("Площадь равна " + figuref.area());

        System.out.println();

        figuref = t;
        System.out.println("Площадь равна " + figuref.area());


    }

}
