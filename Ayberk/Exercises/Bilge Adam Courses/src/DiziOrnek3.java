public class DiziOrnek3 {

	public static void main(String[] args) {
		
		// Soru:
		int[] dizi = { -4, 7, 12, 78, 72, -122, 18, 0, 90, 30, -500, -34, 9, 122, 100 };
		// bu dizinin ortalamasını tamsayı cinsinden bulunuz.
		
		// ortalama = (dizi içindeki sayiların toplamı) / (dizideki sayı adedi)
		
		int toplam = 0;
		for(int i=0; i<dizi.length;i++) {
			toplam = toplam + dizi[i];   			// => toplam += dizi[i]
		}
		System.out.println("Toplam: " + toplam);
		int ortalama = toplam / dizi.length;
		System.out.println("Ortalama: " + ortalama);
		
		// int eşitlerken yuvarlama yapması:
		int x = 20;
		int g = x / 3;
		System.out.println(g);
		
		int y = 3;
		double v = x / y;
		System.out.println(v);  // 6.6666677  6    6.0
		
		v = x / (y * 1.0);
		System.out.println(v);  // 6.6666677  6    6.0
		
		// kusuratlarla ilgili Java Math kütüphanesinin kullanımı:
		System.out.println(Math.round(v)); 
		System.out.println(Math.round(1.4));
		System.out.println(Math.round(1.5));
		System.out.println(Math.round(1.9));
		
		
		// Dizinin içindeki en büyük sayıyı ve bu sayının index değerini bulma:
		//
		// int[] dizi = { -4, 7, 12, 78, 72, -122, 18, 0, 90, 30 };
		int enBuyukSayi = dizi[0];
		int enBuyukSayiIndex = 0;
		for (int i=0;i<dizi.length;i++) {  // i = 1
			if (enBuyukSayi < dizi[i]) {  // -4 < 7
				enBuyukSayi = dizi[i];  // enBuyukSayi = 7	
				enBuyukSayiIndex = i;
			}			
		}
		System.out.println("Dizi içindeki en büyük sayı: " + enBuyukSayi + "  En büyük sayı index: " + enBuyukSayiIndex);
		
		
		// Aynı dizi içindeki en küçük sayı ve indeksini bulunuz:
		//
		int enKucukSayi = dizi[0];
		int enKucukSayiIndex = 0;
		for (int i=0;i<dizi.length;i++) { 
			if (enKucukSayi > dizi[i]) {  
				enKucukSayi = dizi[i];  
				enKucukSayiIndex = i;
			}			
		}
		System.out.println("Dizi içindeki en küçük sayı: " + enKucukSayi + "  En küçük sayı index: " + enKucukSayiIndex);
		
		
	}

}
