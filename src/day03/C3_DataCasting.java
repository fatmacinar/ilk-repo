package day03;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		byte numByte= 45;
		System.out.println("byte degisken degeri : " + numByte);
		
		short numShort = numByte;  // short byte dan büyük oldugu icin java sikayet etmiyor. aotu wideining yapiyor.
		
		
		System.out.println("short degisken deger :" + numShort);
		
		int numInt=numShort;
		
		System.out.println("integer degisken degeri :" + numInt);
		
		float numFloat= numInt;
		
		System.out.println("float degisken degeri :" + numFloat);
		
		double numDouble = numFloat;
		
		System.out.println("double degisken degeri : " + numDouble);
	}

}
