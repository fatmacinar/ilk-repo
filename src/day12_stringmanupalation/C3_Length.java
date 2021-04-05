package day12_stringmanupalation;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		// kullanicidan bir string girmesini isteyin
		// girilen string in son harfini buyuk harf olarak yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz cumlenin son harfi :" + str.charAt(str.length()-1));
		
		//length () methodu girilen stringin uzunlugunu verir.
		System.out.println(str); //kullanici ne girdiyse onu buyuk harfle yazdirir.
		
		String str2=""; //  "Ali" --->3
		System.out.println(str2.length());// 0
		
		String str3=null; // hic demek
						  // normalde stringler "" icine yazilir ama null icin buna gerek yoktur.
						  // nul case sensetivedir, doalyisiyla null vaya NULL yazilmaz
						  // null bir deger degildir, sadece hicligi gosteren bir pointerdir.
		
	//	System.out.println(str3.length()); //rte verir
	// null deger atanan string ile string manipulation methodlari kullanilmaz
	
		
		

	}

}
