package assignment;

public class Fare {
	public int origin=1;
	public int  destination;
	public  double fare;
	public double calculateFare(){
		 fare=0;
		if(destination<=20){
			return fare=destination*2;
		}else if(destination<=40){
			return fare=destination*2.5;
		}else if(destination<=60){
			return fare=destination*3;
		}else if(destination<=80){
			return fare=destination*4.5;
		}
		else if(destination<=100){
			return fare=destination*5.5;
		}
		return fare;
	
	}
	public void PrintFare(){
		System.out.println("fare amount is a:"+fare);
	}

}
