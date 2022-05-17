package ai.jobiak.iostreams;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class KeyboardToFile {

	public static void main(String[] args) throws IOException {
		FileWriter writer=new FileWriter("mydata.txt");
		DataInputStream dis=new DataInputStream(System.in);
		String data=dis.readLine();
		while(!data.equals("stop")) {
			writer.write(data);
			data=dis.readLine();
		}
       writer.close();
       System.out.println("after the loop");
	}

}
