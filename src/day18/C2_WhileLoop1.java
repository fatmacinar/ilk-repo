package day18;

public class C2_WhileLoop1 {

	public static void main(String[] args) {
		// while: iken, oldugu sürece
		//10 dan 30 a kadar olan sayilardan 4 ile bolune bilenleri aralarinda bir bosluk olaxak sekulde yan yana yazdirin
		
		
		//once FOR LOOP;
		
		for (int i=10; i<=30; i++) {
			
			if (i%4==0) {
				System.out.println(i+ " ");
				
			}
		}
		
		//aynisini WHILE LOOP ile;
		int sayi=10; //1. sarti gerceklestirdim (baslangic degeri)
		
		while (sayi<=30) {
			if (sayi%4==0) {
				System.out.println(sayi+ " ");
		}
			
		
		sayi++;   //3. sarti gerceklestirdim (degisim degeri)	
		//while sonu
		}

	}

}
