package ai.jobiak.usesource;

import ai.jobiak.source.A;

public class Subclass extends A {
	public Subclass() {
		A obj=new A();
		//System.out.println(a);
		//System.out.println(b);
	//System.out.println(obj.c);//but not with the object of superclass
		System.out.println(c);
		System.out.println(d);
	}

}
