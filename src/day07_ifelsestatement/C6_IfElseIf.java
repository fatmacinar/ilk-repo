package day07_ifelsestatement;

import java.util.Scanner;

public class C6_IfElseIf {

	public static void main(String[] args) {
	   // kullanicidan 100 uzerinden notunu isteyin. notu harf sistemine cevirip yazdirin
		// 50'den kucukse 'D', 50-60 arasi 'C', 60-80 arasi 'B', 80'in uzeri ise 'A'
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfen notunuzu sayi olarak giriniz");
		double not= scan.nextDouble();
		
		if (not<0 || not>100) { // istenmeyen durum
			System.out.println("lutfen gecerli bir not giriniz");
			
		} else if (not<50){ // notumuz 0<= not< =100
			System.out.println("notunuz D");

		}else if(not<60) { //50 ile 100 arasinda
			System.out.println("notunuz C");
			
		}else if(not<80){
			System.out.println("notunuz B");
			
		} else { //80 - 100 arasinda
			System.out.println("notunuz A");
			
		}
	
	scan.close();
	}
	
	

}
