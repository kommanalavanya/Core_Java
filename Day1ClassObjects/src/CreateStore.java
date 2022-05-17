
public class CreateStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreContacts store=new StoreContacts();
		Contact3 con1=new Contact3(1,"john",988776655L,"lavanya7@gmail.com","hitachi");
		Contact3 con2=new Contact3(2,"john",988776695L,"john8.@gmail.com","horrorstory");
		Contact3 con3=new Contact3(3,"john",988776665L,"json9.@gmail.com","KFC");
		Contact3 contact3Array[]=new Contact3[3];
		contact3Array[0]=con1;
		contact3Array[1]=con2;
		contact3Array[2]=con3;
		store.setcontact(contact3Array);
		Contact3 contacts[]=store.getContacts();
		for(Contact3 contact:contacts){
			System.out.print(contact);
		}
		
	}

}
