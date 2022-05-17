import java.util.Arrays;
import java.util.*;

public class CreatePosts {
	
	String name;
    String About;
    String Phoneno;
	String contacts[]=new String[3];  
    String email;
    String s;
    String msg;
 
   Scanner sc=new Scanner(System.in);
    
    public CreatePosts()
    {
    	
    }
    public CreatePosts(String name, String about, String phoneno,
    		String[] contacts, String email) {
		this.name = name;
		About = about;
		Phoneno = phoneno;
		this.contacts = contacts;
		this.email = email;
	}
    public void register()
    {
    	System.out.print("phone no: ");
    	System.out.println(Phoneno);
    	
    }
  
public String getname(){
     return name;
   }
   public String getabout(){
       return About;
  }
   public  String getPhoneno(){
   return Phoneno;
   }
   public String getemail(){
     return email;
    }


	// TODO Auto-generated method stub
	     
	  public void opencontact() {
		  System.out.println("search contact");
		  s=sc.next();
		  System.out.println("send message");
		   msg=sc.next();
		  
	  }
	 
	@Override
	public String toString() {
		return "CreatePosts [name=" + name + ", About=" + About + ", Phoneno=" + Phoneno + ", contacts="
				+ Arrays.toString(contacts) + ", email=" + email + "]";
	}
	  
	    
	   
	



}
