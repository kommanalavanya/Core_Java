package ai.jobiak.wrappers;

import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class TestSystem {

	public static void main(String[] args) {
	System.exit(0);
Scanner sc=new Scanner(System.in);
Properties prop=System.getProperties();
Enumeration enume=prop.elements();
while(enume.hasMoreElements()) {
	System.out.println(enume.nextElement());
}
System.currentTimeMillis();
System.gc();
	}

}
