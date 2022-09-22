package assign3;

public class Nokia extends Mobile {
	public long iEMICode;
	public boolean isSingleSIM;
	public String processor; 
	public String sIMCard;
    public long mobileNo;
    
    
    public Nokia(long iEMICode, boolean isSingleSIM, String processor, String sIMCard, long mobileNo) {
		
		this.iEMICode = iEMICode;
		this.isSingleSIM = isSingleSIM;
		this.processor = processor;
		this.sIMCard = sIMCard;
		this.mobileNo = mobileNo;
	}

	public void  connectBlueTooth(){
 	   System.out.println("BlueTooth is connected");
 	   
    }
    
    public long getIEMICode(){
 	   return iEMICode;
    }
    public void  getWIFIConnection(){
 	   System.out.println("wifi conncection avaliable");
 	   
    }
    public void receive(){
 	   System.out.println("mesage was recevied");
 	   
    }
    public void sendMessage(){
 	   System.out.println("sent the message");
 	   
    }

	@Override
	public String toString() {
		return "Nokia [iEMICode=" + iEMICode + ", isSingleSIM=" + isSingleSIM + ", processor=" + processor
				+ ", sIMCard=" + sIMCard + ", mobileNo=" + mobileNo + "]";
	}
    
}
