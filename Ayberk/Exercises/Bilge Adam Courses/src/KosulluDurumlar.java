import java.util.Scanner;

public class KosulluDurumlar {

	public static void main(String[] args) {
		
		/*
		// Ornek-1:
		 
		int x = 71;		
		Scanner scanner = new Scanner(System.in);	
		x = scanner.nextInt();
				
		// if-else bloğu
		if (x%10 == 0 && x%7==0) {  // code block
			System.out.println("Hoşgeldiniz..");
			System.out.println("Sayı 10'a ve 7'ye kalansız bölünür");
		}
		else if (x%10 == 0) {  // code block
			System.out.println("Hoşgeldiniz..");
			System.out.println("Sayı 10'a kalansız bölünür");
		}
		else if (x%7 == 0) {   // code block
			System.out.println("Sayı 7'ye kalansız bölünür");
		}
		else 
			System.out.println("Sayı 10'a ve 7'ye kalansız bölünemez");					
		
		System.out.println("Hoşçakalın...");
		*/
		
		
		// Ornek-2:
		// Otomobil yaşına göre vergi dilimi tespiti..
		// 
		// Kullanıcının girdiği otomobil yaşına göre vergi dilimi bilgisini ekrana yazdırın.
		// 0-yas-5:  En yüksek vergi dilimi
		// 5-yas-10:  Orta vergi dilimi
		// 10-yas:  En düşük vergi dilimi
		/*
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Lütfen otomobil yaşını giriniz:");
		int otomobilYasi = scanner.nextInt();
		
		if (otomobilYasi>= 0 && otomobilYasi<=5) {
			System.out.println("En yüksek vergi dilimindesiniz");
		}
		else if (otomobilYasi>5 && otomobilYasi<=10) {
			System.out.println("Orta vergi dilimindesiniz");
		}
		else if (otomobilYasi>10) {
			System.out.println("En düşük vergi dilimindesiniz");
		}
		*/
		
		
		// işlem seçiniz: 
		// 1:toplama 2: çıkarma 3: çarpma 4: bölme
		Scanner scanner = new Scanner(System.in);
		/*
		System.out.println("Lütfen işlem giriniz:");
		int key = scanner.nextInt();
		
		if (key==1) {
			System.out.println("toplama");
		}
		else if (key==2) {
			System.out.println("çıkarma");
		}
		else if (key==3) {
			System.out.println("çarpma");
		}
		else if (key==4) {
			System.out.println("bölme");
		}
		else {
			System.out.println("Yanlış seçim lütfwen 1-4 arası bir değer girin !");
		}
		*/
		
		// switch
		/*
		switch (key) {
		case value1:
			// işlem1
			break;
		case value2:
			// işlem2
			break;
		case value3:
			// işlem3
			break;
			...
		default:			
			break;
		}
		*/
		
		// işlem seçiniz: 
		// 1:toplama 2: çıkarma 3: çarpma 4: bölme
		// işlem seçiniz: 
		// 1:toplama 2: çıkarma 3: çarpma 4: bölme
		/*
		int y = 0;
		System.out.println("Lütfen işlem giriniz:");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			System.out.println("toplama seçildi");
			y = 1;
			break;
		case 2:
			System.out.println("çıkarma seçildi");
			y = 2;
			break;
		case 3:
			System.out.println("çarpma seçildi");
			System.out.println("helooooo");
			y = 3;
			break;		
		case 4:
			System.out.println("bölme seçildi");
			y = 4;
			break;			
		default:
			System.out.println("Yanlış seçim lütfwen 1-4 arası bir değer girin !");
			break;
		}
		System.out.println(y);
		*/
		
		// java 14+ sonrası geçerli:
		// Ay numarasına göre mevsim yazdırma
		int ay = 7;
		switch (ay) {
		case 12, 1, 2:
			System.out.println("Kış");
			break;
		case 3, 4, 5:
			System.out.println("İlkbahar");
			break;
		case 6, 7, 8:
			System.out.println("Yaz");
			break;
		case 9, 10, 11:
			System.out.println("Sonbahar");
			break;
		default:
			System.out.println("Yanlış ay 1-12 arasında olmalı..");
			break;
		}
		
	}

}
