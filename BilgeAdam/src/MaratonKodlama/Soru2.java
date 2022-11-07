package MaratonKodlama;

public class Soru2 {
    public static void main(String[] args) {

// Bir dizide tekrar eden ilk sayıyı bulan ve ekrana yazdıran bir static metod yazınız.
// Metod parametre olarak int dizisi alacak ve ilk tekrar eden sayıyı bulup ekrana yazdıracaktır.
// Tekrareden sayı bulunmazsa “Tekrar eden sayı bulunamamıştır.” yazacaktır.
/*
        Örnek Run 1:
        int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };
        Ekran çıktısı:7 sayisi 4 kez tekrar ediyor

        Örnek Run 2:
        int sayiDizisi[] ={ 0, 1, 5, 3};
        Ekran çıktısı:Tekrar eden sayı bulunamamıştır.
*/
        int sayiDizisi[] = { 9, 7, 5, 3, 7, 7, 3, 18, 2, 0, 7 };

        tekrarSayisiBul(sayiDizisi);
    }
    public static void tekrarSayisiBul(int[] sayiDizisi) {

        int sayi = -1;
        int tekrarSayisi = 0;

        for(int i = 0; i < sayiDizisi.length ; i++) {

            int sayac = 0;
            for(int j = 0 ; j < sayiDizisi.length ; j++) {

                if(sayiDizisi[j] == sayiDizisi[i]) {  sayac++;  }
            }
            sayac--;
            if(sayac > 0) {
                tekrarSayisi = ++sayac;
                sayi = sayiDizisi[i];
                break;
            }
        }
        if(tekrarSayisi > 0) {
            System.out.println(sayi + " sayisi " + tekrarSayisi + " kez tekrar ediyor");
        }
        else {
            System.out.println("Tekrar eden sayi bulunamamistir");
        }
    }




}
