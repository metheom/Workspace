import java.util.Scanner;

public class DongulerWhile {

	public static void main(String[] args) {
		
		// while döngüsü:
		// for'dan farklı  olarak koşulun devam edip etmemesi durumunu 
		// while döngüsü içinde değiştirebilirsiniz.
		// for döngüsü belirli sayıda döngü dönecekse kullanılır.
		//
		/*
		if (...) {
			//kodlarımız
		}
		
		while(koşul) {
			// kodlarımız...
		}
		*/
		
		/*
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		int sayi = 0;
		while (sayi<5) {
			System.out.println(sayi);
			sayi++;
		}
		*/
		
		/*
		while(hareketYok) {
			// kameranın harkeet algılama ile ilgili dosyasını kontrol et
			// dosyada : 1 yazıyorsa bir değişkenler while'ı döngüsünün koşulunu değiştir			
			// hiç birşey yapma	
			// sleep(1000)
			// algılama gorurse (hareketYok = false)
			// algılama görmezse (hareketYok = true)
		}
		// AlarmÇal	kodlarınız..	 
		*/
		
		// Örnek
		// Kullanıcı 0'a basana kadar kullanıcının girdiği sayının karesini alıp ekrana yazdıran kodu yazınız
		// 
		// Çözüm-1:
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen karesi alınacak sayıyı giriniz -çıkmak için 0'a basın");
		int rakam = scanner.nextInt();
		
		while (rakam != 0) {			
			System.out.println(rakam + "'ın karesi = " + rakam*rakam);		
			rakam = scanner.nextInt();
		}
		*/
		
		// Çözüm-2:
		
		Scanner scanner = new Scanner(System.in);
		int rakam = 0;
		while ((rakam = scanner.nextInt()) != 0) {
			System.out.println(rakam + "'ın karesi = " + rakam*rakam);
		}
		
		
		
		// do-while döngüsü:
		//
		// do {
		// 		// kodlarımız..
		// } while (condition);
		//
		// do-while mekanizması içindeki kısım en az 1 kere mutlaka çalışır.
		// Daha sonra ise koşula göre çalışır.
		int sayac = 0;
		do {
			System.out.println(sayac);
			sayac++;
		} while (sayac<5);
		
		
		// Ornek - Dikkat
		int x = 7;
		do {
			System.out.println(x);
			x++;
		} while (x<5);
		
		
		// Örnek Soru:
		// kullanıcı 0'a basana kadar kullanıcının girdiği sayının küpünü hesaplayı ekrana yazdırın. 
		

	}

}
