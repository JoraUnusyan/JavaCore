package FullLessons.lesson11.Enums;

public enum Apple2 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;
    Apple2(int price){  //amen me obyekti hamar (GoldenDen, Jonathan ev ayln) ink@ kuda
        this.price = price;
    }

   public int getPrice(){
        return price; //ese zut krnank enum-i mej metode sarkenk xoski price@ stanalu hamar dsic
    }

}
