package day36_inheritance;

import java.util.ArrayList;
import java.util.List;

import day34_Inheritance.Personel;

public class UstaBasi extends Isci {
	public String bolum= "takimhane";
	public int sorOldIscisay=10;
	private char[] isim;

	public static void main(String[] args) {
		UstaBasi ub1=new UstaBasi();
		//objeyi torun classinda olusturunca 3 classa da ulasabiliyoruz
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIscisay);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim); 
		
		Isci ub2= new UstaBasi();
		// List<String> list =new ArrayList<>();
		// Object str=new String ("Hasan");
		
		System.out.println(ub2.departman);
		
		 personel ub3= new UstaBasi(); 
		

	}

}
