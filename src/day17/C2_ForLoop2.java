package day17;

import java.util.Scanner;

public class C2_ForLoop2 {

	public static void main(String[] args) {
		/*
		- Kullanicidan bir tamsayi girmesini isteyin
		- sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		- Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		- Main method icinde Kullanicidan bir sinir deger isteyin
		- rakamlar toplami sinir degerden buyukse
		 "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		 degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		 yazdirin		
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen rakamlar toplamini bulmak icin pozitif bir sayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi<=0) {
			System.out.println("lutfen pozitif bir tam sayi giriniz");
			
		} else {
			
			rakamlarToplamiHesapla(sayi);
			
	
		}
		
	}

	public static int rakamlarToplamiHesapla(int sayi) {
	
			int rakamlarToplami=0;
			String sayi2=sayi+"";
			
			for (int i=1; i<=sayi2.length() ; i++) {  //BURAYI HOCAYA SOR <= yapinca calisti ben de
				rakamlarToplami+=sayi%10;
				sayi/=10;
				
				
			}
		
		return rakamlarToplami; //return genelde en sona yazilirmis
		
		
	}
	}
	


