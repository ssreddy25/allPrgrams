package assign1;

public class CorporateWeekendBatchStudent extends Student {
public double calculateFee(String course){
		
		double fee=0;
		double cwbs=25000;
		if(course.equals("java")){
			return fee=15000;
		}else if (course.equals("ui")){
			return fee=12000;
		}
		else if(course.equals("testing")){
			return fee=10000;
		}
		return fee+cwbs;
	}

}
