package day05;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// AND===> &&. OR ===>|| 
		
		boolean isTrue= 5>4 && 7-3>0;
		// and operatörü mukemmeliyetcidir .hepsi true ise turue 
		// bir false varsa false dir
		
		System.out.println(isTrue); // true
		
		int x=10;
		int y=5;
		
		System.out.println(x/y==2  && x*y>20  && x-y>0);//true
		
		System.out.println(x+y<0 && x-y>0); //false 
		
		//OR operatoru ise optimisttir. verilen karsilastirmalardan 
		// bir tanesi bile dogru ise sonuc true olur.
		
		System.out.println(x<y || x+y<0 || x*y>0); //true
		
		
		

	}

}
