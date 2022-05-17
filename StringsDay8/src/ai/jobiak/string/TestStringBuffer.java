package ai.jobiak.string;

public class TestStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer=new StringBuffer("jobiak.ai");
		System.out.println(buffer);
		
		System.out.println(buffer.length());
       System.out.println(buffer.capacity());
       buffer.append("@vizag");
       buffer.insert(0, "@vijaywada");
       
       System.out.println(buffer);
       System.out.println(buffer.length());
       System.out.println(buffer.capacity());
       buffer.replace(0,"@vijaywada".length(),"@hyderabad");
       System.out.println(buffer);
       System.out.println(buffer.length());
       System.out.println(buffer.capacity());
       buffer.delete(0, "@hyderabad".length());
       System.out.println(buffer);
       System.out.println(buffer.length());
       System.out.println(buffer.capacity());
       buffer.trimToSize();
     
       System.out.println(buffer.length());
       System.out.println(buffer.capacity());
       System.out.println(buffer.reverse());
	}

}
