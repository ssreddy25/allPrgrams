package assign1;

import java.util.Scanner;

public class OnlineTringCourese {

	public static void main(String[] args) {
		FastTrackBatchStudent fbs = new FastTrackBatchStudent();
		CorporateBatchStudent cbs = new CorporateBatchStudent();
		WeekendBatchStudent wbs = new WeekendBatchStudent();
		CorporateWeekendBatchStudent cwbs = new CorporateWeekendBatchStudent();
		Scanner sc=new Scanner(System.in);
		int ch=0;
		while(true){
		System.out.println("**********************************");
		System.out.println("     ONLINE TRIAING COURSE        ");
		System.out.println("**********************************");
		System.out.println("| 1.FastTrackBatchStudent        |");
		System.out.println("| 2.CorporateBatchStudent        |");
		System.out.println("| 3.WeekendBatch Student         |");
		System.out.println("| 4.CorporateWeekendBatchStudent |");
		System.out.println("| 5.exist                        |");
		System.out.println("enter the your choice course");
		int choice=sc.nextInt();
		
			switch(choice){
			case 1:
				System.out.println("enter the student id");
				fbs.setStudentId(sc.nextInt());
				System.out.println("enter the student name");
				fbs.setName(sc.next());
				System.out.println("enter the student mobile number");
				fbs.setMobileNo(sc.nextLong());
				System.out.println("enter the student address");
				fbs.setAddress(sc.next());
				System.out.println(" chioces the your curose 1. JAVA  2.UI  3. TESTING");
				 ch=sc.nextInt();
				 if(ch==1){
					 fbs.setCourse("java");
				 }else if(ch==2){
					 fbs.setCourse("ui");
				 }else if(ch==3){
					 fbs.setCourse("testing");
					 
				 }
				 fbs.calculateFee(fbs.getCourse());
				 System.out.println("Student Id     :   " + fbs.getStudentId());
				 System.out.println("Student Name   :   " + fbs.getName());
				 System.out.println("Student Mobile :   " + fbs.getMobileNo());
				 System.out.println("Student Addres :   " + fbs.getAddress());
				 System.out.println("Selected course : " + fbs.getCourse());
				 System.out.println("Course Fee's   :  " + fbs.calculateFee(fbs.getCourse()));
					break;
				
			case 2:
				System.out.println("enter the student id");
				cbs.setStudentId(sc.nextInt());
				System.out.println("enter the student name");
				cbs.setName(sc.next());
				System.out.println("enter the student mobile number");
				cbs.setMobileNo(sc.nextLong());
				System.out.println("enter the student address");
				cbs.setAddress(sc.next());
				System.out.println(" chioces the your curose 1. JAVA  2.UI  3. TESTING");
				 ch=sc.nextInt();
				 if(ch==1){
					 cbs.setCourse("java");
				 }else if(ch==2){
					 cbs.setCourse("ui");
				 }else if(ch==3){
					 cbs.setCourse("testing");
					 
				 }
				 cbs.calculateFee(cbs.getCourse());
				 System.out.println("Student Id     :   " + cbs.getStudentId());
				 System.out.println("Student Name   :   " + cbs.getName());
				 System.out.println("Student Mobile :   " + cbs.getMobileNo());
				 System.out.println("Student Addres :   " + cbs.getAddress());
				 System.out.println("Selected course : " + cbs.getCourse());
				 System.out.println("Course Fee's   :  " + cbs.calculateFee(cbs.getCourse()));
					break;
			case 3:
				System.out.println("enter the student id");
				wbs.setStudentId(sc.nextInt());
				System.out.println("enter the student name");
				wbs.setName(sc.next());
				System.out.println("enter the student mobile number");
				wbs.setMobileNo(sc.nextLong());
				System.out.println("enter the student address");
				wbs.setAddress(sc.next());
				System.out.println(" chioces the your curose 1. JAVA  2.UI  3. TESTING");
				 ch=sc.nextInt();
				 if(ch==1){
					 wbs.setCourse("java");
				 }else if(ch==2){
					 wbs.setCourse("ui");
				 }else if(ch==3){
					 wbs.setCourse("testing");
					 
				 }
				 wbs.calculateFee(wbs.getCourse());
				 System.out.println("Student Id     :   " + wbs.getStudentId());
				 System.out.println("Student Name   :   " + wbs.getName());
				 System.out.println("Student Mobile :   " + wbs.getMobileNo());
				 System.out.println("Student Addres :   " + wbs.getAddress());
				 System.out.println("Selected course : " + wbs.getCourse());
				 System.out.println("Course Fee's   :  " + wbs.calculateFee(wbs.getCourse()));
					break;
			case 4:
				System.out.println("enter the student id");
				cwbs.setStudentId(sc.nextInt());
				System.out.println("enter the student name");
				cwbs.setName(sc.next());
				System.out.println("enter the student mobile number");
				cwbs.setMobileNo(sc.nextLong());
				System.out.println("enter the student address");
				cwbs.setAddress(sc.next());
				System.out.println(" chioces the your curose 1. JAVA  2.UI  3. TESTING");
				 ch=sc.nextInt();
				 if(ch==1){
					 cwbs.setCourse("java");
				 }else if(ch==2){
					 cwbs.setCourse("ui");
				 }else if(ch==3){
					 cwbs.setCourse("testing");
					 
				 }
				 cwbs.calculateFee(cwbs.getCourse());
				 System.out.println("Student Id     :   " + cwbs.getStudentId());
				 System.out.println("Student Name   :   " + cwbs.getName());
				 System.out.println("Student Mobile :   " + cwbs.getMobileNo());
				 System.out.println("Student Addres :   " + cwbs.getAddress());
				 System.out.println("Selected course : " + cwbs.getCourse());
				 System.out.println("Course Fee's   :  " + cwbs.calculateFee(cwbs.getCourse()));
					break;
			case 5:
				System.out.println("thank's for visiting ");
				System.exit(0);
				
				break;
				default :
					System.out.println("Please select your choice range 1-4 only");
				
			}
		}
	}

}
