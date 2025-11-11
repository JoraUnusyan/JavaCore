package FullLessons.lesson11.AutoBox;

public class AutoBox {

    static int m(Integer v){  //avtoupakovki orinak
    return v; } //ep or return v-n kene, tkic irakanum intValue() metod@ k kanche or avtosapakovka exni
    public static void main(String[] args) {

        //bdi obyekt poxancver, bayc menk 100 k grenk, stex avtoupakovka kexni, tkic ink@ valueOf()-ov
        // avtoupakovka kene,
        Integer b = m(100); // u hmi stex qani or b-i mej k kanchenk, brne myame eli avtoupakovka kene or b-i mej pahe
        System.out.println(b);



    }
}
