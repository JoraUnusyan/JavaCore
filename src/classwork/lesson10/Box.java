package classwork.lesson10;

public class Box {           // методы, значения и тд будут создаваться в этом классе отдельно
    double width;
    double height;
    double depth;

   /* void volume() {
        System.out.print("Oбъeм равен " );
        System.out.println(width * height * depth); */

    double volume() {
    return width * height * depth;}
    void setDim(double w, double h, double d) {
        width = w;   //теперь эти значения в основном коде будут появляться автоматический
        height = h;
        depth = d;
    }
}
