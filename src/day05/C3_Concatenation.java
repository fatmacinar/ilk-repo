package day05;

class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation: java da birden fazla Stringi + isareti ile toplarsaniz,
		//java bu Stringleri yan yana yazar.
		String str1="Java";
		String str2="Guzeldir";
		System.out.println(str1 + str2); // Java Guzeldir
		// eger arada bosluk birakmak istersek araya birde bosluk yazmamiz gerek.
		
		System.out.println(str1+ " "+ str2);
		
		System.out.println(str1+' '+ str2);  // bunun bi tehlikesi varmis
		
		// guzeldir java
		
	    System.out.println(str2+ " "+ str1); // concatenation
	    
	    int sayi1= 5;
	    int sayi2=4;
	    
	    //verilen degiskenleri kullanarak konsolda dokuz yazdirin
	    
	    System.out.println(sayi1+sayi2); // matematiksel islem
	    
	    System.out.println(sayi1+sayi2+" "+str1+" "+ str2);
		
		System.out.println(str1+" "+str2+" "+sayi1+sayi2);
		
		// java guzeldir 1 yazdirin
		
		System.out.println(str1+ " "+ str2+ 1);  //??
		
		System.out.println(str1+ str2 + (sayi1-sayi2));
		
		System.out.println(sayi1+sayi2+" "+str1+ str2);// Charda 41 oluyor "" dogru yapiyor
		
		//Java matematiksel bir islem yapilirken char data turunden bir degerle karsilasirsa
	// o char in ascii degerini alir
		
		System.out.println(sayi1+sayi2+str1+' '+str2); 
		// ilk chara kadar string oldugu icin 
		//concenation yapar.
		
		System.out.println(str1+str2+sayi1*sayi2);
		
		//kural 1:eger toplanan degerlerden bir tanesi bile String ise toplama degil 
		//concetation yapar
		
		//kural2: eger toplanan degerlerin ikiside matematiksel ise toplar
		//kural3: eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler belirlenip
		// o islemler icin paranteuz kullanilabilir
		
	    // kural4: matematiksel bir islemde char degisken kullanirlirsa
		// chari askii degeri alir
	
	}
	
	
	

}
