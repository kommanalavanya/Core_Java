package ai.jobiak.iostreams;
import java.io.*;
public class FileToConsole {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\jobiak\\core\\IOStreamDay15\\src\\ai\\jobiak\\iostreams\\FileToConsole.java");
        int data=fis.read();
        while(data!=-1) {
        	System.out.print((char)data);
        	data=fis.read();
        }
	}

}
