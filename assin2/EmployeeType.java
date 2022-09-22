package assin2;

import java.util.Scanner;

public class EmployeeType {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true){
		System.out.println("************************************");
		System.out.println("|       SELECT JOB TYPE            |");
		System.out.println("|    1.PartTimeEmployee            |");
		System.out.println("|    2.FullTimeEmployee            |");
		System.out.println("|    3.EXIST                       |");
		System.out.println("************************************");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("enter the employee id");
			int id=sc.nextInt();
			System.out.println("enter the basic salary");
			double bsal=sc.nextDouble();
			System.out.println("enter the allowances");
			double allowance=sc.nextDouble();
			System.out.println("enter the deductions");
			double dediction=sc.nextDouble();
			System.out.println("enter the fristname");
			String fname=sc.next();
			System.out.println("enter the lastname");
			String lname=sc.next();
			System.out.println("enter the address");
			String address=sc.next();
			System.out.println("enter the pincode");
			String pincode=sc.next();
			Employee pte=new PartTimeEmployee(id, bsal, allowance, dediction,fname, lname, address, pincode );
			System.out.println("empId            :"+pte.empId);
			System.out.println("realName         :"+pte.realName(fname, lname));
			System.out.println("empSal           :"+pte.calcSalary(bsal, allowance, dediction));
			System.out.println("empAddress       :"+pte.address);
			System.out.println("emppincode       :"+pte.pincode);
			break;
		case 2:
			System.out.println("enter the employee id");
			int id1=sc.nextInt();
			System.out.println("enter the basic salary");
			double bsal1=sc.nextDouble();
			System.out.println("enter the allowances");
			double allowance1=sc.nextDouble();
			System.out.println("enter the deductions");
			double dediction1=sc.nextDouble();
			System.out.println("enter the fristname");
			String fname1=sc.next();
			System.out.println("enter the lastname");
			String lname1=sc.next();
			System.out.println("enter the address");
			String address1=sc.next();
			System.out.println("enter the pincode");
			String pincode1=sc.next();
			Employee fte=new FullTimeEmployee(id1, bsal1, allowance1, dediction1,fname1, lname1, address1, pincode1);
			System.out.println("empId            :"+fte.empId);
			System.out.println("realName         :"+fte.realName(fname1, lname1));
			System.out.println("empSal           :"+fte.calcSalary(bsal1, allowance1, dediction1));
			System.out.println("empAddress       :"+fte.address);
			System.out.println("emppincode       :"+fte.pincode);
			break ;
		case 3:
			System.exit(0);
			
			break;
			default :
				System.out.println("Please select your choice range 1-3 only");
			
			
		}
		
		
	}
	}
}
