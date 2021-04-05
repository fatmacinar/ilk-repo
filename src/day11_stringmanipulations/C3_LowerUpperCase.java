package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// str.toLowerCase()  verilen Stringin tamamini kucuk harfe cevirir
		// str.toUpperCase verilen #Stringin tamamini buyuk harfe cevirir
		
		
		String str = "Techproeducation";
		
		// buyuk harfle yazdirmak istersek ;
		System.out.println(str.toUpperCase());   //TECHPROEDUCAT?ON
		
		// buyuk harfe cevirmek istersek ;
		
	     str=str.toUpperCase();  // bu satirdan sonra kalici olarak str Buyuk harflerden olusan bir String olustu
	     
	  System.out.println(str);
	  
	  System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));
	  
	
	  
	  
	}
	

}
