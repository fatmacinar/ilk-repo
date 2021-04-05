package day02scanner;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		
		// 1.adim scanner objesi olusturacagiz
		Scanner scan = new Scanner(System.in);
		
		// 2. adim: kullaniciya bir mesaj yazin
		
		System.out.println("karenin bir kenar uzunlugunu girin");
		
		//3. adim: kullanicinin konsola girdigi degeri 
		//programimiza alacagiz

	double kenar=scan.nextDouble(); 
	
	
	System.out.println(kenar*kenar);
	
	}

}
