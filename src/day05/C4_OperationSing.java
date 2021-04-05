package day05;

public class C4_OperationSing {

	public static void main(String[] args) {
		// 
		
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat= sayi1>sayi2; //true/false
		System.out.println(isGreat); //true
		
		boolean isSmall = sayi1<=sayi2;
		System.out.println(isSmall); //false
		
		boolean isEqual= sayi1==sayi2; // =='esit mi' anlamina gelir ve comparison
		System.out.println(isEqual); //false
		
		System.out.println(sayi1==5);// true
		
		System.out.println(sayi1*sayi2==20); // true
		
		System.out.println(sayi1+sayi2!=9); //! isareti 'degildir' demek
		
		System.out.println(sayi1- sayi2!=0); //true //5-4 0 esit degildir mi?
		
		
		
	}

}
