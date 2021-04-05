package day07_ifelsestatement;

import java.util.Scanner;

public class C1_IfStatement {

	public static void main(String[] args) {
		//kullanicidan bir tam syi isteyelim 
		// sayi + ise "sayi pozitif" yaqzdir
		//sayi 100'den kucukse "kucuk sayi" yazdir
		// sayi 1000'den buyukse "buyuk sayi" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi= scan.nextInt();
		
		if (sayi>0) {	
			System.out.println("sayi pozitif");
		}
		
		if (sayi<100) {
			System.out.println("kucuk sayi");	
		}
		
		if (sayi>1000) {
			System.out.println("buyuk sayi");	
		}
	}

}
