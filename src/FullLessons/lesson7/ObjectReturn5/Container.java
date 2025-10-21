package FullLessons.lesson7.ObjectReturn5;

public class Container {
    private Box box; //klassic dus chen krna poxenx


    Container(Box b) {   //ndunec obyekti link@ u meankamic tvec box popoxakanin, hmi et obyekti link@ arten
                         // box popoxakan@ k pahe
        box = b;
    }

    Box getBox() {
        return box;   // hmi es metod@ ur  or kanchin, box -i link@ *nuyn ink@ Container-i mej tvac argumenti)
                     // kerta en tex@ urdic or es metod@ kanchelen
    }

    Box copybox(Box b) {                    //es tarberakove krnank stanank u het tank vabshe taza obyekt vornor
                                           // copy e ere originali inchor tvyalner konkret, bayc el argument-metodin@ chi
                                          // poxvi
        return new Box(b.width+1, b.height+1);
    }

}
