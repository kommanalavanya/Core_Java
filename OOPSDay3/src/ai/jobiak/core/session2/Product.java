package ai.jobiak.core.session2;

public class Product {
	String description;
	double price;
void product() {
	
}
public Product(String description, double price) {
	
	this.description = description;
	this.price = price;
}
public Product(Product product)//copy constructor
{
	this.description = product.description;
	this.price = product.price;
}
@Override
public String toString() {
	return "Product [description=" + description + ", price=" + price + "]";
}


}
