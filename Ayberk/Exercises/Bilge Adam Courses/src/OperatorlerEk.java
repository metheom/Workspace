public class OperatorlerEk {

	public static void main(String[] args) {
		
		int sayisalDeger = 4;
		sayisalDeger = sayisalDeger + 1 ;
		System.out.println(sayisalDeger);

		sayisalDeger += 1;		
		System.out.println(sayisalDeger);

		sayisalDeger++;
		System.out.println(sayisalDeger);
		
		sayisalDeger--;
		System.out.println(sayisalDeger);
		
		sayisalDeger += 5;		
		System.out.println(sayisalDeger);
				
		// += -= *= /= %=
		
		sayisalDeger -= 2;		
		System.out.println(sayisalDeger);
		
		sayisalDeger *= 2;
		System.out.println(sayisalDeger);
		
		sayisalDeger /= 3;
		System.out.println(sayisalDeger);
		
		sayisalDeger %= 3;
		System.out.println(sayisalDeger);
		
		System.out.println("\n\n----------------------------------\n\n");
		
		/*
		int a = 3;
		int b = a++;  		
		System.out.println("a: " + a + " b: " + b);
		
		a = 3;
		b = ++a;
		System.out.println("a: " + a + " b: " + b);
		*/
		
		int a = 3;
		int b = 4;
		int z = 5; // 3  +  5  + 4
	//	int toplam = a++ + ++b + --z;
	//	System.out.println("toplam: " + toplam);
	//	System.out.println("a: " + a + " b: " + b + " z: " + z);
		
		// a:3  b:5  z:5 
		           //  2 + 4   +  5  - 5   + 2
		int toplam = --a + b++ + z++ - --z + a++; 
		System.out.println("toplam: " + toplam);
		System.out.println("a: " + a + " b: " + b + " z: " + z);
		
		
	}

}
