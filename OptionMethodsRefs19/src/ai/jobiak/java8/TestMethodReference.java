package ai.jobiak.java8;
import java.util.*;
class Utility{
	public Utility() {
		System.out.println("from default constructor");
	}
	void method() {
		System.out.println("from instance method");
	}
	static void method2() {
		System.out.println("from static method");
	}
}
interface TestRefs{
	void substitute();
}
public class TestMethodReference {

	public static void main(String[] args) {
		
         Utility util=new Utility();
         TestRefs ref=util::method;
         ref.substitute();
         TestRefs ref2=Utility::method2;
         ref2.substitute();
         TestRefs ref3=Utility::new;//constructor reference
         ref3.substitute();
         List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
         list.stream().forEach(System.out::println);
	}

}
