package day07_ifelsestatement;

import java.util.Scanner;

public class C2_IfElse1 {

	public static void main(String[] args) {
		//kullanicidan dikdortgenin kenar uzunluklarini alin
		// uzunluklar esit ise kare degilse kare degil
		
		Scanner scan=new Scanner (System.in);
		System.out.println("lutfen dikdortgenin kenar uzunluklarini giriniz");
		
		double kenar1= scan.nextDouble();
		double kenar2= scan.nextDouble();
		
		if (kenar1==kenar2) { 
			System.out.println("kare");
			
		} else { 
			System.out.println("kare degil");

		}
		
	}

}
