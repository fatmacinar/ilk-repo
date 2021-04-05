package day15_MethodCreation4;

public class C4_ForLoop1 {

	public static void main(String[] args) {
		//5 defa Hello World yazdiralim
		
		/*System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		*/
		
		// bunun yerine loop kullaniyoruz
		//ne yapacagimizi javaya soyluyoruz. kac kere olacagini soyluyoruz
		
		//tum loop larda 3 sey yazilir;
		//1) baslangic degeri
		//2) bitis degeri
		//3) artis  degeri
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("Hello World");
		}
		
	//Not: eger sart kismi bizim artisimiza gore hep true verirse loop sonsuz donguye girer
	//Not: loop da artis degeri pozitif oldugu gibi negatifte olabilir "i--"
	//Not: artis degeri 1 olmak zorunda degil (i-=5 ile beser beser azalir)
	//not: eger loopun sarti hic true olmazsa hic devreye girmrz loop
	}

}
