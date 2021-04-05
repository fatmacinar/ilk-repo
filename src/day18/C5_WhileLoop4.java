package day18;

import java.util.Scanner;

public class C5_WhileLoop4 {

	public static void main(String[] args) {
		// Soru 6 ) Kullanicidan pozitif bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane  olduklarini ekranda yazdirin
		
		
		    Scanner scan=new Scanner(System.in);
	        System.out.println("Lutfen bolenleri bulmak icin pozitif bir sayi giriniz");
	        int sayi=scan.nextInt(); //100 diyelim ki
	        int bolen=1;
	        int count=0;  //count sayac demek
	        
	        while (bolen<=sayi) {
	        	
	        	if (sayi%bolen==0) {
	        		count++;  //boleni bulunca countu bir artiriyorum
	        		System.out.println(bolen);
					
				}
	        	bolen++;
	        }
	        System.out.println(sayi+"sayisinin bolenleri:"+count+ "adettir");
	        
	        // bolenleri bu sekilde yazdirin
	        // 1- 1
	        // 2- 2
	        // 3- 4
	        // 4- 5
	        // 6-20
	        
	        bolen=1;
	        count=0;
	        
             while (bolen<=sayi) {
	        	
	        	if (sayi%bolen==0) {
	        		count++;  //boleni bulunca countu bir artiriyorum
	        		System.out.println(count+ "-" +bolen);
					
				}
	        	bolen++;
	        }
	      
     scan.close();
	}

}
