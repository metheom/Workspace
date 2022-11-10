package Homework;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		
		//Soru1(20 puan)
		//kullanıcıdan bir kelime alın
		// eğer kelime a ile başlıyorsa kelimenin son indexini ekrana bastırın
		
		//eğer kelime b ile başlıyorsa ilk indexi "@" ile değiştirin
		
		//eğer a veya b ile başlamıyorsa kelimenin birinci indexini bastırın
		
		//replace("ilk index", "@")
		//charAt()
		//kelime.startsWith("a")
		//length()
		//********************************************
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Bir kelime yazin");
		
        String kelime = scan.nextLine();

        if(kelime.charAt(0)=='a') {
            System.out.println(kelime.charAt(kelime.length()-1));
        }
        else if (kelime.charAt(0)=='b') {
            System.out.println(kelime.replace(kelime.charAt(0) , '@'));
        }
        else { 
            System.out.println(kelime.charAt(0));
           
        }
	}

}
