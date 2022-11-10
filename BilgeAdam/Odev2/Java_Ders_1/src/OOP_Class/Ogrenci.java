package OOP_Class;

public class Ogrenci // Kapsülleme için oluşturuldu.
{

	public String OgrenciAd;	
	public int Yas;
	public int Vize;
	public int Final;
	private float Ortalama;
	
	public float getOrtalama() {
		return (this.Vize + this.Final / 2);
	}
	
	public void setOrtalama(float ortalama) {
		Ortalama = ortalama;
	}
	
}