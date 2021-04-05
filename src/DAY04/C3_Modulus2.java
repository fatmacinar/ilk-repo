package DAY04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
       System.out.println( "basmaklarini bulmak icin 4 basamakli bir sayi giriniz");
 
       int sayi= scan.nextInt(); 
       
       int birlerBas= sayi % 10;
       sayi /=10;
       
       int onlarBas = sayi % 10;
       sayi/=10;
       
       int yuzlerBas= sayi % 10;
       sayi/=10;
       
       int binlerBas=sayi % 10; // burda % zorunda degiliz
       
       System.out.println("birler basmagi:" + birlerBas);
       System.out.println("onlar basmagi: " + onlarBas);
       System.out.println("yuzler basmagi: " + yuzlerBas);
       System.out.println("binler basmagi: " + binlerBas);
       
       
       
       System.out.print (birlerBas);
       System.out.print (onlarBas);
       System.out.print (yuzlerBas);
       System.out.println (binlerBas);
       
       System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
       
       System.out.println("yazdiginiz sayinin tersten yazilisi : " + birlerBas+onlarBas+yuzlerBas+binlerBas);
       
     scan.close();
       
       
	}

}
