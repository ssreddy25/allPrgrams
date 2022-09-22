package assign1;

public class WeekendBatchStudent extends Student {
public double calculateFee(String course){
		
		double fee=0;
		double wbs=15000;
		if(course.equals("java")){
			return fee=15000;
		}else if (course.equals("ui")){
			return fee=12000;
		}
		else if(course.equals("testing")){
			return fee=10000;
		}
		return fee+wbs;
	}

}
