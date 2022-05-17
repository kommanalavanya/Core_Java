import java.util.Arrays;

public class ChocolateStore {
	
	
	private Chocolate chocolates[]=new Chocolate[10];
	 public ChocolateStore() {
		// TODO Auto-generated constructor stub
	}
	public ChocolateStore(Chocolate[] chocolates) {
		this.chocolates = chocolates;
	}
	public Chocolate[] getChocolates() {
		return chocolates;
	}
	public void setChocolates(Chocolate[] chocolates) {
		this.chocolates = chocolates;
	}
	@Override
	public String toString() {
		return "ChocolateStore [chocolates=" + Arrays.toString(chocolates) + "]";
	}
	
	
	 
}
