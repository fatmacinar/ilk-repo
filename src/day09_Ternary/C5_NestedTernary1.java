package day09_Ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		// kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
		// girilen degerlere gore dikdortgenin kare olup olmadigini yazdirin

		
			Scanner scan=new Scanner(System.in);
			System.out.println("lutfen kontrol icin dikdortgenin kenar uzunluklarini giriniz");
			
			double kenar1=scan.nextDouble();
			double kenar2=scan.nextDouble();
			
			System.out.println(kenar1==kenar2 ? "kare" : "kare degil");
			scan.close();
	}

}
