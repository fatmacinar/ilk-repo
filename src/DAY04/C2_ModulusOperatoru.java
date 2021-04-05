package DAY04;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		int kalan = 15 % 4;
		System.out.println(kalan); // kalan 3
		
		System.out.println(26% 8); // kalan 2
		
		int sayi = 856;
		
        int birlerBasamagi = 856 % 10; 
        System.out.println("sayinin birler basmagi :" + birlerBasamagi);
		
		sayi/=10;
		System.out.println("ona bolundukten sonra sayinin degeri : " + sayi);
		
		int onlarBasamagi= sayi %10;
		System.out.println("onlar basamagi: " + onlarBasamagi);
		
		sayi/=10;
		System.out.println("2.defa 10 a boldukten sonra"  + sayi);
		
		int yuzlerBasamagi=sayi;
		System.out.println(yuzlerBasamagi);
		
	}
	
	

}
