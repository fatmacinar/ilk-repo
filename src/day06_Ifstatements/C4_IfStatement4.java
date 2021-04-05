package day06_Ifstatements;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		//kullanicidan gun ismini isteyin
		//Girilen gun haftaici veya haftasonu oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz");
		
		String gunAdi=scan.next().toLowerCase();
		//eger Stringlerde esitllik sorguluyorsak == kullanmmamaliyiz!!
		//Stringlerde esit olma durumunu sorgulamak icin equal metodu kullanilir

		if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
			System.out.println("haftasonu");
			
		}
		
		if (gunAdi.equals("pazartesi") || gunAdi.equals("sali") ||gunAdi.equals("carsamba") || 
				gunAdi.equals("persembe")|| gunAdi.equals("cuma"))  {
			System.out.println("haftaici");
			
			//bu kodda gun ismi yanlis yazilmissa olusacak durum yok
			scan.close();
		}
		
		
	}
	
	
	

}
