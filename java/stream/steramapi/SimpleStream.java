package steramapi;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
	public int sId;
	public String sName;
	public int sMarks;
	public Student(int sId, String sName, int sMarks) {
		
		this.sId = sId;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sMarks=" + sMarks + "]";
	}
	
	
	
}

public class SimpleStream {

	public static void main(String[] args) {
	List<Integer> number=Arrays.asList(24,56,78,98,3,9);
	
	 List<Integer> squar=number.stream().map(s -> s*s).collect(Collectors.toList());
	 System.out.println(squar);
	 
//         empList.stream()  //converted into stream
//             .filter(e->e.salary>60000) //filtering the data
//             .map(e->e.salary)//fetching the salary
//             .collect(Collectors.toList());//collecting as list
//         System.out.println(empSalList);

	 List<Integer> evenNumber=number.stream().filter(e -> e%2==0).collect(Collectors.toList());
	 System.out.println(evenNumber);
	 number.stream().filter(e -> e%2==0).forEach(e ->System.out.println(e));
	 
	 List<Student> student=new ArrayList<Student>();
	 student.add(new Student(1001,"siva",78));
	 student.add(new Student(1002,"siva reddy",88));
	 student.add(new Student(1003,"king",78));
	 student.add(new Student(1004,"raja",99));
	 student.add(new Student(1005,"rani",95));
	 student.add(new Student(1006,"maha rani",65));
	 student.add(new Student(1007,"ramu",28));
	 student.add(new Student(1008,"ravi",55));
	 student.add(new Student(1009,"siva",34));
	 
	 student.stream().filter(s -> s.sMarks>65).forEach(s ->System.out.println(s));
	 System.out.println("***************************");
	 System.out.println("NAMES STAR WITH S ONLY THAT DATA ONLY DISPLAY");
	 
	 student.stream().filter(s ->s.sName.startsWith("s")).forEach(s ->System.out.println(s));
	 
	 System.out.println("who scroe is 75 marks that data will be display  names only");
	 student.stream().filter(s ->s.sMarks>75).forEach(s-> System.out.println(s.sName));
	 
	 System.out.println("minum  of student marks");
	Student minmarks=student.stream().min((m1,m2) ->m1.sMarks>m2.sMarks?1:-1).get();
	System.out.println(minmarks);
	 
	System.out.println("maxmium of student marks");
	Student maxmarks=student.stream().max((m1,m2) ->m1.sMarks>m2.sMarks?1:-1).get();
	System.out.println(maxmarks);
	 
	
	}

}
