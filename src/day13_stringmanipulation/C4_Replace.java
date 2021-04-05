package day13_stringmanipulation;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
		// kullanicidan bir cumle isteyin
		// cumledeki tum bosluklari silin
		// tum a'larin yerine e yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String str=scan.nextLine();
		
		str=str.replace(" ", "");
		str=str.replace("a", "e");
		
		System.out.println(str); //atama yapmazsaniz, manipulation str i degistirmez
		//eger atama yaparsak str kalici olarak degistigi icin bir daha orjinal str a ulasamam
		// bunun icin kullanicidan aldigimiz str a degil yeni bir string atamak daha mantiklidir
		
		System.out.println("lutfen bir cumle daha giriniz");
		String str2=scan.nextLine();
		
		System.out.println(str2.replace(" ", "").replace('a', 'e'));
		
		//hem a hem de e nin yerine i yazalim
		
	    System.out.println(str2.replace("a","i").replace('e', 'i') );
	    // hem a hem de e nin yerine i yazalim buyuk kucuk harf gozetmeksizin
	    
	    System.out.println(str2.toLowerCase().replace("a", "i").replace ('e','i'));
	
		
	}

}
