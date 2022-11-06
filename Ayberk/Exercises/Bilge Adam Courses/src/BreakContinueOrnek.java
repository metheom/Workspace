public class BreakContinueOrnek {

	public static void main(String[] args) {
		
		/*
		for(int i=0;i<10;i++) 
		{
			System.out.println(i);
		}
		*/
		
		// break kullanımı:
		//
		// Döngünün akışını durdurur ve for loop'un } sonrasındaki koda gider.
		for(int i=0;i<10;i++) 
		{
			if (i==5) 
			{
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("\n\n---------------------\n\n");
		// continue kullanımı:
		//
		// Döngünün bir sonraki indeksle devam etmesini sağlar.
		for(int i=0;i<10;i++) 
		{
			if (i==5)
			{
				continue;
			}
			System.out.println(i);
			
		}
		int x = 5;		
		x = x + 7;
		
		System.out.println("\n\n---------------------\n\n");
		
		// Örnek - while loop ve break kullanımı:
		//
		int sayac = 0;
		while (sayac<10) 
		{
			if (sayac == 5) 
			{
				break;  // breaks the loop
			}			
			System.out.println(sayac);
			sayac++;
		}
		
			
		
		
		
		// Soru:
		//
		// Bir dizi içindeki sayılardan herhangi biri 17'nin katı olduğu durum varsa ekrana mesaj yazdırın.
		int[] dizi = { 12, 40, 70, 34, 50, 11, 100 };
		boolean arananSayiVarmi = false;  // isFound = false;
		for(int i=0;i<dizi.length;i++) 
		{
			if (dizi[i]%17 == 0) {
				arananSayiVarmi = true;   // isFound = true
				break;
			}
		}
		
		if (arananSayiVarmi == true) // = if (arananSayiVarmi)
		{
			System.out.println("17'nin katı bulundu.");
		}
		else 
		{
			System.out.println("17'nin katı bulunmadı");
		}
		
		// Yukardaki if bloğu ile aşağıdaki aynıdır:
		if (arananSayiVarmi)
		{
			System.out.println("17'nin katı bulundu.");
		}
		else 
		{
			System.out.println("17'nin katı bulunmadı");
		}
		
		
		// Bir örnek:
		//
		int z = 9;
		boolean flag = z>5;
		if (flag)
		{
			System.out.println("5'ten büyük");
		}
		
		int y = 9;
		flag = z>5 && y<100;
		   // true && true  => true
		if (flag)
		{
			System.out.println("Doğru");
		}
		else
		{
			System.out.println("Yanlış");
		}
			
		int zz;
		if (flag)
		{
			zz = 200;
		}
		
		
	}

}
