public class AlgortimaPerformans {

	public static void main(String[] args) {
		
		int islemAdedi = 100000;
		
		// Algortima-1:
//		long startTime = System.currentTimeMillis();
//		// Basit bir Algoritma:
//		String metin = "Hello";
//		for (int i=0;i<islemAdedi;i++) {
//			metin = metin + i;
//		}
//		long endTime = System.currentTimeMillis();
//		System.out.println("Algoritmamın İşlem süresi: " + (endTime-startTime) + " milisayine");
		
		
		 
		// Algortima-2:		
		long startTime = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		for(int i=0;i<islemAdedi;i++) {
			stringBuilder.append(i);
		}		
		long endTime = System.currentTimeMillis();
		System.out.println("Algoritmamın İşlem süresi: " + (endTime-startTime) + " milisayine");


		
	
		
	}

}
