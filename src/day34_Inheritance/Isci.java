package day34_Inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.isim="Omer";
		isci1.soyisim="Aydin";
		isci1.id=1001;
		isci1.izindeMi=false;
		isci1.saatUcreti=10;
		isci1.statu= "isci";
		isci1.maas=isci1.maasHesapla();
		
		
		System.out.println(isci1.isim+ " "+ isci1.soyisim + " "+ isci1.id + " " + isci1.statu
			+" "+ 	isci1.maas	);
		
		

		Isci isci2=new Isci();
		isci2.isim="Esad";
		isci2.soyisim="Okumus";
		isci2.id=1002;
		isci2.izindeMi=true;
		isci2.saatUcreti=15;
		isci2.statu= "isci";
		isci2.maas=isci2.maasHesapla();
		
		
		System.out.println(isci2.isim+ " "+ isci2.soyisim + " "+ isci2.id + " " + isci2.statu
			+" "+ 	isci2.maas	);

	}

}
