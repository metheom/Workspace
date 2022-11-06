import java.util.Scanner;

public class ScannerKullanimiEkBilgi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//int sayi = scanner.nextInt();
		//System.out.println(sayi);
		
		/*
		double sayi =scanner.nextDouble();
		System.out.println(sayi);
		
		float sayi2 =scanner.nextFloat();
		System.out.println(sayi2);
		*/
		
		/* Örnek 1:
		// sıkıntısız çalışır:
		String s;
		System.out.println("Ad girin: ");
		s = scanner.nextLine(); 
		System.out.println("Adınız: " + s);
		
		System.out.println("yaş giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println("yaş: " + sayi);
		*/	
		
		
		// Örnek 2:
		
		System.out.println("yaş giriniz: ");
		int sayi = scanner.nextInt();
		System.out.println("yaş: " + sayi);
		
		scanner.nextLine();  // skip the newline character
		
		String s;
		System.out.println("Ad girin: ");
		s = scanner.nextLine(); 
		System.out.println("Adınız: " + s);
		

		
		
	}

}
