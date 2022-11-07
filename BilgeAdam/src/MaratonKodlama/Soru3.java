package MaratonKodlama;

public class Soru3 {
    public static void main(String[] args) {

     //karakterSayici isimli static bir Java metodu yazınız. Bu metod bir String bir de char değişkenini
        // parametre olarak alacaktır. Fonksiyon paramtre olarak gelen String içindeki yine parametre
        // olarak gelen karakterin sayısını sayıp return edecektir.
        // Fonksiyonun örnek kullanımı:
        // Örnek kullanım 1:
        // karakterSayici ("Bugün güzel bir gün", 'g')
        // Şeklinde main içinden çağırıldığında ekrana 3 yazacaktır.
        // Örnek kullanım 2:
        // karakterSayici("Bugün güzel bir gün", 'x')
        // Şeklinde main içinden çağırıldığında ekrana 0 yazacaktır.

        System.out.println(karakterSayici("Bugün güzel bir gün", 'ü'));

    }
    public static int karakterSayici(String metin , char karakter) {
        int sayac = 0;
        for(int i = 0 ; i < metin.length() ; i++) {
            if(karakter == metin.charAt(i)) {  sayac++;  }
        }
        return sayac;


    }
}
