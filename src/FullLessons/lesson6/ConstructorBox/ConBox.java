package FullLessons.lesson6.ConstructorBox;

public class ConBox {
    double width;
    double height;
    double depth;

    ConBox() {             // prost@ konstruktrov skzbnakan tvyalner tvink popoxakannerin obyekti stexcvelu pahin
                           // bayc animst orinake
        System.out.println("My Constructor");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume(){
        return width * height * depth;
    }


}