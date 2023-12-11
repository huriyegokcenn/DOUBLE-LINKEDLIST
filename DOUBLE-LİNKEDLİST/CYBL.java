package CYBL;

public class CYBL {
	Eleman bas;
	Eleman son;
	
	CYBL(){
		bas=null;       //BOŞ BAĞLI LİSTE OLUŞTURMA
		son=null;           
	}
	void BasaElemanEkle(Eleman yeni) {
		if(bas==null) {  //LİSTE BOŞSA
			bas=yeni;
			son=yeni;
		}else {          //LİSTE DOLUYSA
			yeni.ileri=bas;
			bas.geri=yeni;
			bas=yeni;
		}
	}
	
	void ListeYazdir() {
		Eleman tmp=bas;
		while(tmp!=null) {
			System.out.println("KİŞİNİN ADI:"+" "+tmp.ad+" "+"KİŞİNİN SOYADI:"+" "+tmp.soyad+" "+"KİŞİNİN NOSU:"+" "+tmp.no);
			tmp=tmp.ileri;
		}
		System.out.println(" ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥  ♥ ");
	}
	
	void SonaElemanEkle(Eleman yeni) {
		if (bas==null) {    //LİSTE BOŞSA
			System.out.println("LİSTE BOŞ SONA ELEMAN EKLENEMİYOR BAŞA EKLERİZ:");
			BasaElemanEkle(yeni);
		}else {            //LİSTE DOLUYSA
			son.ileri=yeni;
			yeni.geri=son;
			son=yeni;
			System.out.println("SONA ELEMAN EKLENDİ");
		}
	}
	
	void ArayaElemanEkle(Eleman yeni, int sayi) {
		if(bas==null) {
			System.out.println("LİSTE BOŞ ARAYA ELAMAN EKLENEMİYOR BAŞA EKLERİZ:");
			BasaElemanEkle(yeni);
		}else {
			Eleman tmp = bas;
			int sayac=0;
	        if(bas!=null) {
	        	while (tmp!=null) {
	        		tmp=tmp.ileri;
	        		sayac++;
	         	}
	        }
	        if(sayac<sayi) {
	        	System.out.println("LİSTE SINIRI SAYIDAN KISA O YÜZDEN SONA EKLENDİ");
	            SonaElemanEkle(yeni);
	        }else {
	        	Eleman tmp1=bas;
				int sayac1=1;
				while(sayac1<sayi) {
					sayac1++;
					tmp1=tmp1.ileri;     //İLERLEME
				} //SONRASSINA EKLENECEK ELEMAN BULUNDU
				yeni.ileri=tmp1.ileri;
				tmp1.ileri=yeni;
	        }

	    }
	}
}