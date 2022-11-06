public class DongulerFor {

	public static void main(String[] args) {
		
		/*
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		System.out.println("Merhaba");
		*/
		
		int val = 4;
		if (val<7) {
			System.out.println("kucuk");
			System.out.println("kello");
		}
		
		
		for(int sayac=1;sayac<=5;sayac=sayac+1) {
			System.out.println("Merhaba");
		}
		
		for(int sayac=1;sayac<=5;sayac++) {
			System.out.println("Merhaba");
		}
		
		int i = 1;
		for(;i<=5;i=i+1) {
			System.out.println("Java");
		}
		System.out.println(i);
		
		
		for(int j=1;j<6;j++) {
			System.out.println("Merhaba " + j);
		}
		
		/*
		for(;;) {
			System.out.println("Merhaba");
			System.out.println("Java");
		}*/
		
		// 1'den 10'a kadar olan sayıların toplamını yazalım
		int toplam = 0;
		for (int k=1;k<=10;k++) {			
			toplam = toplam + k;									
		}
		
		System.out.println("Toplam = " + toplam);
		
		
		
		// Soru:
		// Aşağıdaki kodu çalıştırınca kaç kez test yazar
		for(int z=0;z<11;z++) {
			z = 10;
			System.out.println("test");
		}
		
		
		
		
		
		
	}

}
