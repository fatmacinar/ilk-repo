package day10_SwitchCase;

import java.util.Scanner;

public class C3_SwichCase1 {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin
		// girilen rakami yazi ile yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir rakam giriniz");
		
		int rakam = scan.nextInt();
		
		
		
	
				if (rakam >= 1 && rakam <= 10) {
				
				if (rakam == 1) {				
					System.out.println("Bir");	
				}
				
				else if (rakam == 2) {				
					System.out.println("Iki");
				}
				
				else if (rakam == 3) {					
					System.out.println("Uc");
				}
				
				else if (rakam == 4) {					
					System.out.println("Dort");
				}
				
				else if (rakam == 5) {					
					System.out.println("Bes");
				}
				
				else if (rakam == 6) {					
					System.out.println("Alti");
				}				
				else if (rakam == 7) {					
					System.out.println("Yedi");
				}			
				else if (rakam == 8) {			
					System.out.println("Sekiz");
				}			
				else if (rakam == 9) {				
					System.out.println("Dokuz");
				}
				
			} else {
				
				System.out.println("Girdiginiz deger rakam degil!");
			}
			
	         //soruyu Switch ile alalaim
			
			switch (rakam) {
			case 0: 
				System.out.println("sifir");
				break;
				
			case 1: 
				System.out.println("bir");
				break;
				
			case 2: 
				System.out.println("iki");
				break;
				
			case 3: 
				System.out.println("uc");
				break;
				
			case 4: 
				System.out.println("dort");
				break;
			
				
			case 5: 
				System.out.println("bes");
				break;
				
			case 6: 
				System.out.println("alti");
				break;
				
			case 7: 
				System.out.println("yedi");
				break;
				
			case 8: 
				System.out.println("sekiz");
				break;
				
			case 9: 
				System.out.println("dokuz");
				break;
				
				default: // else gibi, geriye kalan her sey icin gecerli
					
				System.out.println("lutfen gecerli bir rakam giriniz");
					
			}
	}
}
			
	


