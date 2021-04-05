package day12_stringmanupalation;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		// equalsIgnoreCase() Methodu karsilastirdigi Stringlere case sensetive (buyuk kucuk harf duyarliligi) olmaksizin bakar
		// stringler ayni ise true, ayni degilse false döner
		
		String str1 = "Ali Can";
		String str2 = "ali CAN";
		String str3 = "Ali can ";
		
		System.out.println(str1.equals(str2)); //False
		System.out.println(str1.equalsIgnoreCase(str2)); //True
		
		System.out.println(str1.equals(str3)); //false
		System.out.println(str1.equalsIgnoreCase(str3)); //false
		
	}

}
