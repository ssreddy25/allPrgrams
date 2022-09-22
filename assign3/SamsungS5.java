package assign3;

public class SamsungS5 extends Samsung  {
	 public String battry;
	 public String memory;
	public SamsungS5(long iEMICode, boolean isSingleSIM, String processor, String sIMCard, long mobileNo, String battry,
			String memory) {
		super(iEMICode, isSingleSIM, processor, sIMCard, mobileNo);
		this.battry = battry;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "SamsungS5 [battry=" + battry + ", memory=" + memory + "]";
	}
	 

}
