package ai.jobiak.core.session2;

public class ProductFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product("Iphone 13",12500);
		Product p1=new Product(p);
		System.out.println(p);
		System.out.println(p1);

	}

}
