
public class TestGeek {

	public static void main(String[] args) {
		Geek g1 = new Geek("aa", 1);
		Geek g2 = new Geek("aa", 1);
		System.out.println(g1.hashCode());
		System.out.println(g2.hashCode());
		System.out.println(g1);
	}

}
