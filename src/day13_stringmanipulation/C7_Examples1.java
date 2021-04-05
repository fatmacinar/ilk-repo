package day13_stringmanipulation;

import java.util.Scanner;

public class C7_Examples1 {

	public static void main(String[] args) {
		// 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("4 harfli bir kelime giriniz" );
		String str= scan.nextLine();
		
		if (str.length()!=4) {
			System.out.println("lutfen 4 harfli bir kelime giriniz");
			
		} else {
			System.out.println(str.substring(3));
			System.out.println(str.substring(2,3));
			System.out.println(str.substring(1,2));
			System.out.println(str.substring(0,1));
		}
	}

}
