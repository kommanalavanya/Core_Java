package ai.jobiak.stringtask;

public class CountLetters {
	String s;
	public CountLetters() {
		// TODO Auto-generated constructor stub
	}
	public CountLetters(String s) {
	
		this.s = s;
	}
	public void count(String s) {
		char ch[]=s.toCharArray();
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='i') {
				c++;
			}
		}
		System.out.println("The no. of i's in "+s+"  is "+c);
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	
   
}
