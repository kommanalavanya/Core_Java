package ai.jobiak.iostreams;
import java.io.*;
public class FileToFile {

	public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("C:\\jobiak\\core\\IOStreamDay15\\mydata.txt");
	FileWriter writer=new FileWriter("data1.txt");
	int data=fis.read();
	while(data!=-1) {
		System.out.print((char)data);
		writer.write((char)data);
		data=fis.read();
	}
	writer.close();
	}
}
