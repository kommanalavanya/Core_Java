package ai.jobiak.string;

public class TestString {

	public static void main(String[] args) {
		String str = new String();
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str == null ? true : false);
		System.out.println(str.hashCode());
		System.out.println(str.toString());
		//--------------------
		
		
		String string=new String("\"Jobiak.com Grooming AI");
		System.out.println(string);
		System.out.println(string.length());
		System.out.println(string.hashCode());
		System.out.println("to string method"+string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		byte bytes[]= {65,66,67,68,69};
		String bytestr=new String(bytes);
		System.out.println(bytestr+"\n");
		char[] chars= {'U','S','c','r','e','a','m'};
		String charstr=new String(chars);
		System.out.println("char  "+charstr);
		String tongueTwister=new String("She sells sea shells on sea shore");
		char[] letters=new char[tongueTwister.length()];
		tongueTwister.getChars(0, tongueTwister.length(), letters, 0);
		for(char c:letters) {
		System.out.println(c);
		}
		System.out.println();
		String fromchars=new String(letters,10,10);
		System.out.println(fromchars);
		String name=new String("my name is lavanya");
		String copyName=new String(name);
		System.out.println("Name= "+name);
		System.out.println("Copy Name= "+copyName);
		boolean result=name==copyName;
		System.out.println(result);
		result=name.equals(copyName);
		System.out.println(result);
		result=name.equals(copyName.toUpperCase());
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
