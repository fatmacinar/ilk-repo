package day26_arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C2_ArrayList01 {

	public static void main(String[] args) {
		// bir arraylist nasil olusturulur
		// arraylist bir objedir, dolayisiyla yeni bir tane olusturmak icin
		// "new" keyword kullanmaliyiz
		
		//1.yol
		ArrayList<String> list =new ArrayList<String>(); 
		
		//2.yol
		ArrayList<String> list2= new ArrayList<>();
		
		//3.yol; en cok bu kullanilir.
		List<String> list3=  new ArrayList<>();
		
		//NOT: eger constructor olarak list<> kullanilirsa; CTE verir
		// list<>() constructor olarak kullanilamaz
		//List<String>list4 =new List<>();
		
		//olusturdugumuz class isimleri javada kullanilan obje isimleri ile AYNI OLMAMAMLIDIR

		// list'e eleman ekleme
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		//Liste nasil yazdirilir? 
		System.out.println(list3);// [ALi,Veli,Ayse]
		
		list3.add(1, "Can");  // 1. index e istenen degeri ekler
		System.out.println(list3); // [Ali, Can, Veli, Ayse]
		
		list3.add(1, "Fatma");
		System.out.println(list3); //[Ali, Fatma, Can, Veli, Ayse]
		
		  /*
        Soru 6) Verilen bir Array�den istenen degere esit olan elamanlari kaldirip, 
        kalanlari yeni bir Array olarak yazdiran bir method yaziniz
        */
		
		  int arr[]= {2,3,5,3,6,4,3,6,7};
	      int sayi=5;
	      
	      List<Integer> istenenList=new ArrayList<>();
	      
	      for (int i = 0; i < arr.length; i++) {
	    	  
	    	  if (arr[i]!=sayi) {
	    		  istenenList.add(arr[i]);
				
			}
			
		}   
		
	      System.out.println(istenenList);
	      
		
	}

}