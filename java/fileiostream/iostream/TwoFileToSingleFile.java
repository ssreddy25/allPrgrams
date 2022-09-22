package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFileToSingleFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file1=new FileInputStream("siva.txt");
		
		FileInputStream file2=new FileInputStream("reddy.txt");
		FileOutputStream file3=new FileOutputStream("rangith.txt");
		
		SequenceInputStream file4=new SequenceInputStream(file1,file2);
		int k;
		System.out.println("copy two files to in single file ");
		while((k=file4.read())!=-1){
			file3.write((char)k);
			
		}
		System.out.println("file copy completed");
			
		}
		

}
