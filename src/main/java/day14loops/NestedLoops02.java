package day14loops;

import java.util.Scanner;

public class NestedLoops02 {
    public static void main(String[] args) {


    /*              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                X X X X X
                X X X X X
                X X X X X
    */
    Scanner input= new Scanner(System.in);
        System.out.println("Lutfen satir (row) sayisini giriniz");
        int row= input.nextInt();

        System.out.println("Lutfen sutun (column) sayisini giriniz");
        int column= input.nextInt();

        for(int i=1; i<=row; i++){

            for (int k = 1; k <= column ; k++) {
                System.out.print("x ");

            }
            System.out.println();
        }







    }


}
