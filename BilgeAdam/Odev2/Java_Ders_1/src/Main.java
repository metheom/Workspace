import OOP_Class.Product;
import OOP_Class.Ogrenci;

import java.util.Scanner;

import Metodlar.Metodlar;

public class Main {

	public static void main(String[] args) 
	{
		//	System.out.println(); Java
		// 	Console.Writeline(); C#
		
		// NesneninTipi Nesneninİsmi = new NesneninTipi(); => Nesne oluşturma
		
//		Product product1= new Product();
//		product1.ProductName="Hp Pavilion Laptop";
//		product1.Price=600.5f; // Float değişkene değer atarken casting işlemi uygulanır.(float)
//		product1.Seller="Vatan Bilgisayar";
//		
//		Product product2= new Product();
//		product2.ProductName="Monster Abra A6";
//		product2.Seller="Monster Türkiye";
//		product2.Price=450f;
//		
//		Product product3=new Product("Asus ROG","Teknosa",500f);
//		
//	
//		
//		System.out.println(product3.ProductName);
//		
//		
//		
//		System.out.println("-----------------");
//		
//		System.out.println(product1.ProductName);
//		System.out.println(product1.Seller);
//		System.out.println(product1.Price);
//		
//		System.out.println("-----------------");
//		
//		System.out.println(product2.ProductName);
//		System.out.println(product2.Seller);
//		System.out.println(product2.Price);
		
		
		var ogrenci1= new Ogrenci();
		ogrenci1.OgrenciAd="Mert";
		ogrenci1.Yas=27;
		ogrenci1.Vize=45;
		ogrenci1.Final=80;
		
		System.out.println(ogrenci1.Yas);
	}
	
	
	
	
}
