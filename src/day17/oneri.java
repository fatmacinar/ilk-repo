package day17;

import java.util.Scanner;

public class oneri {

	public static void main(String[] args) {
		
		        /*
		         Kullanicidan bir tamsayi girmesini isteyin
		         sayi negatif veya sifirsa "Lutfen pozitif bir tamsayi giriniz" yazdirin
		         Girilen Sayinin rakamlar toplamini ayri bir method'da hesaplayin
		        
		         Main method icinde Kullanicidan bir sinir deger isteyin
		         rakamlar toplami sinir degerden buyukse
		         "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk",
		         degilse "Girdiginiz sayinin rakamlar toplami, girdiginiz sinir degerinden buyuk degil"
		         yazdirin       
		         */
		        Scanner scan = new Scanner (System.in);
		        System.out.println("Lütfen Bir Tamsayi Giriniz");
		        int sayi = scan.nextInt();
		        
		        if (sayi <= 0) {
		            System.out.println("LÜtfen Pozitif Bir Tam Sayi Giriniz");
		            
		        } else {
		            
		        rakamlarToplamiYazdir(sayi);
		        
		            
		        }
		        
		    }
		        public static void rakamlarToplamiYazdir(int sayi) {
		            int rakamlarToplami = 0;
		            
		            String sayi2 = sayi + ""; //Sayi 1'i Stringe cevirmis olduk.
		            
		            for (int i = 1 ; i <= sayi2.length() ; i++) {
		                rakamlarToplami += sayi%10;
		                sayi/=10;
		            }
		            System.out.println("Girdiginiz Sayinin Rakamlar Toplami : " + rakamlarToplami);
		        
	

	}

}
