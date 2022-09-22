package iostream;

import java.io.IOException;

public class ConsoleToConsole {

	public static void main(String[] args)throws IOException {
		System.out.println("enter the s stop to the wriing");
        int k;
        while((k=System.in.read())!='s'){
        	System.out.print((char)k);
        }
	}

}
