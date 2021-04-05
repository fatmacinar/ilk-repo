package day13_stringmanipulation;

import java.util.Scanner;

class C1_Contains {

	public static void main(String[] args, int sondami) {
		// kullanicidan bir cumle ve aramak istedigi bir string isteyin
		// cumle stringi iceriiyorsa "basarili"; degilse "basarisiz" diyelim.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz" );
		String cumle=scan.nextLine().toLowerCase(); // Java guzel
		
		
		System.out.println("lutfen aramami istediginiz stringi giriniz");
		String aranan=scan.nextLine().toLowerCase();  // java
		
		
	    //bu islemin sonucu boolean, benim bunu yaziya cevirmem lazim
		 
		System.out.println(cumle.contains(aranan) ? "basarili" : "basarisiz");
		
		//kullanicidan mail adresini isteyin. mail adresi @gmail.com iceriyorsa "mailiniz kaydedildi"
		//yoksa "lutfen adresinizi giriniz" yazdirin
		

		System.out.println("lutfen mail adresinizi giriniz");
		String email=scan.next();

		// eger gmail.com un en sonda oldugunu kontrol etmek istersek;
	
		int sondami1 = email.indexOf("@gmail.com", email.length()-10); // index olarak length() -10 yazarsam.
		// eger gmail.com ile bitiyorsa bu islemin sonucu bir index olur (int)
		// eger gmail.com ile bitmiyorsa -1 



		
		if (email.contains("@gmail.com") && sondami1 !=-1)
		{
			System.out.println("mailiniz kaydedildi");
			
		} else {
			System.out.println("lutfen gecerli gmail adresinizi giriniz");

		}
		
	}
}
