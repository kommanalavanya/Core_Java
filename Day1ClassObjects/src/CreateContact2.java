
public class CreateContact2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact2 con1=new Contact2();
		con1.setContactid(2);
		con1.setFirstName("john");
		con1.setMobhileno(988765549L);
		con1.setEmail("john@gmail.com");
		con1.setCompany("hitachi");
		System.out.println(con1.getContactid());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
	}

}
