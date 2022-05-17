import java.util.function.*;
public class ConsumerInterface {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s.length());
		c.accept("hello");

	}

}
