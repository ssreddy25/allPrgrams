package iostream;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//class Course {
//	public int courseId;
//	public String courseName;
//	public int courseFee;
//	
//	public Course(int courseId, String courseName, int courseFee) {
//		
//		this.courseId = courseId;
//		this.courseName = courseName;
//		this.courseFee = courseFee;
//	}
//
//	
//	
//}
class Student1   implements Externalizable {
	public int studentId;
	public String studentName;
	public long studentMobile;
	public String studentAddress;
	
	
	public Student1(){}
	

	

	public Student1( int studentId, String studentName,long studentMobile,  String studentAddress) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMobile = studentMobile;
		this.studentAddress = studentAddress;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		studentId=in.readInt();
		studentName=in.readUTF();
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(studentId);
		out.writeUTF(studentName);
		out.writeLong(studentMobile);
	
		
	}

	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + ", studentMobile=" + studentMobile
				+ ", studentAddress=" + studentAddress + "]";
	}

	
	
	
	
}

public class StudentExternizable {
	
	public void serlaizationMethod(Object obj){
		try {
			FileOutputStream fos=new FileOutputStream("carex.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("serilzation completed");
	}
     public Object deseralizationMethod(){
    	 Object obj=null;
    	 try {
			FileInputStream fos=new FileInputStream ("carex.txt");
				ObjectInputStream oos=new ObjectInputStream(fos);
				obj=oos.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 System.out.println("deserilazation completed");
    	 return obj;
     }
	public static void main(String[] args) {
		StudentExternizable studentExternizable=new StudentExternizable();
		
		Student1 student1=new Student1(123,"siva",954288437,"hyderab");
		studentExternizable.serlaizationMethod(student1);
		Student1 stu=(Student1) studentExternizable.deseralizationMethod();
		System.out.println("sstudent object detals not using externizable");
		System.out.println(student1);
		System.out.println(stu);

	}

}
