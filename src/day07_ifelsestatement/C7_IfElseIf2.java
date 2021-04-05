package day07_ifelsestatement;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// Kullanicadan iki sayi isteyin
		// sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin
		// sayilarin ikisi de negatif ise sayilarin carpimini yazdirin
		// sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde islem yapamazsiniz" deyin
		// sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
	if (sayi1==0 || sayi2==0) {      
		System.out.println("sifir carpmaya gore yutan elemandir");
		
	} else if(sayi1>0 && sayi2>0){   
		System.out.println("sayilarin toplami:" + (sayi1+sayi2));
		

	}else if(sayi1<0 && sayi2<0) {    
		System.out.println("sayilarin carpimi:" + sayi1*sayi2); // carpma onceligi oldugu icin () gerek yok
		
	}else {
		System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
	} // if else de butun olsaliklar yazilir bir tanesi mutlaka calisir
		
		scan.close();
	} 
	

}



