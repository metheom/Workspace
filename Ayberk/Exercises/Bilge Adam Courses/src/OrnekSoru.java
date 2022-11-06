public class OrnekSoru {

	public static void main(String[] args) {
		
		// Microsoft SWAP Numbers Exam Questions:
		// sayi1 ve sayi2 sayilarının değerlerini değiştirin, 3.bir değişken kullanmadan yapın. 
		int sayi1 = -5;
		int sayi2 = 3;
		int temp;
		
		/*
		// 1. Çözüm (Basit)
		temp = sayi1;
		sayi1 = sayi2;
		sayi2 = temp;
		System.out.println(sayi1 + "  " + sayi2);
		*/

		// 2. Çözüm (Zor olan)
		sayi1 = sayi1 + sayi2;
		sayi2 = sayi1 - sayi2;
		sayi1 = sayi1 - sayi2;
		
		System.out.println(sayi1 + "   " + sayi2);
		
		
	}

}
