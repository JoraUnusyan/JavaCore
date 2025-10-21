package FullLessons.lesson6.Stack;

public class Stack {
    int arraylength;
    int stArray[];
    int tos;

    Stack(int arraylength) {
        tos = -1;     //-1 massivi skzbnakan indexne, aysinqn index chka -1-i depkum, L@ ban chka qcac
        this.arraylength = arraylength;  //masivi length-@ vornor bdi stanank obyekt@ stexceluc
        stArray = new int[arraylength];  //kudank masivin erkarucyun@
    }

    void push(int item) {
        if(tos == arraylength) {               //ete lenucyun@ havasarvik@ mer tvac lenucyan@ masivin uremn full-e
            System.out.println("Стэк заполнен");
        } else{
            stArray[++tos] = item;  //hakarak depkum stArray-i konkret index-i tak k @Ngni mer tvac tiv@; minchev or
                                    // masiv@ ch lcvi
        }
    }

    int pop() {
        if(tos < 0) {     //ete masiv@ length@ poqre 0-ic uremn mej@ ban chka qcac bnakanabar
            System.out.println("Стэк не запгружен");
            return 0;
        }
        else{
         return stArray[tos--];  //ete ka - k veradarcnenk verji index@, u amen ankam tos-- kexni, @dpes hertov k hanenk
        }
    }

}
