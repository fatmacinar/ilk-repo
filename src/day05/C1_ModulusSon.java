package day05;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir integer'ìn birler basamagindaki rakami yaudirin.
		
	int sayi=1469;
	System.out.println("verilen sayinin birler basamagi : " + sayi%10);
	
    //verilen sayinin birler basamgi haric geriye kalan basamaklari yazdirin
	
	
	System.out.println(sayi/10);
	System.out.println(sayi);
	System.out.println(sayi/=10);
	System.out.println(sayi);
	
	//sayi/10 yazilirsa sayinin degeri degismez ama islem yapar
	//sayi/=10 yazilirsa sayi 10a bolunur ve yeni deger olarak sayiya atanir
	
	}

}
