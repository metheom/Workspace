public class VeriTipleriOrnek {

	public static void main(String[] args) {
		
		
		int x = 10;
		int y = 3;
		
		int result = x / y;
		int kalan = x % y;
		System.out.println("result: " + result + "  kalan: " + kalan);
		
		double res = x / y;
		System.out.println("result: " + res + "  kalan: " + kalan);
		
		// Çözüm
		double xx = 10;
		double yy = 3;
		res = xx / yy;
		System.out.println("result: " + res + "  kalan: " + kalan);
		
		res = x / yy;
		System.out.println("result: " + res + "  kalan: " + kalan);
		
		res = (double) x / y;
		System.out.println("result: " + res + "  kalan: " + kalan);
				
		res =  1D * x / y;
		System.out.println("result: " + res + "  kalan: " + kalan);				
		
		
	}

}
