package FullLessons.lesson7.ObjectReturn4;

public class Box {
    int width, height;

    Box(int w, int h) {
        width = w;
        height = h;
    }

    Box doubleSize(Box other) {                 //vorpes parametr k @ndune Box tipi obyekt, return kene taza obyekt
                                                // vornor vorpes ira parametrer vercrele metodi argumenti popoxakanner@
                                                // bayc el argumenti meji popoxakanner@ chen poxvi vortev return kenenk
                                                // taza obyekt vabeh
        return new Box(other.width * 2, other.height * 2);
    }

    void show() {
        System.out.println("Box: " + width + "x" + height);
    }

}
