package assign3;

import java.util.Scanner;

public class MoblieSpecification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true){
			
		
		System.out.println("********************************");
		System.out.println("| moblie types                  |");
		System.out.println("|   1.Samsung                   |");
		System.out.println("|   2.Nokia                     |");
		System.out.println("|   3.IPhone                    |");
		System.out.println("|   4.EXIST                     |");
		System.out.println("*********************************");
		
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
		System.out.println("enter the IEMICode");
		 long iemiCode=sc.nextLong();
		 System.out.println("enter the IsSingleSIM");
		 boolean isSingleSIM=sc.nextBoolean();
		 System.out.println("enter the processor of mobile");
		 String processor=sc.next();
		 System.out.println("enter the simcard name");
		 String simcard=sc.next();
		 System.out.println("entre the mobile number");
		 long mobile=sc.nextLong();
		 Samsung samsung=new Samsung(iemiCode,isSingleSIM,processor,simcard,mobile );
		 System.out.println(samsung);
		  samsung.connectBlueTooth();
		  samsung.getWIFIConnection();
		  samsung.receive();
		  samsung.sendMessage();
		  samsung.dial();
		  break;
		case 2:
			System.out.println("enter the IEMICode");
			 long iemiCode1=sc.nextLong();
			 System.out.println("enter the IsSingleSIM");
			 boolean isSingleSIM1=sc.nextBoolean();
			 System.out.println("enter the processor of mobile");
			 String processor1=sc.next();
			 System.out.println("enter the simcard name");
			 String simcard1=sc.next();
			 System.out.println("entre the mobile number");
			 long mobile1=sc.nextLong();
			 Nokia nokia=new Nokia(iemiCode1,isSingleSIM1,processor1,simcard1,mobile1);
			 System.out.println(nokia);
			 nokia.connectBlueTooth();
			 nokia.getWIFIConnection();
			 nokia.receive();
			 nokia.sendMessage();
			 nokia.dial();
			  break;
		case 3:
			System.out.println("enter the IEMICode");
			 long iemiCode2=sc.nextLong();
			 System.out.println("enter the IsSingleSIM");
			 boolean isSingleSIM2=sc.nextBoolean();
			 System.out.println("enter the processor of mobile");
			 String processor2=sc.next();
			 System.out.println("enter the simcard name");
			 String simcard2=sc.next();
			 System.out.println("entre the mobile number");
			 long mobile2=sc.nextLong();
			 IPhone iPhone =new IPhone(iemiCode2,isSingleSIM2,processor2,simcard2,mobile2);
			 System.out.println(iPhone);
			 iPhone.connectBlueTooth();
			 iPhone.getWIFIConnection();
			 iPhone.receive();
			 iPhone.sendMessage();
			 iPhone.dial();
			  break;
		case 4:
			System.out.println("thank's for visiting mobile shop ");
			System.out.println("visit agian ");
			System.exit(0);
			
			break;
			default :
				System.out.println("Please select your choice range 1-4 only");
			
		}
		
		}

	}

}
