package iostream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class ConsoleToFile {

	public static void main(String[] args) throws IOException {
		File file1=new File("siva.txt");
		file1.createNewFile();
		File file2=new File("Reddy");
	
		file2.mkdir();
		File file3=new File("Reddy","abc.txt");
		file3.createNewFile();
		
		FileOutputStream file=new FileOutputStream("siva.txt");
		int k;
		System.out.println("entr the  S stop the writing");
		while((k=System.in.read())!='s'){
			file.write((char)k);
			
		}
		System.out.println(" writing completed");
	}

}
