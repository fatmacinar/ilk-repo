package day10_SwitchCase;

import java.util.Scanner;

public class C5_SwitchKeys3 {

	public static void main(String[] args) {
		// kullanicidan hangi gunde oldugumuzu isteyin
		// girilen gunun hafta ici veya haftasonu oldugunu yazdirin
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen gun ismini yaziyla giriniz");
	    String gun= scan.next().toLowerCase(); //
	    
	    switch (gun) {
	    
	    case "pazartesi": 				
	    case "sali": 		
	    case "carsamba": 			
	    case "persembe": 		
	    case "cuma": 
			System.out.println("haftaici");
			break;
			
			
	    case "cumartesi": 	
	    case "pazar": 
			System.out.println("haftasonu");
			break;
			
			
	    default: 
			
			System.out.println("lutfen gecerli bir gun giriniz");
			
	    }
	    scan.close();
	}

}
