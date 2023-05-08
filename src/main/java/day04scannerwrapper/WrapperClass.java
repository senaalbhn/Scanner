package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
        //Primitive    : char      - boolean - byte - short - int    - long - float - double
        //Wrapper Class: Character - Boolean - Byte - Short -Integer - Long - Float - Double
        //Wrapper class lar nonprimitive oldugu icin memory de cok yer kaplar
        //dolayisi ile sart degilse

        //n yazip nokta koyarsaniz hic method goremezsiniz. cunku primitivler method icermez
        int n= 12;
        //m yazip nokta koyarsaniz bir cok method gorebilirsiniz cunku wrapper classlar method icerir
        Integer m=12;

        byte u= 8;
        Byte r= 29;

        //Ornek: short data type inin minumum ve maksimum degerini kod yazarak bulunuz

        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);

        short minShort= Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);
    }
}
