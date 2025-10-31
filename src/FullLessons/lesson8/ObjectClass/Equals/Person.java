package FullLessons.lesson8.ObjectClass.Equals;

public class Person {
    String name;
    Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){                //hmi k jogenk inche equals metodi kapoti tak grac

        if(this == obj){  //myam stukenkk@ tvac obyekt@ u mer obyekt@ nuynnen te che
            return true;
        }
        if(!(obj instanceof Person)) {        //instanceoff-@ obyekti tip@ k stuke, ete nuyn tip@ chen tox false ene
                                            //petke or hankarc tarber tiper chta, u menk krnanak tak@ (Person) obj enenk
            return false;
        }
        Person other = (Person) obj;             //hmi epor ham obyektneri havasarucyun@ stukink, ham tiperi tarberucyun@
                                                // myam kompilyatrin petke haskcnel or obj-n (Person) tipie,
                                              // vorev obj-n amen depkum Person tipie or eke stexe hase, uxaki kompilyatr@
                                        //@dik l@ chi joge, ira hamar l@ Object-i e,
                                          //u myam (Person) obj or kenenk iran ksenk or vobshem obj-n Person tipie,
                                             //hmi nor meji infoi het karelie ashxatel


        return name.equals(other.name);  //veradarcrink name.equals(other.name) - meji toxer@ hamemematelu hamar
                                         //stexi equals-i Stringi-i meji equals metodne, mer graci het kap chuni


        //@ntanur logikan - ka xoski Person p1 = new Person("Jora");
        //                           Person p2 = new Person("Jora");

        //guka spes p1 == p2 - false, tarber obyektner en
         //  p2 u p1 nuyn tipernen, gnac araj
        // Person other = (Person) obj -- sarkink other ssilka vornor cuyc kuda obj-in mer tvac, iran sarkink nuyn tipic
        // return name.equals(other.name) - hamematink name-eri meji parunakucyun@, ete nuynne true berav u prcav;



    }


}
