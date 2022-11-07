package Odev1;
import java.util.Scanner;
public class Soru2 {
    public static void main(String[] args) {

        //Soru 2:
        //
        //String metin = "Bugün Java ile string konusunu işleyeceğiz";
        //
        //Verilmiş olsun. Metin değişkeninin içinde “i” harfinin geçtiği yerlerin indeksini
        // bir while loop ve indexOf metodlarını kullanarak bulup ekrana yazdıran bir program yazınız.
        // Çıktı şu şekilde olmalı
        //
        //i harfinin geçtiği yerler: 11, 18, 31, 40

        Scanner degerAl = new Scanner(System.in);

        String bosMetin = "";
        System.out.print("Deger Giriniz = ");
        int sayi = degerAl.nextInt();

        String metin = Integer.toString(sayi);

        for(int i = metin.length() - 1 ; i >= 0 ; i--) {
            bosMetin += metin.charAt(i);

        }

        System.out.println("Sonuc = " + bosMetin);

    }
}
