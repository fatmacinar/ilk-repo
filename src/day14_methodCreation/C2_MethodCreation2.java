package day14_methodCreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		// bir methodu calistirmak icin main methodun icinden cagirmamiz gerekir
		// bir methodu cagirmak icin ise method adini ve parametrelere uygun argumentleri yazmaliyiz
		
			ortalama(85.2, 90.3); //method call 

	}//main method sonu
	
	
		//bir method olusturmak istedigimizde classin icinde ama main methodun disinda bir alanda olusturmaliyiz
		// genel methodlar main methondan sonra olur.
	
	
	
	public static void ortalama (double sayi1, double sayi2) {
		
		System.out.println("girdiginiz iki sayinin ortalamasi : " +(sayi1+sayi2)/2);
		// bir methodu olusturmak o methodu calistirmak icin yeterli degildir
		// olusturulan method main method icinden cagrilinca calisir
		
	}
	
}// class sonu
