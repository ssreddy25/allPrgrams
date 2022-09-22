package exceptionhandling;

class RanhithError extends RuntimeException{
	RanhithError(String name){
		super(name);	
	}

}
public class Throwable {

	public static void main(String[] args) {
		  throw new RanhithError("runtime");
	}

}
