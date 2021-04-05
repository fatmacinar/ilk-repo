package day28_foreachloop;

public class C1_ForEachLoop01 {

	public static void main(String[] args) {
		// bir arrayin tum elemanlarini for loop ile yazdiralim
		
		int arr[]={2,4,6,8,10,12};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			
			
		}
		// for loop yazmamizin amaci arrayin tum elemanlari uzerinde islem yapmak ise 
		//foreach loop daha kolay kod yazmamizi saglar
		
		// each==> her bir demek 
		// for each loop istedigim bir topluluktaki tum elemanlari birer birer bana getirir
		// for each loop da baslangic degeri yoktur, bitis degeri yoktur, index yoktur
		System.out.println(); // görevi cursoru alt satira indirmek
		
		
		for (int each : arr) {
			System.out.print(each+" ");
			
		}
		
	}

}
