
public class StoreContacts {
	private Contact3 contacts[]=new Contact3[3];
	public StoreContacts() {
		
	}
	public StoreContacts(Contact3[] contacts) {
	
		this.contacts = contacts;
	}
	public Contact3[] getContacts() {
		return contacts;
	}
	public void setcontact(Contact3[] contacts)
	{
		this.contacts=contacts;
	}

}
