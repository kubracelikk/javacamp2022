package ikincihafta;

public class classMain {

	public static void main(String[] args) {
		//CustomerManager sınıfını çağırdığım main classı
		// reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type
		int sayi1 = 10; // primitive tipler stackte tutulur referans no ve içeriğiyle birlikte
		int sayi2 = 20;
		sayi2 = sayi1; // sayi2=10
		sayi1 = 30; // sayi1=30
		System.out.println(sayi2);

		// diziler referans tiptir. yani referansları(adresleri) stackte tutulurken
		// içerikleri heapte tutulur(new ile oluşturulanlar heapte tutulur))
		int[] sayilar1 = new int[] { 1, 2, 3 }; // ={1,2,3} şeklinde de yazılır
		int[] sayilar2 = { 4, 5, 6 };
		sayilar2 = sayilar1; // referans no eşitlendi,ikisi de aynı içeriğe gidiyor,iki değişken aynı
								// nesneyitutuyor
		sayilar1[0] = 10; 
	    System.out.println(sayilar2[0]); 
	}

}
