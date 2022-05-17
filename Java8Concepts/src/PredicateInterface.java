
import java.util.function.*;

public class PredicateInterface {

	public static void main(String[] args) {
	Predicate<String> p=s->s.length()==0;
	System.out.println(p.test(""));
	}

}
