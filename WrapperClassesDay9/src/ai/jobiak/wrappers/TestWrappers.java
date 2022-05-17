package ai.jobiak.wrappers;

public class TestWrappers {

	public static void main(String[] args) {
	Number number=new Integer(10);
	System.out.println(number);
	number=new Integer(new String("10"));
	System.out.println(number);
	Double radius=new Double(25.75);
	System.out.println(radius);
	int i=9;
	Integer i1=new Integer(9);
	i=i1;//autoboxing
	i1=i;//unboxing
	String total="100";
	int inttotal=Integer.parseInt(total);
	Integer integertotal=Integer.parseInt(total);
   String total2=inttotal+"";
   Character ch=new Character('a');
   boolean res=Character.isLetter(ch);
   System.out.println(res);
	}

}
