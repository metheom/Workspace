package Homework;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		
		//Soru3 (40 puan)
	    
	    //Tahmin oyunu 
		//rastGele bir sayı oluşturcaz
	    //rastgele sayı oluşturma--> int rastGeleSayi = (int) (Math.random() * 100);
		// o sayıyı tahmin etmeye çalışcaz
		//tahmin ettiğimiz sayı bulcağımız sayıdan fazla ise tahmini azalt yazdırın
		// az ise tahmini artır yazalım.
		//sayıyı bulduğumuzda kaçıncı seferde bulduğumuzu yazdıralım
	    //Her yanlış tahminde döngüden çıkmadan bize tekrar tahminimizi sorsun .
	    
	    //while ile çözüm
	
		
        Scanner scan = new Scanner(System.in);
	    
        int rastGeleSayi = (int)(Math.random() * 100);
        
        int sayac = 1 ;
        
        while (true) {
        	System.out.println("Bir sayi giriniz");
        	
        	int tahmin = scan.nextInt();
        	
        	if (tahmin==rastGeleSayi) {
        		System.out.println("Sayiyi dogru tahmin ettin");
        		break; 
        	}
        	else if (tahmin>rastGeleSayi) {
        		System.out.println("Tahmini azalt");
        	}
        	else 
              System.out.println("Tahmini Artir");
        	sayac++;
        }
         System.out.println(sayac);
         
	}

}
