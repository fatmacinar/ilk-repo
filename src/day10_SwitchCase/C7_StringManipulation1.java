package day10_SwitchCase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// manipulation donusturme degistirme demek
		
		// string non-primitive data türünden
		// non-primitive data turleri value ile birlikte methodlara sahiptirler
		// methotlari kullanarak Stringi degistirmeye String manipulatin denir
		
		String str = "Hello World";
		System.out.println(str.toUpperCase()); // HELLO WORLD
		
		System.out.println(str);    // Hello World
		
		String str2=str.toUpperCase();
		System.out.println(str);   // Hello World
		
		System.out.println(str2);  //HELLO WORLD
		
		
		
		
	}

}
