package iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderdemo {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("charstream.txt");
		BufferedReader br = new BufferedReader(fr);
		int k;
		//reading the file data into a console
		while((k=br.read())!=-1){
			System.out.print((char)k);
		}
		

	}

}
