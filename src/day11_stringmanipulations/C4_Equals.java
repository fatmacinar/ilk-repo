package day11_stringmanipulations;

public class C4_Equals {

	public static void main(String[] args) {
		// str.equals(str2) str ve str2 yi karsilastirir ve String olarak esit olup olmadiklarina bakar
		// sonuc olarak true veya false döndürür. (return)
		
		
		// bazi methodlarin yaptiklari islem ile döndürdukleri sonuc farkli olabilir
		// bir methoda git ali ismindeki elementi sil deriz,
		// o da gidip aliyi bulur ve siler
		// 
		
		
		String str= "Ali Can";
		String str2= "Ali Can";
		
		// str ile str 2 nin esit olup olmadigini yazdirin
		// // eseit veya esit degil yazdirtin
		
		System.out.println(str.equals(str2));   //True
		
		System.out.println(str.equals(str2) ?  "Esit"  :  "eseit degil");
		
		//javada Stringler case sensitivdir. buyuk kucuk harf duyarlidir
		//bir harf bile farkli olsa Stringler esit olmaz

	}

}
