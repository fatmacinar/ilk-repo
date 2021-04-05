package day05;

public class C2_Wrapper {

	public static void main(String[] args) {
		// java da 2 ana tur data var
		// primitive sadece value icerir
		// np data turleri ise deger ve method icerir
		
		String isim= "mehmet";
		System.out.println(isim.toUpperCase());
		
		//wrapper Class: javanin primitive data türleriyle ile bazi metotlari
		//kullanabilmemiz icin olusturdugumuz Classlardir.
		
		// boolean, char, byte, short, int, long, float, double
		
		byte sayi=10;
		Byte sayi2=11; //ismen primitive data turu ile ayni olan non primitive datalar
						// wrapper denir.
		
		System.out.println(sayi2);
		
		Byte byteMinSayi=Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi= Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		//7 variable olusturmadan direk olarak shortun en kucuk ve
		//en buyuk degerlerini yazdiralim
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		// integer veri turunun wrapper classi yine Integer
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		// Boolean, Character, Byte,Short, Integer, Long, Float, Double
		
		
		
	
		
		
		
	}

}
