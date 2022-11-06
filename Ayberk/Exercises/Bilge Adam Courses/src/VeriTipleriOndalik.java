public class VeriTipleriOndalik {

	public static void main(String[] args) {
		
		// float veri tipi: 4 Byte    
		// Precision(noktadan sonraki hassasiyet): 7 decimal(ondalık) digits
		// Bilimsel uygulamalarda kesinlikle kullanılmaz
		// fizikçiler ve kimyacılar hesaplamalarında float kullanmazlar
		float floatValue = 1.7f;
		System.out.println("Float value: " + floatValue);
		System.out.println("Float Min: " + Float.MIN_VALUE);
		System.out.println("Float Max: " + Float.MAX_VALUE);
		
		// Float.MAX_VALUE: 340,282,346,638,528,860,000,000,000,000,000,000,000.000000
		floatValue = 22;
		floatValue = 22.2F;  // f yazmazsanız hata verir

		
		// double 
		// 8 Byte
		// Precision(noktadan sonraki hassasiyet): 15 decimal(ondalık) digits
		double doubleValue = 1.2;
		doubleValue = 2323232323232323243.2233235657899765;
		System.out.println("Double Min: " + Double.MIN_VALUE);
		System.out.println("Double Max: " + Double.MAX_VALUE);
		
		doubleValue = 2345.55778;
		doubleValue = 12.334e8;
		System.out.println(doubleValue);
		
		// örnek
		doubleValue = 23.123456789;
		floatValue = (float) doubleValue;
		System.out.println(floatValue);
		
		floatValue = 1.1234567F;
		System.out.println(floatValue);
		
		String kusurat = String.format("%.2f", floatValue);
		System.out.println(kusurat);
		
		final double PI = 3.14;  // Başında final kullanılırsa PI artık değişken olmaz, sabit(constant) deriz. 
		
		
		
	}

}
