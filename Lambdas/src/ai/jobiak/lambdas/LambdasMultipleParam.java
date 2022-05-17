package ai.jobiak.lambdas;

interface Addable{
	int add(int a,int b);
}
public class LambdasMultipleParam {

	public static void main(String[] args) {
		Addable a1=(a,b)->(a+b);
		System.out.println(a1.add(2, 3));
		

	}

}
