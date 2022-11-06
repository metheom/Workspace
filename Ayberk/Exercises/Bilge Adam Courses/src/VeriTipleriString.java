import java.util.Locale;
import java.util.Scanner;

public class VeriTipleriString {

	public static void main(String[] args) {
		
		// {'B', 'u', 'g', 'ü', 'n', ' ', 'J', 'a' , ............ ,'z' } => char[] dizi
		// Bilgisayarda dizilerin ilk elemanı her zaman sıfırdan(0) başlar.
		// index dizilimi: 0, 1, 2, 3, 4, ........
		String metin = "Bugün Java ile string konusunu işleyeceğiz";
		System.out.println(metin);
		String tekharf = "a"; // char[] dizi => {'a'} => Java bunu 1 elemanlı bir karakter dizisi olarak iç 
							  // yapısında tutar.
		
		// String sık kullanılan metodları
				
		
		// length metodu
		// degisken.length() => metnin uzunluğunu int cinsinden verir
		int uzunluk = metin.length();
		System.out.println(uzunluk);
		/*
		metin = " Hello!,; ";
		uzunluk = metin.length();
		System.out.println(uzunluk);
		*/
		
		// charAt metodu
		System.out.println("3.karakter: " + metin.charAt(2));
		System.out.println("7.karakter: " + metin.charAt(6));
		
		System.out.println(metin.charAt(metin.length()-1));  // Her zaman String'in son karakterini verir
		
		
		// indexOf metodu
		// Finds the index
		//
		// s harfinin ilk nerede (hangi index'te) geçiyor onu bulur ve döndürür.
		System.out.println("g harfi ilk nerede geçiyor? : " + metin.indexOf('g'));
		System.out.println("B harfi ilk nerede geçiyor? : " + metin.indexOf("B"));
		System.out.println("b harfi ilk nerede geçiyor? : " + metin.indexOf("W")); // Aradığınız karakteri bulamazsa -1 döner
		
		
		// Birden fazla harf arama
		//
		// Java kelimesi illk nerede geçiyor?
		// Bugün Java ile string konusunu işleyeceğiz
		System.out.println("Java kelimesi ilk nerede geçiyor?: " + metin.indexOf("Java"));
		
		// i harfi iilk nerede gçeiyor?
		System.out.println("i harfi ilk nerede geçiyor? : " + metin.indexOf("i"));
		
		// 14.karakterden sonra i karakteri:
		System.out.println("i harfi 14.karakterden sonra ilk nerede geçiyor? : " + metin.indexOf("i", 14));
		
		// Soru:
		// i harfi cümlenin yarısından itibaren ilk geçtiği yerin indexi:
		System.out.println("i harfi cümlenin yarısından itibaren ilk geçtiği yer: " + metin.indexOf("i", metin.length()/2));
		
		
		
		// substring
		// Gets the substring of a string
		// 
		// substring(başlangıç index, bitiş indexi) => başlangıç dahil - bitiş dahil değil.
		System.out.println("Metnin ilk 5 karakteri: " + metin.substring(0, 5));		
		System.out.println("Metnin ilk 4.karakterden 5.karaktere kadar olan karakter(ler): " + metin.substring(4, 5));
		
		
		// Soru:
		String test = "Test 1234";   
		System.out.println(test.substring(2, 7)); // st 12
		
		System.out.println(test.substring(7, 9)); // 34

		// substring 2.kullanım şekli:
		System.out.println(test.substring(5));  // 5.karakterden sonrakini yazar
 
		
		// trim metodu
		//
		// Bir ifadenin başındaki veya sonundaki boşlukları siler
		String cumle = "  Hello Java ";
		System.out.println(cumle);
		cumle = cumle.trim();
		System.out.println(cumle);
		
		// Kullanıcı adı ve şifre isteyen uygulamalrda trim kullanamzsanız sıkıntı yaşarsınız
		// kulalnıcı adı ve şifre alırken mutlaka trim kullanın.
 

		// toUpperCase ve toLowercase metodları
		//
		// Metiniçindeki harflerin case'lerini değiştirir.
		metin = "Hello Java";
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		
		// toUpperCase(locale.ENGLISH)  // İngilizce'de => i => I
		// toUpperCase(new Locale("tr", "TR")   // Türkçe i => İ
		String ka = "admin", sifre = "admin";
		System.out.println(ka.toUpperCase(Locale.ENGLISH));
		System.out.println(sifre.toUpperCase(new Locale("tr", "TR")));
		
		
		
		// valueOf
		//
		// converts different types of values to String type
		int sayi = 2233;
		String ss = String.valueOf(sayi);
		System.out.println(ss);
		
		boolean flag = true;
		ss = String.valueOf(flag);
		System.out.println(ss);
		
		
		System.out.println("\n\n-----------------------------------------------\n\n");
		
		// equals metodu
		//
		
		// Örnek
		// DB'de ub şekilde tutuluyor:
		/*
		String uname = "gsungur@test.com";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kullanıcı adınızı giriniz: ");
		String userName = scanner.nextLine();
		
		// Emailler hep küçük harf olur o yüzden lowercase kullan.. Sonrada boşlukları trim et
		userName = userName.toLowerCase().trim();
		
		// YANLIŞ : !!! == kullanmayın
//		if (uname == userName)
//			System.out.println("Kullanıcı adı eşleşti");
//		else
//			System.out.println("Kullanıoc adı eşleşmedi !!!");
//		
		
		// Bu tarz durumlarda ekrana print edilip bakılır..
		System.out.println("DB kullanıcı adı :" + uname);
		System.out.println("Klavyeden girilen kullanıcı adı :" + userName);
		
		
		if (uname.equals(userName)) 
			System.out.println("Kullanıcı adı eşleşti");
		else
			System.out.println("Kullanıcı adı eşleşmedi !!!");
		*/
		
		
		// Dikkat:
		/*
		String x = "Ali";
		String y = "Veli";
		if (x==y)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		
		String z = "Ali";
		if (x==z)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		
		
		String w = "Ali ".trim();
		System.out.println(w);
		if (x==w)
			System.out.println("Eşit");
		else
			System.out.println("Eşit değil");
		*/
		// Çok dikkatli olmak gerekiyor !!!
		// String karşılaştırmalarında equals() metodunu kullanın !!
		// Sınavlarda çok soruluyor !
		
		
		// replace metodu
		// 
		String s2 = "Şahin yırtıcı bir kuştur";
		String s3 = s2.replace("ş", "s"); // küçük büyük harfleri ayı ayrı dğeiştirin..
		System.out.println(s3);
		
		// Nerelerde kullanılır:
		// 1. Örnek: Kira sözleşmesinde..
		String sozlesme = "Ali Kaya Güneş sokak Çankaya mah.adresindeki evini Ayşe Naz'a kiraladı..";
		String yeniSozlesme = sozlesme.replace("Ayşe Naz", "Veli Han");
		System.out.println(yeniSozlesme);
		
		// 2.kullanım : web url'lerde Türkçe karakterler sorun çıkarabilir.
		// Meslea https://www.isbasvuru.com/alikaya iş başvuru.pdf => Sıkıntı çıkar !
		// Web'de sorun çıkmaması için boşluk karakterini - ile dğeiştirin..
		String dosyaAdi = "https://www.isbasvuru.com/alikaya iş başvuru.pdf";
		dosyaAdi = dosyaAdi.replace(" ", "-").replace("ş", "s");				
		//dosyaAdi = dosyaAdi.replace("ş", "s");
		System.out.println(dosyaAdi);
		
		
		// contains metodu:
		//
		String yeniMetin = "Hava bugün çok yağmurlu";
		System.out.println("ağ harfleri varmı?: " + yeniMetin.contains("ağ"));
		System.out.println("tağ harfleri varmı?: " + yeniMetin.contains("tağ"));
		
		if (yeniMetin.contains("zağ")) {
			System.out.println("zağ kelimesi var");
		}
		else {
			System.out.println("zağ kelimesi yok");
		}
		
		
		// equalsIgnoreCase metodu
		//
		String ad1 = "Ali Kaya";
		String ad2 = "ali kaya";
		System.out.println(ad1.equals(ad2));
		System.out.println(ad1.equalsIgnoreCase(ad2));
		
		
		// startsWith
		//
		ad1 = "Ali Kaya";
		System.out.println(ad1.startsWith("A"));  // True
		System.out.println(ad1.startsWith("Al"));  // True
		System.out.println(ad1.startsWith("li"));  // False
		
		
		// endsWith
		// 
		ad1 = "Ali Kaya";
		System.out.println(ad1.endsWith("a")); // True
		System.out.println(ad1.endsWith("Kaya")); // True
		System.out.println(ad1.endsWith("a ")); // False
		
		
		// split metodu
		//
		// verilen ifadeye göre metni böler
		String liste = "Ali,Burcu,Ayşe,Zeynep,Kaan";
		String[] isimler = liste.split(",");
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);
		
		// Örnek:
		// Öğrencilerin listesi String olarak tutuluyor ben bunları ayrştırmak istiyorum:
		String ogrencilerStr = "Ali Kaya,123;Veli Öz,222;Zeynep Naz,343";
		String[] ogrenciler = ogrencilerStr.split(";");    // array = dizi
		System.out.println(ogrenciler[0]);  // Ali Kaya,123
		System.out.println(ogrenciler[1]);  // Veli Öz,222
		System.out.println(ogrenciler[2]);  // Zeynep Naz,343
		
		// Peki ilk öğrencinin okul numarasını ekrana yazdırın:
		//
		// System.out.println(ogrenciler[0].split(",")[1]);
		
		// ogrenciler[0] => "Ali Kaya,123"
		String[] ogrenci = ogrenciler[0].split(","); // "Ali Kaya" ve "123"
		System.out.println(ogrenci[0]);  // Ali Kaya
		System.out.println(ogrenci[1]); //  123
		
		// Veli'nin okul numarasını yazdıralım:
		String[] ogrenci1 = ogrenciler[1].split(","); // "Veli Öz" ve "222"
		System.out.println(ogrenci1[1]);
		//int ogrNo = Integer.parseInt(ogrenci1[1]);
		
		// Veli'nin sadece ismini yazalım (soyaismini yazmaytalım)
		String[] ogrenciAdSoyad = ogrenci1[0].split(" "); // => "Veli Öz"
		System.out.println(ogrenciAdSoyad[0]);
		
		
		// stringbuilder kullanımı
		//
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Merhaba");
		stringBuilder.append(" Dünya");
		stringBuilder.append(" Java");
	    System.out.println(stringBuilder);
		
		
	}

}
