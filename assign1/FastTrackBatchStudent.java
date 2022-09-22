package assign1;

public class FastTrackBatchStudent extends Student {
public double calculateFee(String course){
		
		double fee=0;
		double ftbs=5000;
		if(course.equals("java")){
			return fee=15000;
		}else if (course.equals("ui")){
			return fee=12000;
		}
		else if(course.equals("testing")){
			return fee=10000;
		}
		return fee+ftbs;
	}

}
