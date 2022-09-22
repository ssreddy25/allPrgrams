package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFILE {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("siva.txt");
		
		FileOutputStream file2=new FileOutputStream("reddy.txt");
		int k;
		System.out.println("enter the S to stop the writing");
		while((k=file1.read())!=-1){
			file2.write(k);
        }
		System.out.println("file copy completed");
		
		
		

	}

}
