package ikincihafta;

public class ProductManager {
public void Add(Product product) {
	//JDBC ile veri tabanına kaydedicez
	System.out.println("Ürün eklendi: " + product.getName());
	
}
}
