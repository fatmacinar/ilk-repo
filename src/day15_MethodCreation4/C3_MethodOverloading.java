package day15_MethodCreation4;

public class C3_MethodOverloading {

	public static void main(String[] args) {
		// java da ayni isimle birden fazla method olusturulursa buna overloading denir
		//overloading yapabilmek icin method signature larin farkli olmasi gerekir
		// method Signature = isim+parametre sayisi+ parametre data turu
		// birbirini kapsayan data türleri oldugunda java en optimum cozumu uretir
		// (tamamen uyan method varsa o methodu calsitirir, tamamen uyan yoksa
		//en uygun methodu kullanir)
		// eger kapsayan bir method ta bulamazsa cte verir
		
		
		
		
		
		toplama(2,5); //

	}
	public static void toplama (int sayi1, int sayi2) {		
		System.out.println("integer method sonucu : " +(sayi1+sayi2));
		
	}
	
     public static void toplama (double sayi1, double sayi2) {		
		System.out.println("double method sonucu : " +(sayi1+sayi2));
		
}
     
     public static void toplama (int sayi1, double sayi2) {		
 		System.out.println("integer/double method sonucu : " +(sayi1+sayi2));
 		
}
      
     public static void toplama (char char1, char char2) {		
 		System.out.println("Char method sonucu : " +(char1+char2));	
 		
}
     
     public static void toplama (String str1, String str2) {		
 		System.out.println("String method sonucu : " +(str1+str2));
	}

}
