package day34_Inheritance;

public class Muhasebe extends Personel {
	// muhasebe classinin personel classinin child class oldugunu declare etmek icin
	// class ismine extends keyword ile paraent classi yazariz
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas=30*8*saatUcreti;
		return maas;
	}

}
