package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product();
		product.id = 1;
		product.name = "asus";
		product.description = "yeni bilgisayar";
		product.price = 5000;
		product.stockAmount = 3;

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}

}
