package day13_stringmanipulation;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		//
		String str="Java ogren, mutlu ol, Java candir";
		
		System.out.println(str.replace ("Java","hava"));
		
		// replaceAll() methodu replace() methoduna benzer ama 2 farki vardir
		// 1- replace() methodu char kabul eder ama replaceAll() kabul etmez
		// 2- replaceAll methodu regexp kullanimina izin verir
		
		System.out.println(str.replaceAll("\\W", "*"));// tum harf ve rakamlar yerine * yazacak
		System.out.println(str.replaceAll("\\W", "*"));//w'nun tersi
		System.out.println(str.replaceAll("\\D", ".")); //sayilari . yapar
		System.out.println(str.replaceAll("\\d", ".")); //bosluklari & yapar
		System.out.println(str.replaceAll("\\s", "&")); // bosluk olmayan herseyi & yapar
		System.out.println(str.replaceAll("\\S", "&")); // sayilari siler
	
	}

}
