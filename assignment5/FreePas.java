package assignment;

public class FreePas extends Fare {

	public double calculateFare(){
		 fare=0;
		if(destination<=20){
			return fare=destination*0;
		}else if(destination<=40){
			return fare=destination*0;
		}else if(destination<=60){
			return fare=destination*0;
		}else if(destination<=80){
			return fare=destination*0;
		}
		else if(destination<=100){
			return fare=destination*0;
		}
		return fare;
	
	}
	public void PrintFare(){
		System.out.println(" freedom fighter no fee:"+fare);
	}
}
