package day11_stringmanipulations;

public class C1_Concatenation {

	public static void main(String[] args) {
		// Concatenation: java da + islemi yapilirken eger toplanan ifadelerden biri veya her ikisi "string" ise java toplama degil
		// ""birlestirme"" yapar

		System.out.println(15+ 20+ "merhaba");  // 35merhaba
		
		System.out.println("merhaba"+ 15+ 20);  // merhaba1520
		
		System.out.println("merhaba" +(15+20)); // merhaba35
		
		System.out.println("merhaba"+ 15*20);    // merhaba300
		
		
		
		String str1 = "hello";
		String str2 = "world";
		
		// eger hello world yazdirmak istersek 
		
		System.out.println(str1+ " " +str2);
		// str.concat(str2) methodu str1 in sonuna str 2 yi ekler
		
		System.out.println(str1.concat(str2)); 
		System.out.println(str1.concat(" ").concat(str2));  // hello world
		System.out.println(str1.concat(" " +str2));  // hello world
		
		
		
		  
	}

}
