package ai.jobiak.oops;

public class ChocolateIcecream {
	Icecream Chocolate;
	String brand;

	public ChocolateIcecream() {
		// TODO Auto-generated constructor stub
	}

	public ChocolateIcecream(Icecream chocolate, String brand) {
		super();
		Chocolate = chocolate;
		this.brand = brand;
	}

	public Icecream getChocolate() {
		return Chocolate;
	}

	public void setChocolate(Icecream chocolate) {
		Chocolate = chocolate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "ChocolateIcecream [Chocolate=" + Chocolate + ", brand=" + brand + "]";
	}

}
