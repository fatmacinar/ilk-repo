package day10_SwitchCase;

import java.util.Scanner;

public class C6_SwitchCase4 {

	public static void main(String[] args) {
		// kullanicidan VIP (very important person) kisaltmasindan hangi harfin anlamini istedigini soralim
		// girilen harfin aciklamasini yazdiralim

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		
		
        char harf = scan.next().charAt(0);
	    
	    
	    switch (harf) {
	    case 'v':
		case 'V': 
			System.out.println("Very");
			break;
			
		case 'i':	
		case 'I': 
			System.out.println("important");
			break;
			
		case 'p':
		case 'P': 
			System.out.println("person");
			break;
			
		
		default: 
			
			System.out.println("lutfen gecerli bir harf giriniz");
			
	    }
			
			//kullanici birden fazla harf girmesi sorun olsun istiyorsak ""String"" olmali
	    
			
			System.out.println("lutfen bir harf giriniz");
			String str =scan.next();
			
			
			  switch (str) {
			    case "v":
				case "V": 
					System.out.println("Very");
					break;
					
				case "i":	
				case "I": 
					System.out.println("important");
					break;
					
				case "p":
				case "P": 
					System.out.println("person");
					break;
					
				
				default: 
					
					System.out.println("gecersiz harf");
		
			  }
			  
	    scan.close();
	    
	    }
	    
	}


