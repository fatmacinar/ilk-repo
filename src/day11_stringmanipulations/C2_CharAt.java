package day11_stringmanipulations;

public class C2_CharAt {

	public static void main(String[] args) {
		// charAt(index) 
		//scan.next().charAt(0) 0. indexteki karakteri verir
		
		String str = "Java cok guzel"; // uzunlugu 14
		System.out.println(str.charAt(0)); // J
		
		System.out.println(str.charAt(5));  //c
		
		System.out.println(str.charAt(13));  //l
		
		// kelimenin uzunlugu son index +1 dir.
		// son index kelimenin uzunlugu (length)-1
		
		System.out.println(str.charAt(14));     // exception verir
		// eger index olarak kelimenin uzunlugu ya da daha buyuk bir sayi girilirse
		
		//kullanici 10 harfli bir kelime verirse bana son harfi verecek kodu yaziniz   System.out.println(str.charAt(9));
		
	    // !!!!!!String str3 = 5; ---> Compile time error CTE (5in altini kirmizi ciziyor java)
	    // kod calismadan javanin frárkina varip kirmizi cizdigi hatalardie
		// bu tur hatalar duzeltilmeden java kodu calistirmaz
		
		// !!!!!!System.out.println(str.charAt(14)); bazi hatalar syntax den anlasilmaz,
		// ancak kod calistirildiktan sonra java islemi yaparken anlasilir
		//kod Run edildiginde ortaya ciktigi icin bu tur hatalara run time error denir rte
		
		
		
	}

}
