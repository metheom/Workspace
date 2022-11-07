package MaratonKodlama;
import java.util.Scanner;
public class Soru4 {
    public static void main(String[] args) {

        while(true) {

            System.out.println("* * * * * * * * * * ** * * * * * * *\n*      Geometrik Hesaplayici       *\n* * * * * * * * * * ** * * * * * * *");

            System.out.println("1. Kare Alan Hesaplama");
            System.out.println("2. Kare Cevre Hesaplama");
            System.out.println("3. Dikdortgen Alan Hesaplama");
            System.out.println("4. Dikdortgen Cevre Hesaplama");
            System.out.println("5. Daire Alan Hesaplama");
            System.out.println("6. Daire Cevre Hesaplama");
            System.out.println("7. Cikis");

            Scanner degerAl = new Scanner(System.in);

            System.out.print("Secim Giriniz = ");
            int secim = degerAl.nextInt();

            if(secim == 7) {

                System.out.println("Cikis Yapildi !");
                break;

            }

            switch (secim) {
                case 1: {
                    System.out.print("Kenar Uzunlugu Giriniz = ");
                    int kenar = degerAl.nextInt();

                    System.out.println("Karenin Alani = " + (kenar * kenar));
                    break;
                }
                case 2: {
                    System.out.print("Kenar Uzunlugu Giriniz = ");
                    int kenar = degerAl.nextInt();

                    System.out.println("Karenin Cevresi = " + (kenar * 4));
                    break;
                }
                case 3: {
                    System.out.print("Kisa Kenar Uzunlugu Giriniz = ");
                    int kisaKenar = degerAl.nextInt();

                    System.out.print("Uzun Kenar Uzunlugu Giriniz = ");
                    int uzunKenar = degerAl.nextInt();

                    System.out.println("Dikdortgenin Alani = " + (uzunKenar * kisaKenar));
                    break;
                }
                case 4: {
                    System.out.print("Kisa Kenar Uzunlugu Giriniz = ");
                    int kisaKenar = degerAl.nextInt();

                    System.out.print("Uzun Kenar Uzunlugu Giriniz = ");
                    int uzunKenar = degerAl.nextInt();

                    System.out.println("Dikdortgenin Cevresi = " + (uzunKenar + kisaKenar) * 2);
                    break;
                }
                case 5: {
                    double pi = 3.14;
                    System.out.println("Yaricap Giriniz = ");
                    int yaricap = degerAl.nextInt();

                    System.out.println("Dairenin Alani = " + (pi * yaricap * yaricap));
                    break;
                }
                case 6: {
                    double pi = 3.14;
                    System.out.println("Yaricap Giriniz = ");
                    int yaricap = degerAl.nextInt();

                    System.out.println("Dairenin Cevresi = " + (2 * pi * yaricap));
                    break;
                }

                default:
                    System.out.println("Yanlis Secim Girdiniz !");
            }

            System.out.println("\n");

        }

    }
}
