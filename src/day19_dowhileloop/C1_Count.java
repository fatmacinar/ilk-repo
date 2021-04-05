package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// kullanicidan bir cumle ve bir harf isteyin 
		// while loop kullanrak cumlede istenen harf kac kez kullanilimis bulunuz
		//program case sensetive olsun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("lutfen saymak istediginiz harfi giriniz");
		String harf=scan.next().substring(0,1); //String olarak ilk harfi alir
		
		int count=0;
		
		int index=0;
		
		while(index<cumle.length()) {
			if (cumle.substring(index,index+1).equals(harf)) {
				count++;
				
			}
			index++;
		}
System.out.println("cumlede " + harf + "harfi " + count + "defa kullanilimis. ") ;
	}

}