
public class Contact3 {
	private int contactid;
	private String FirstName;
	private long mobhileno;
	private String email;
	private String company;
	public Contact3()
	{
		
	}
	
	public Contact3(int contactid, String firstName, long mobhileno, String email, String company) {
		this.contactid = contactid;
		this.FirstName = firstName;
		this.mobhileno = mobhileno;
		this.email = email;
		this.company = company;
	}

	public int getContactid()
	{
		return contactid;
	}
	public String getFirstName()
	{
	 return FirstName;	
	}
	public long getMobhile()
	{
	 return mobhileno;	
	}
	public String getemail()
	{
	 return email;	
	}
	
	public String getcompany()
	{
	 return company;	
	}

	@Override
	public String toString() {
		return "Contact3 [contactid=" + contactid + ", FirstName=" + FirstName + ", mobhileno=" + mobhileno + ", email="
				+ email + ", company=" + company + "]";
	}
	


}
