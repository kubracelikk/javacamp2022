package ikincihafta;

public class DortIslemMain {

	public static void main(String[] args) {
		DortIslem dortislem=new DortIslem();
		int toplam=dortislem.topla(2, 3);
		int kalan=dortislem.cikar(5, 1);
		int carpim=dortislem.carp(7, 8);
		int bolum=dortislem.bol(12, 4);
		System.out.println(toplam);
		System.out.println(kalan);
		System.out.println(carpim);
		System.out.println(bolum);

		

	}

}
