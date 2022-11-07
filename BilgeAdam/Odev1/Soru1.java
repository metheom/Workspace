package Odev1;
import java.util.Scanner;
public class Soru1 {
    public static void main(String[] args) {
        // Soru 1:
        // Kullanıcının girdiği pozitif bir tamsayıyı (int) ters çeviren ve
        // görüntüleyen bir uygulama yazın. (Not: String ve char kullanarak yapınız)

        Scanner scanner = new Scanner(System.in);

        String bosMetin = "";
        System.out.print("Deger Giriniz = ");
        int sayi = scanner.nextInt();
        String metin = Integer.toString(sayi);

        for(int i = metin.length() - 1 ; i >= 0 ; i--) {

            bosMetin += metin.charAt(i);
        }
        System.out.println("Sonuc = " + bosMetin);

    }

}
