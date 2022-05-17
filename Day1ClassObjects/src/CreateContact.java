
public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contact con1=new Contact();
		System.out.println(con1.contactid);
		System.out.println(con1.FirstName);
        System.out.println(con1.mobhileno);
        System.out.println(con1.email);
        System.out.println(con1.company);
        con1.contactid=1;
        con1.FirstName="John";
        con1.mobhileno=9963012876L;
        con1.email="john.doe@jobiak.com";
        System.out.println(con1.contactid);
		System.out.println(con1.FirstName);
        System.out.println(con1.mobhileno);
        System.out.println(con1.email);
        System.out.println(con1.company);
       
	}

}
