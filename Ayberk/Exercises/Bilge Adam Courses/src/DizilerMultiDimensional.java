public class DizilerMultiDimensional {

	public static void main(String[] args) {
	
			int[] tekBoyutluDizi = new int[4];   // { 0, 0, 0, 0 } => Tekj boyutlu dizi
			
			// Çok boyutlu dizi (matris de denir)
			int[][] cokBoyutluDizi = new int[2][3];   // 2 satır 3 sütunlu matris/dizi
													  // { {0,0,0}, {0,0,0} }
			// 0 0 0
			// 0 0 0

			cokBoyutluDizi[0][0] = 1;
			// 1 0 0
			// 0 0 0
			
			cokBoyutluDizi[0][1] = 2;
			// 1 2 0
			// 0 0 0
			
			cokBoyutluDizi[1][2] = 8;
			// 1 2 0
			// 0 0 8

			System.out.print(cokBoyutluDizi[0][0] + " ");			
			System.out.print(cokBoyutluDizi[0][1] + " ");
			System.out.println(cokBoyutluDizi[0][2] + " ");
			
			System.out.print(cokBoyutluDizi[1][0] + " ");
			System.out.print(cokBoyutluDizi[1][1] + " ");
			System.out.println(cokBoyutluDizi[1][2] + " ");
			
			
			
			// Çok boyutlu dizi luşturma 2. Yöntemi:
			//
			int[][] cokBoyutludizi2 = { {5,10,15}, {20,25,30} };
			// 5 10 15
			// 20 25 30
			System.out.println(cokBoyutludizi2[0][0]);
			System.out.println(cokBoyutludizi2[1][2]);			
			// Not: Sütun ve satır saymaya dizilerde mutlaka 0(sıfır)'dan başlayın !
			
			
			
			
			
			
	}

}
