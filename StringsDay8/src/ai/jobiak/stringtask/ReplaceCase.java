package ai.jobiak.stringtask;

public class ReplaceCase {
	String s;
	StringBuffer str1=new StringBuffer();
	public ReplaceCase() {
		
	}

	public ReplaceCase(String s) {
		this.s = s;
	}
    public void print(String  s) {
    	System.out.println("The converted String is");
    	System.out.println(s.toUpperCase());
    	
    	
    }
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	

}
