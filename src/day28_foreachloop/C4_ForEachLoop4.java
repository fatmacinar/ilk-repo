package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C4_ForEachLoop4 {

	public static void main(String[] args) {
		// iki String array olusturunuz ve bu array?lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		//Ortak eleman yoksa ekrana ?Ortak eleman yok? yazdiriniz
		
		String arr1[]= {"Ali", "Can", "Ayse", };
		String arr2[]= {"Ali", "Veli", "Mesut","Seher", "Sedat"};
		
		//ortak elemanlari koymak icin bir list olusturalim
		
		List<String> ortakElemanlar =new ArrayList<>();
		
		for (String eachArr1 : arr1) {
			for (String eachArr2 : arr2) {
				
				if (eachArr1.equals(eachArr2)) {
					ortakElemanlar.add(eachArr1);
				}
				
			}
			
		}
		System.out.println(ortakElemanlar);

	}

}
