package ai.jobiak.stringtask;

public class Palindrome {
	String s;

	public Palindrome() {
		// TODO Auto-generated constructor stub
	}

	public Palindrome(String s) {
		this.s = s;
	}
    public void print(String s) {
    	char[] ch=s.toCharArray();
    	int c=1;
    	int i=0;
    	int j=s.length()-1;
    	while((i<(s.length()/2))) {
    		if(ch[i]==ch[j]) {
    			i++;
    			j--;
    			continue;
    		}
    		else {
    			c=0;
    			break;
    		}
    		
    	}
    	if(c==1) {
    		System.out.println(s+" is a palindrome");
    	}
    	else {
    		System.out.println(s+" is not a palindrome");
    	}
    }
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
	
}
