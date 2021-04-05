package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		
		int sayi=10;
		int sayi2=20;
		int sayi3=30;
		String isim="Ali";

		// javada birden fazla elemani koyabilecegimiz (store) objectler var
		// bugun bunlardan ilkini ogrenecegiz
		
		int arr []= {10,20,30};  //  int[] arr seklinde de kullanilir
								 // bu örnekte arrayin elemanlarini  direk yazdigimiz icin 
								 // uzunluk belirtmeye ihtiyac kalmadi
								 // bu kullanimda max eleman sayisi (length) yazdigimiz eleman sayisidir.
		
		System.out.println(arr); // array bir objedir
								// eger direk olarak array i yazdirmak isterseniz java direk referansi yazdirir
		
		System.out.println(Arrays.toString(arr)); //[10,20,30]
		
		String takim[]= new String [7]; // [ null,null,null
		
		System.out.println(Arrays.toString(takim));
		
		takim[0]="Ali";		
		System.out.println(Arrays.toString(takim)); // Ali,null,null
		
		takim[2]="Hasan";
		takim[1]= "Veli";
		System.out.println(Arrays.toString(takim)); //Ali.Veli,Hasan
		
		//takim[3]="Mehmet"; // java run time programdir, dolayisiyla array calistirinca 
						   // olusturulur. 39. satird SYNTAX olarak hata olmadigindan CTE olmaz
		
					// program calistiginda 3. index olmadigi icin rte verir
		//Array deki bir elamani uptade etme
		// velinin yerine kemal gelsin
		
		takim[1]="Kemal";
		System.out.println(Arrays.toString(takim)); //Ali.Kemal,Hasan
		
		//bir Array in uzunlugunu nasil bulabiliriz?
		System.out.println(takim.length); // 3
		// Stringteki length() idi; Array de length
		
		
		// Array deki son elemani mehmet yapin
		takim[2]="Mehmet";
		System.out.println(Arrays.toString(takim));
		
		//eger Arrayin eleman sayisi tek ise ortadaki elemani Can yapalim
		
		if (takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Can";
			
			
			
			
		}
		
		
		System.out.println(Arrays.toString(takim));
		
				
				
		
		
		
		
		
	}

}
