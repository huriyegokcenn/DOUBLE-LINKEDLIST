package CYBL;

public class Eleman {
	int no;
	String ad;
	String soyad;
	Eleman ileri;
	Eleman geri;                                          //CYBL İLE TYBL FARKI
	public Eleman(int no,String ad, String soyad) {
		this.no=no;
		this.ad=ad;
		this.soyad=soyad;                                 //ELEMAN YAPISINI TUTUYOR
		ileri=null;
		geri=null;
	}

}
