package day03;

import java.util.Scanner;

public class C2_Scanner {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen isminizi giriniz");
		 char ilkHarf = scan.next().toUpperCase().charAt(0);
     System.out.println("bas harfiniz: " +ilkHarf);
     
     scan.close();
	}

}
