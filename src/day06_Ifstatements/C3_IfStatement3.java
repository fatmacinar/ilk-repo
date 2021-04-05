package day06_Ifstatements;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		// kullanicidan gun isminin ilk harfini isteyin ve 
		// harfe uygun olan gun isimlerini yazdirin
		//c--> cuma,cumartesi
		//s--> sali
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen gun isminin ilk harfini yaziniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		System.out.println(ilkHarf); 
		
		//bu satir itibariyle girilen Stringin ilk karakterini girmis olduk
		// p, s, c,
		
		if(ilkHarf=='p'|| ilkHarf=='P') {
			System.out.println("pazar, pazartesi veya persembe");
		}
		
		if (ilkHarf=='s' || ilkHarf=='S') {
			System.out.println("sali");
		}
		
		if (ilkHarf=='c'|| ilkHarf=='C') {
			System.out.println("carsamba,cuma,cumaretsi");
		}
		
		if(ilkHarf!='p' && ilkHarf!='P' &&ilkHarf!='s' && ilkHarf!= 'c' && ilkHarf!='C') {
			System.out.println("lutfen gecerli bir harf giriniz");
		}
	}

}
