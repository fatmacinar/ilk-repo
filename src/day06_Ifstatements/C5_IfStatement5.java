package day06_Ifstatements;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		// kullanicadan bir diktortgenin iki kenar uzunlugunu alin
		//kenar uzunluklari esitse 'kare'
		//esit degilse 'dikdortgen' yazdirin
		
		Scanner scan =new Scanner (System.in);
		System.out.println("lutfen diktortgenin iki kenarini giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
    if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
			System.out.println("kare");
		}
    if (kenar1>0 && kenar2>0 && kenar1!=kenar2) {
		System.out.println("diktortgen");
	}
  
    if (kenar1<=0 || kenar2<=0 ) {
    	System.out.println("lutfen gecerli uzunluk giriniz");
		// bug: yazilimdaki hatalara denir
	}

    
    
	}

}
