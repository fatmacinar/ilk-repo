package day14_methodCreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {
		// 
		
		String str="Java cok guzel";
		
		//1-Java methodlarin sadece ismine degil, isim +parametre bakar
		//sadece parametre sayisi degil parametrelerin data tiplerine de bakar
		str.endsWith("el"); //bu methodun görevi gidip kelimenin son kismini kontrol etmek
							// bu methodu kullanmak icin bu methodun kontrol ettikten sonra
							// bana rapor olarak ne getirdigini bilmem lazim
		//2- bir method olusturdugumuzda methodun ne yapacagina ve görevi yaptiktan sonra bana ne döndürecegine
		// bastan karar vermeliyiz
		
		//3- bir method olusturulurken  ""str.indexOf(String str,int fromIndex);"" deoldugu gibi 
		//disardan kabul edeci parametreleri ve parametrelerin data tiplerini deklare etmeliyiz
		//methodu calistirmak istedigimde (methodu cagirmak denir)parametre olarak deklasre edilen 
		//data tiplerine uygun degerler girmeliyiz
		// girilen bu degerlere ARGUMENT denir
		
		str.indexOf("va", 1); 
		
	}

}
