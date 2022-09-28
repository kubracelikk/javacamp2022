package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int number = 5;
		//int remainder = number % 2; // remainder kalan operatörü demektir
		//System.out.println(remainder);
		boolean isPrime = true; // isPrime asal demek ilk etapta sayıyı asal kabul ediyoruz

		if (number==1) {
			System.out.println("Sayı asal değildir");
			return; //bulunduğu bloğu bitirir
		}
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for (int i = 2; i < number; i++) { //sayı 2 olunca 2 den küçük olm. için döngüye girmez
			if (number % i == 0)
				isPrime = false; // if doğru çıkarsa false gelir
		}
		if (isPrime) { // isPrime==true demek ile aynı anlama gelir
			System.out.println("sayı asaldır");
		} else {
			System.out.println("sayı asal değildir");
		}
	}

}
