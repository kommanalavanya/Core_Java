package ai.jobiak.icecreamstore;

public class Icecream {
	private String brand;
	private String flavour;
	private double cost;
	private double weight;
	private double rating;
	boolean sugarFree;
	private String description;
	private String count;
	public Icecream() {
		// TODO Auto-generated constructor stub
	}
	public Icecream(String brand, String flavour, double cost, double weight, double rating, boolean sugarFree,
			String description, String count) {
		this.brand = brand;
		this.flavour = flavour;
		this.cost = cost;
		this.weight = weight;
		this.rating = rating;
		this.sugarFree = sugarFree;
		this.description = description;
		this.count = count;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getFlavour() {
		return flavour;
	}
	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public boolean isSugarFree() {
		return sugarFree;
	}
	public void setSugarFree(boolean sugarFree) {
		this.sugarFree = sugarFree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Icecream [brand=" + brand + ", flavour=" + flavour + ", cost=" + cost + ", weight=" + weight
				+ ", rating=" + rating + ", sugarFree=" + sugarFree + ", description=" + description + ", count="
				+ count + "]";
	}
	
	
	


}
