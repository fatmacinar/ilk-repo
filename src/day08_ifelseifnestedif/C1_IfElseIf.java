package day08_ifelseifnestedif;

import java.util.Scanner;

public class C1_IfElseIf {

	public static void main(String[] args) {
		// Kullanicidan gun ismini yazmasini isteyin. 
		//Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini ilk harf buyuk diger ikisi kucuk olarak yazdirin, 
		//gun  ismi  gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen gun ismini giriniz");
		
		String gunIsmi= scan.nextLine(); // girilen tum yaziyi kucuk harfe cevirdik.
		
		// next(): sadece ilk kelimeyi alir (ilk space kadar olan kismi alir)
		//nextLine(): o satirin tamamini alir.
		
		if (gunIsmi.equals("pazar") || gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("Paz");
			
		} else if (gunIsmi.equalsIgnoreCase("sali")) {
			System.out.println("Sal");
			
		} else if( gunIsmi.equalsIgnoreCase("Carsamba")) {
			System.out.println("Car");
			
		} else if(gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("Per");	
			
		} else if(gunIsmi.equalsIgnoreCase("cuma") || gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("Cum");
			
		} else {
		   System.out.println("lutfen gecerli bir gun ismi giriniz");
		}
		
		//equalsIgnorCase(): metodu iki stringin buyuk kucuk karf hassasiyeti olmadan esit olup olmadigini kontrol eder.
		
        scan.close();
	}

}
