package ikincihafta;

public class KrediMain { // InheritanceDemo

	public static void main(String[] args) {
		// OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		// ogretmenKrediManager.hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new AskerKrediManager()); // parametrede nesneyi kullandık
		// burada ister ogretmen ister tarım sınıfını kullanırız çünkü ikisininde ana sınıfını aldık
		
	}

}
