package day08_ifelseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {

	public static void main(String[] args) {
		// kullanicidan bir yil girmesini isteyin
		
		//Kullanicidan artik yil olup olmadigini kontrol etmek icin yil girmesini isteyin.
					
		//Kural 1: 4 ile bolunemeyen yillar artik yil degildir
	//	Kural 2: 4�un kati olmasina ragmen 100 ile
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir yil yaziniz");
		
		int yil=scan.nextInt();
		if (yil%4==0 && yil%100 !=0) {
			System.out.println("artik yil");
			
		} else if (yil%4==0 && yil%100==0 && yil%400==0){
			System.out.println("artik yil");

		}else {
			System.out.println("artik yil degil");
			
		}
		
		
		scan.close();

	}

}
