package Homework;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		
		//Soru2 (40puan)
		//Switch case ile 
		//input --> mehmet
		//input--> hangi işlemi yapmak istiyosunuz
		/*
		System.out.println("1- Kelimeleri Büyük Harf Yap");
	    System.out.println("2- kelimenin harflerini Küçük yap");
	    System.out.println("3- kelimenin harflerinin arasına ? koy");
	    //mehmet m?h?m?e?t
	    System.out.println("4- kelimenin başındaki ve sonundaki boşlukları silin");
	    // mehmet   
	    System.out.println("5- kelimenin içindeki bütün a harflerini ? ile değiştirin");
	    //replace replaceAll("a", ?")
	    System.out.println("6- kelimenin ilk üç indexinin alıp sonuna ... koyun");
	    // mehmet
	    //meh...
	    //substring()
        */
	    
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Bir isim giriniz");
	    
	    String isim = scan.nextLine();
	    
	    System.out.println("Bir secim giriniz");
	    
	    int secim = scan.nextInt();
	    
	    switch (secim) {
	    
	    case 1: { 
	    	System.out.println(isim.toUpperCase()); 
	    	break;}
	
	    case 2:{
	    	System.out.println(isim.toLowerCase());
	    	break;}
	    
	    case 3:{
            System.out.println(isim.replace("", " ").trim().replace(" ", "?"));
            break;
        }
        case 4: {
            System.out.println(isim.trim());
            break;
        }
        case 5: {
            System.out.println(isim.replaceAll("a", "?"));
            break;
        }
        case 6: {
            System.out.println(isim.substring(0,3).concat("..."));
            break;
        }
        default: {
            System.out.println("Yanlis secim yaptiniz !");
        }
	    
	    
	
	    
	    
	    
	}
	}
	}