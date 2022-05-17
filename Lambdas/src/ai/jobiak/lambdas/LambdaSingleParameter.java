package ai.jobiak.lambdas;

interface Hello{
	public String say(String name);
}
public class LambdaSingleParameter {

	public static void main(String[] args) {
		 Hello h1=(name)->{
			 return "Welcome to "+name;
		 };
         System.out.println(h1.say("Lambdas"));
	}

}
