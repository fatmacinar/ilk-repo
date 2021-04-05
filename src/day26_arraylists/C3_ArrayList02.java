package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C3_ArrayList02 {

	public static void main(String[] args) {
		//Listin uzunlugu nasil bulunur
		
		List<Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(20);
		
		System.out.println(list); //[10, 15, 8, 12, 20]
		System.out.println(list.size()); //5
		
		//bir eleman nasil silinir
		list.remove(1); //[10, 8, 12, 20]
		System.out.println(list); 

		
		System.out.println(list.remove(2)); // git 12'yi kaldir, bize 12'yi getirdi
		System.out.println(list); //[10, 8, 20]
		
		//System.out.println(list.remove(5)); RTE
		
		List<String> list2= new ArrayList<>();
		list2.add("Ali");
		
		System.out.println(list2.remove("Hasan"));//hasan olmadigi icin bulmaz, false getirir
		System.out.println(list2);
		
		//remove (object) methodu kullanildiginda eger java istenen elemani bulup remove ederse
		// bize remove edilen elemani d�nd�r�r
		// listede bulmazsa istegin yerine getirilip getirilmedigini anlamaiz icin False d�nd�r�r
		
	}

}
