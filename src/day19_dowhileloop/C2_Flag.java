package day19_dowhileloop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin, 
	    //	while loop kullanarak cumlede buyuk harf var mi yok mu yadirin

		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		
		String flag="yok";
		
		int index=0;
		
		while(index<cumle.length()) {
			if (cumle.charAt(index)>='A' && cumle.charAt(index)<='Z') {
				flag="var";
			}
			index++;
			
		}
		System.out.println("verdiginiz cumle de buyuk harf "+ flag);
	}

}
