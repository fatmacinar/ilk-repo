package day06_Ifstatements;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		// kullanicidan bir sayi isteyin ve sayinin tek veya 
		//oldugunu yazdirin

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi=scan.nextInt();
		
		// 153%2==0 sayi cift
		//153 %2==1 sayi tek
		
		if (sayi %2==0) { 
			System.out.println("girdiginiz sayi cift sayidir");
				
		}
		
		if (sayi%2==1 || sayi%2==-1) {
			
			System.out.println("girdiginiz sayi tek sayi");	
		}
		
		System.out.println(sayi%2);
		System.out.println("katildiginiz icin tesekkur ederiz");
		
		scan.close();
	}

}
