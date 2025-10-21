package FullLessons.lesson6.Box4;

public class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d){
        width = w;
        height = h;                                 // argumentner@ or tvink metod@ kancheluc,
                                                    // iranc arjek@ width = w enelov poxancink global popoxakannerin
                                                     // volume-n e arten et arjeknerov ira gorc@ erav
        depth = d;
    }



}
