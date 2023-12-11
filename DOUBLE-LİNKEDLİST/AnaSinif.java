package CYBL;


import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		CYBL cybl=new CYBL();     //cybl yerine istediğin bir değişken atayabilirsin
		Eleman el=new Eleman(12345,"Ahmet","Çoban");
		Eleman el2=new Eleman(23456,"Gökçen","Açıkgöz");
		
		cybl.BasaElemanEkle(el);
		cybl.BasaElemanEkle(el2);
		cybl.ListeYazdir();
        Scanner key = new Scanner(System.in);
	    System.out.println("EKLENECEK KİŞİNİN ADINI GİRİNİZ:");
		String ad =key.nextLine();
		System.out.println("EKLENECEk KİŞİNİN SOYADINI GİRİNİZ:");
		String soyad= key.nextLine();
		System.out.println("EKLENCEK KİŞİNİN NOSUNU GİRİNİZ:");
		int no=key.nextInt();
			
		cybl.BasaElemanEkle(new Eleman(no, ad, soyad));
		cybl.ListeYazdir();
		System.out.println("EKLENECEK KİŞİNİN ADINI GİRİNİZ:");
		String ad1 =key.nextLine();
		System.out.println("EKLENECEk KİŞİNİN SOYADINI GİRİNİZ:");
		String soyad1= key.nextLine();
		System.out.println("EKLENCEK KİŞİNİN NOSUNU GİRİNİZ:");
		int no1=key.nextInt();
			
		cybl.ArayaElemanEkle(new Eleman(no1, ad1, soyad1), 2);
		cybl.ListeYazdir();
        
	} 
}


