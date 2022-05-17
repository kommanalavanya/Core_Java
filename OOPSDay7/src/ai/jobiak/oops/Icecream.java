package ai.jobiak.oops;

public class Icecream {

	String name;
	double price;
	String rating;
	boolean sugarFree;

	public Icecream() {
		// TODO Auto-generated constructor stub
	}

	public Icecream(String name, double price, String rating, boolean sugarFree) {

		this.name = name;
		this.rating = rating;
		this.price = price;
		this.sugarFree = sugarFree;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public boolean isSugarFree() {
		return sugarFree;
	}

	public void setSugarFree(boolean sugarFree) {
		this.sugarFree = sugarFree;
	}

	@Override
	public String toString() {
		return "Icecream [name=" + name + ", price=" + price + ", rating=" + rating + ", sugarFree=" + sugarFree + "]";
	}

}
