package day03;

import java.util.Scanner;

public class C1_Scanner1 {

     public static void main(String[] args) {
		
    	 Scanner scan = new Scanner(System.in);
    	
    	 System.out.println("lutfen sadece isminizi giriniz");
    	 String name = scan.nextLine();
    	 
     	 System.out.println("lutfen sadece soyisminizi giriniz");
     	 String surname = scan.nextLine(); 
     	 
     	 System.out.println("isminiz:" + name);
     	 System.out.println("soyisminiz:" + surname);
     	 System.out.println("kursumuza kaydiniz alinmistir");
     	 
     	 scan.close();
    	 
    	 
    			 
	}

}
