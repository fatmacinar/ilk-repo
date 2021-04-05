package day27_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		
		list.add("Ali");
		list.add("Can");
		list.add("Ayse");
		list.add("Fatma");
		
		System.out.println(list);  //[Ali, Can, Ayse, Fatma]
		
		System.out.println(list.size()); // 4
		
		System.out.println(list.remove(1)); //indexi 1 olan cani silip, sildigi elmani bana dönürecek
		
		System.out.println(list ); //[Ali, Ayse, Fatma]
		
		System.out.println(list.remove("Ayse")); //ayseyi silecek ve bana  true dönecek
		System.out.println(list); ////[Ali,  Fatma]
		
		System.out.println(list.remove("mehmet")); // mehmet olmadigi icin bulamadigindan false döndürecek
		
		System.out.println(list);// [Ali,  Fatma]
		
		list.remove(1);
		list.remove("Ali");
		
		System.out.println(list);//[]
		
	}

}
