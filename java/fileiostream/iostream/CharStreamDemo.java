package iostream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("charstream.txt");
		fw.write(65);
		fw.write("\n");
		fw.write("Ojas");
		fw.write("\n");
		char[] ch = {'a','b','c'};
		fw.write(ch);
		fw.close();
		

	}

}
