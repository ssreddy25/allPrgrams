package assign3;

public class NokiaLumis625 extends Nokia {
	public String battry;
	 public String memory;
	public NokiaLumis625(long iEMICode, boolean isSingleSIM, String processor, String sIMCard, long mobileNo,
			String battry, String memory) {
		super(iEMICode, isSingleSIM, processor, sIMCard, mobileNo);
		this.battry = battry;
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "NokiaLumis625 [battry=" + battry + ", memory=" + memory + ", iEMICode=" + iEMICode + ", isSingleSIM="
				+ isSingleSIM + ", processor=" + processor + ", sIMCard=" + sIMCard + ", mobileNo=" + mobileNo
				+ ", getIEMICode()=" + getIEMICode() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
}
