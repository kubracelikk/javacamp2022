package ikincihafta;

public class methodOverloading {
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) { //aynı isimde ama farklı sayıda parametreler almış metotlar,buna method overloading denir
		return sayi1 + sayi2 + sayi3;

	}
}
