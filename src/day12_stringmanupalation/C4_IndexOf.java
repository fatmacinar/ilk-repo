package day12_stringmanupalation;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
		// indexof() methodu bize istedigimiz karakter(lerin) indexini dondurur
		
		String str = "Java ogren, is sahibi ol";
		
		System.out.println(str.charAt(6)); // g
		
		System.out.println("char arama"+str.indexOf('g') ) ; //6
		
		System.out.println("string arama" +str.indexOf("g"));  // 6
		
		System.out.println("string kelime arama " + str.indexOf("is"));
		
		System.out.println("birden fazla varsa" + str.indexOf("i")); //ilk buldugunun indexini getirir
		
	    System.out.println("baclangic indexi ile "+   str.indexOf('a' , 4));
	    
	    System.out.println("olmayan harf" + str.indexOf("ali")); //-1 veriyor
	    
	    //kulanicidan bir cumle isteyin 
	    // harf duyarliligi olmadan (case sensetive) java kelimesi icerip icermedigini yazdirin.
	    
	    Scanner scan =new Scanner(System.in);
	    
	    System.out.println("lutfen bir cumle giriniz");
	    
	    String cumle = scan.nextLine().toLowerCase();
	    
	   // int sonuc =cumle.indexOf("java"); // java varsa, ilk java kelimesinin indexini döndürür.
	    								  // java yoksa, -1
	    
	  //  System.out.println(sonuc==-1 ? "java icermiyor" : "java iceriyor");
	    
	    if (cumle.indexOf("java")>=0) { //java kelimesinin indexinin 0 veya daha buyuk oldugunu kontrol ediyor
	    	System.out.println("cumle java iceriyor");
			
		} else {
			System.out.println("cumle java icermiyor");

		}
	    
	    
		scan.close();
	}

}
