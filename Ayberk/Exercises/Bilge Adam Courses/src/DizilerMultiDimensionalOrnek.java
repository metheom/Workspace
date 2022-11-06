public class DizilerMultiDimensionalOrnek {

	public static void main(String[] args) {
		
		// Örnek uygulama:
		// Bir sınıf listesi yapalım
		// İçerik şu şekilde olsun
		// SıraNo:  OgrenciNo  Ad   Soyad
		// 1	    101        Ali    Kaya
		// 2        102        Veli   Öz
		// 3        103        Zeynep Çalışkan
		
		String[][] sinifListesi = new String[3][4];  // 3 satır ve 4 sütundan oluşan bir çok boy. dizi oluşturudk
		
		// içine kayıtları atalım:
		sinifListesi[0][0] = "1";
		sinifListesi[0][1] = "101";
		sinifListesi[0][2] = "Ali";
		sinifListesi[0][3] = "Kaya";
		
		sinifListesi[1][0] = "2";
		sinifListesi[1][1] = "102";
		sinifListesi[1][2] = "Veli";
		sinifListesi[1][3] = "Öz";
		
		sinifListesi[2][0] = "3";
		sinifListesi[2][1] = "103";
		sinifListesi[2][2] = "Zeynep";
		sinifListesi[2][3] = "Çalışkan";
		
		// Öğrencileri ekrana yazdırmaya çalışalım:
		System.out.println("Öğrenci listesi:");
		System.out.println("\n------------------");
		System.out.println(sinifListesi[0][0] + " " + sinifListesi[0][1] + "  " + sinifListesi[0][2] + "  " + sinifListesi[0][3]);
		System.out.println(sinifListesi[1][0] + " " + sinifListesi[1][1] + "  " + sinifListesi[1][2] + "  " + sinifListesi[1][3]);
		System.out.println(sinifListesi[2][0] + " " + sinifListesi[2][1] + "  " + sinifListesi[2][2] + "  " + sinifListesi[2][3]);
		
		// 3 satır için sorun yok ancak 3000 satır olsa idi ne olacaktı?
		// Peki ne yapacağız?...
		
		// Çözüm: İç içe for döngüleri
		//
		System.out.println("\nÖğrenci listesi:");
		System.out.println("------------------");
		for (int i=0;i<3;i++)   // Satır satır yazdırdığım için ilk döngüm satır sayısı kadar olacak.
		{
			for(int j=0;j<4;j++)  // İkinci döngüm sütun sayısı kadar olmalı
			{
				System.out.print(sinifListesi[i][j] + "  ");
			}
			System.out.println();
		}
		
		
		
		// Code Refining:
		//
		// Yukarıda 3 ve 4 sayılaırnı kod içine gömmek doğru değil.
		// Bunun yerine length metodunu kullanalım..
		System.out.println("\nÖğrenci listesi:");
		System.out.println("------------------");
		for (int i=0;i<sinifListesi.length;i++) 
		{
			for(int j=0;j<sinifListesi[i].length;j++) 
			{
				System.out.print(sinifListesi[i][j] + "  ");
			}
			System.out.println();
		}
		
		
				
		/*
		for (int i=0;i<3;i++)   // Satır satır yazdırdığım için ilk döngüm satır sayısı kadar olacak.
		{
			System.out.println(sinifListesi[i][0] + " " + sinifListesi[i][1] + "  " + sinifListesi[i][2] + "  " + sinifListesi[i][3]);
		}*/
		
		
		// 3 Boyutlu dizi
		int[][][] dizi3 = new int[3][3][3];
		dizi3[0][0][0] = 23;
		dizi3[0][0][1] = 40;
		System.out.println(dizi3[0][0][0]);
		

	}

}
