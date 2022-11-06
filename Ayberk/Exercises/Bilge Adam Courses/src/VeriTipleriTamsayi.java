// Sınıf isimleri tanımlanırken: PascalCasing
public class VeriTipleriTamsayi {

	public static void main(String[] args) {
		
		// System.out.println("Hello World");   // Bir satırı yorum satırı yapmak için // kullanırız
		/*
		System.out.println("Merhaba Dünya");		
		System.out.println("Merhaba Dünya2");  // CTRL+s ile de save edilebilir.
		*/
		
		// ln: line demek. println ile alt satıra geçer, yazmazsanız aynı satırda kalır..
		/*
		System.out.println("Hello World1");
		System.out.print("Hello World2");
		System.out.print("Hello World3");
		*/

		/*
		System.out.println("Hello " + "World" + " " + "Guray " + "Sungur");
		System.out.println("Hello " + "World" + " " + "Guray " + "Sungur");
		// Satır kopyalama : ctrl + alt + aşağı ok tuşu		 
		*/
		
		// Değişken tanımlama
		// byte : 1 Byte : 8 bits
		// -128 ile 127 arasında değer alır.
		// -2^7 ile 2^7-1 arasında değer alır.
		// 1111 1111              0111 1111:127  Ok.    1000 0000 :-128  1000 0001:-127 1111 1111:-1
		byte byteValue;  // Değişken tanımlamalarında : camelCasing  Örn. liseOgrencileriListesi, ogrenciler
		byte maxURLSayisi = 100;
		
		byte ogrenciSayisi;
		// Yanlış değişken tanımalmalrı:
		// byte ogrenci Sayisi;
		// byte *ogrenciSayisi;
		// byte 1ogrenciSayisi;    // 		byte ogrenciSayisi1; => dogru
		// byte öğrenciSayısı;
		
		// Değişken Atama:
		byteValue = 127;
		
		
		
		
		
		// short veri tipi: 2 Byte
		// -32768 ile 32767
		//  -2^15 ile 2^15-1 
		short shortValue = 22;
		short ogrenciNotu4, ogrenciNotu5, ogrenciNotu6;
		ogrenciNotu4 = 58;
		short ogrenciNotu1 = 75, ogrenciNotu2 = 100, ogrenciNotu3 = 80;
		ogrenciNotu5 = ogrenciNotu4;
		
		// Büyük ilkel veritipi = kucuk ilkel veritipi => Ok
		// kucuk ilkel veritipi != Büyük ilkel veritipi => Normalde olmaz, caste etmeniz gerekir.
		shortValue = byteValue; // Ok
		System.out.println(shortValue);
		
		byteValue = (byte) shortValue;  // bu işleme casting veya cast etmek denir. 
		//System.out.println("byteValue: " + byteValue);
		
		// Soru:
		// shortValue 127'den büyük olsaydı ne olurdu?
		shortValue = 129;  // 0000 0000   1000 0001 = 129
		byteValue = (byte) shortValue;  // 1000 0001: -127
		System.out.println("byteValue: " + byteValue);
		
		// int : 4 Byte : 32 bits
		//     -2^31 ile 2^31-1 
		int intValue = 8;
		intValue = shortValue;
		shortValue = (short) intValue;
		System.out.println("int değer aralığı: " + Integer.MIN_VALUE + " ile " + Integer.MAX_VALUE);
		
		
		// Byte Toplama
		byte b2;
		byteValue = 10;
		b2 = (byte) (byteValue + byteValue);
		System.out.println(b2);
		
		short sh1 = 3;
		short sh2 = 5;
		short sh3;
		sh3 = (short) (sh1 + sh2);		
		System.out.println("sh3: " + sh3);
		
		
		// int toplama
		int x1 = 33;
		int x2 = 44;
		int x3 = x1 + x2;
		System.out.println(x3);
		
		
		// long veritipi: 8 Byte
		// -2^63 ile 2^63-1 arasında değer alabilir.
		System.out.println("Long değer aralığı: " + Long.MIN_VALUE + " ile " + Long.MAX_VALUE);
		long longValue = 7L;
		System.out.println(longValue);
		longValue = 9223372036854775807L;
		System.out.println(longValue);
		
		// Dikkat:
		// 1:
		long mytimer = 372036854775807L * 2;
		// 2:		
		int carpan = 100000;
		long carpim = carpan * carpan;  // Hatalı sonuç!
		//carpim = (long)carpan * carpan;
		carpim = 1L * carpan * carpan;
		System.out.println("carpim: " + carpim);
		
		
	}

}
