package day18;

import java.util.Scanner;

public class C4_WhileLoop3 {

	public static void main(String[] args) {
		// Soru4) Kullanicidan baslangic ve bitis harflerini alin ve
		// bsslangic harfinden baslayip bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin-
		//kullanicinin hata yapmadigini farz edin
		
		
		Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen baslangic harfini giriniz");
        char basHarf=scan.next().toUpperCase().charAt(0);  //C
        
        System.out.print("Lutfen bitis harfini giriniz");
        char bitHarf=scan.next().toUpperCase().charAt(0);   //F
        
        
        for (char i = basHarf; i<= bitHarf; i++) {
        	System.out.print(i+" ");
        }
        
        
        // while loop ile
        //baslangic degerim var "basHarf"
        while (basHarf<=bitHarf) {
        	System.out.print(basHarf +" ");
        	
        basHarf++;
        }
        scan.close();
        
	}

}
