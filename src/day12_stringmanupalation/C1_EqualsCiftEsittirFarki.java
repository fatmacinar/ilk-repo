package day12_stringmanupalation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		// 
		
		String str1="Ali Can";
		
		String str2= str1+ ""; //Ali Can
		
		System.out.println(str1==str2); //False 
		
		// Cift esittir stringlerin hem degerlerine hem adreslerine bakar.
		// bu ornekte str1 +"" yazdigimizda concatenation yapildigi icin java yeni bir obje olusturur
		// ve islemin sonucunu yeni objenin icine koyar
		// str1 ve str2 ile karsilastirirsak degerleri ayni adresler frakli oldugu icin false döner
		
	
		System.out.println(str1.equals(str2));
		// Equals metodu sadce stringlerin degerlerini karsilastirir
		// bu ornekte str1 ile st2 nin degerleri ayni oldugu icin true döndürürü
		
		
		String str3= str1;
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

	}

}
