package ikincihafta;

public class methods2 {

	public static void main(String[] args) {
		// String mesaj = "Bugün hava çok güzel";
		String mesaj2 = sehirVer();
		System.out.println(mesaj2);
		int sayi = topla(15, 5);
		System.out.println(sayi);
		int toplam = topla2(2, 5, 7, 8, 9);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("eklendi");
	}

	public static void sil() {
		System.out.println("silindi");
	}

	public static void guncelle() {
		System.out.println("güncellendi");
	}

	public static int topla(int i, int j) {
		return i + j;
	}

	public static int topla2(int... sayilar) { // istediğimiz kadar sayı çağırabiliyoruz buna variable arguments deniyor
		int toplam = 0;                        // aslinda bir diziye çeviriyo arka planda
		for(int sayi:sayilar) {
			toplam +=sayi;
		} return toplam;
	}

	public static String sehirVer() {
		return "Ankara";
	}
}
