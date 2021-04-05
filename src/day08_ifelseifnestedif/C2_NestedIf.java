package day08_ifelseifnestedif;

public class C2_NestedIf {

	public static void main(String[] args) {
		
		// verilen cinsiyet ve yas icin kisinin emekli olmayacagini bir java programi yazdiriniz.
		// egercalisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir

		
		 String cinsiyet="kadin";
		 int yas = 59;
		 if (yas<0) {
			 System.out.println("yas negatif olamaz");
		 }
		 else if(cinsiyet.equalsIgnoreCase("erkek") && yas>65) {
			System.out.println("emekli olabilirsin"); 
			
		 }else if(cinsiyet.equalsIgnoreCase("ekek") && yas<65) {
			 System.out.println("emekli olamazsin");
			 
		 }else if (cinsiyet.equalsIgnoreCase("kadin")&& yas>60) {
			 System.out.println("emekli olabilirsiniz");
			 
		 }else if(cinsiyet.equalsIgnoreCase("kadin")&& yas<60) {
			 System.out.println("emekli olmazsiniz");
			 
		 }else System.out.println("cinsiyet ve yas tanimsiz");
			
		 
		 System.out.println("nested if ile sonuc");
		 
		 if (cinsiyet.equalsIgnoreCase("erkek")) {
			 if (yas<0) {
				System.out.println("erkek yas negatif olamaz");
			} else if (yas<65) {
				System.out.println("bu yasta erkek emekli olamaz");
			} else {
				System.out.println("emekli olabilirsin");
			}
			 
		 } else if (cinsiyet.equalsIgnoreCase("kadin")) {
			 if (yas<0) {
					System.out.println(" kadin yas negatif olamaz");
				} else if (yas<60) {
					System.out.println("bu yasta kadin emekli olamaz");
				} else {
					System.out.println("emekli olabilirsin");
				}
		
		 }else {
			 System.out.println("yazdiginiz cinsiyet sistemde kayitli degil");
		 }
		 
		 }

		 
} 
		 
		 
	 
	

 
