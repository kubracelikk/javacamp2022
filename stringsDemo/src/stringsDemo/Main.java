package stringsDemo;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı : "+mesaj.length()); //kaç eleman olduğu
		 * System.out.println("5.eleman : "+mesaj.charAt(4)); //kaçıncı elemanı istersek
		 * onu yazdırır System.out.println(mesaj.concat(" Yaşasın!")); //başka bir
		 * stringle birleştirmeyi sağlar. Yeni bir string oluşturur
		 * System.out.println(mesaj.startsWith("B")); //stringin ne ile başladığını
		 * kontrol edip,boolean değer döndürür System.out.println(mesaj.endsWith("."));
		 * //stringin ne ile bittiğini kontrol edip,boolean değer döndürür char
		 * karakterler[] = new char[5]; mesaj.getChars(0, 5, karakterler, 0); //mesajın
		 * ilk 5 elemanını yazdırır..karakterleri alması için karakter dizisi tanımlanır
		 * System.out.println(karakterler); System.out.println(mesaj.indexOf("av"));
		 * //verilen karakterin kaçıncı eleman olduğunu bulur
		 * System.out.println(mesaj.lastIndexOf('a')); //bu da sondan aramaya başlar
		 */

		String yeniMesaj = mesaj.replace(' ', '-'); // ilgili metindeki değerleri,kaakterleri değiştirir ing
													// karakterleri tr'ye çevirmek gibi
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 5)); // bir metnin içinden parça almak

		for (String kelime : mesaj.split(" ")) { // istediğimiz gibi parçalara ayırır burada boşluğa göre parçaladık
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase()); //hepsini küçük harfle yazar
		System.out.println(mesaj.toUpperCase()); //hepsini büyük harfle yazar
		System.out.println(mesaj.trim()); //stringin başında ve sonunda boşluk varsa onları yok eder
		
	}

}
