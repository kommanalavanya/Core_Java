package ai.jobiak.string;

public class TestString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="string instance";
		String str2="string instance";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
      String s1=new String("helloworld");
      String s2=new String("helloworld");
      System.out.println(s1.hashCode());
      System.out.println(s2.hashCode());
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
      
	}

}
