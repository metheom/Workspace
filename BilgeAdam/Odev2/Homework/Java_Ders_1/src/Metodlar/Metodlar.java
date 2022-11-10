package Metodlar;

public class Metodlar {
	//Camelcase değişkenler için kullanılır.
	//Metod Tanımı => Erişim Belirteci(public,private,protected) static MethodunTipi(int,String or void) MethodunAdi(){}
	
		//Not1: Methodun içinde return gördüysen o geriye değer döndüren bir metotdur.
		//Not2: Methodun tipi Void'se o geriye değer döndürmeyen 
		
		
		// Geriye değer döndürmeyen metotlar
		
		public static void toplaVoid(int sayi1,int sayi2) //Parametreli Geriye Değer Döndürmeyen Metod
		{
			System.out.println(sayi1 + sayi2);
		}
		
		public static void SarkiSoyle() // Parametresiz Geriye Değer Döndürmeyen Metod
		{
			System.out.println("Haydi söyle, seni nasıl sevdiğimi");
			System.out.println("Haydi söyle, rüyalarda gördüğümü");
		}
		
		public static void SarkiSoyle(String isim) {
			System.out.println("İyi ki doğdun " + isim);
		}
		
		
		// Geriye string değer döndüren metotlar
		
		public static String WelcomeMessage(int ogrNo,String ogrAd) 
		{	
			String hosgeldinMesaji= ogrNo + " numaralı " + ogrAd + " isimli öğrenciye merhaba!";
			return hosgeldinMesaji;
		}
		
		public static String soruSor() {
			return "Napyorsun";
		}
		
		public static String Selamla(String language) {
			
			if(language=="en") {
				return "I love you";
			}
			else if(language=="tr") {
				return "Seni seviyorum";
			}
			else if(language=="ru")
			{
				return "Я тебя люблю";
			}
			else {
				return "Geçersiz dil.";
			}
		}
		
		  
		
		//Geriye integer değer döndüren metotlar
		
		public static int toplaReturn(int sayi1,int sayi2) 
		{
			System.out.println(sayi1+sayi2);
			System.out.println("Selam");
			int mern = 5 * 6;
			System.out.println(mern);
			return (sayi1+sayi2);
		}
		
		public static int cikarma(int sayi1,int sayi2) 
		{
			int sonuc = sayi1 - sayi2;		
			return sonuc;	
		}
		
		
}
