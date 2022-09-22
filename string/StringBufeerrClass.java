package string;

public class StringBufeerrClass {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//capacity() check the string object;
		sb.append("siva sankar reddy");
		System.out.println(sb);//append() to use the append the into the 
		sb.deleteCharAt(6);//delete the only one character to the paticulaar the index.
		System.out.println(sb);
		sb.delete(0, 5);//delete() method used to the delete the start index to end-1 index;
		System.out.println(sb);
		sb.insert(7,252098);//insert() method used to add the insert any vlaues is overloaded methods float ,char,etc frist gives the index poistion and after add the . 
		System.out.println(sb);
		sb.setCharAt(0, 'u');//it used to the replace of position of the index.
		System.out.println(sb);
		sb.setLength(8);//it only get the 8 charater of the length
		System.out.println(sb);
		sb.ensureCapacity(300);
		System.out.println(sb.capacity());
		
	}

}