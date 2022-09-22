package wrapperclass;

public class Wrperdemo {

	public static void main(String[] args) {
		//primitive to Wrapper
		int a=10;
		Integer integer=Integer.valueOf(a);
		System.out.println(integer);
		boolean b=true;
		Boolean boolea=Boolean.valueOf(b);
		System.out.println(b);
		//String to Wrapper
		String s="25";
		Integer integer4=Integer.valueOf(s);
		System.out.println(integer4);
		//wrapper to primitive
		Integer integer1= new Integer("45");
        int a1=integer1.intValue();
        System.out.println(a1);
        
        Character chr= new Character('a');
        char ch=chr.charValue();
        System.out.println(ch);
     
        Byte by=new Byte("56");
        byte b1=by.byteValue();
        System.out.println(b1);
        
        //primitive and Wrapper  to String
        int s3=56;
        String s1=Integer.toString(s3);
        System.out.println(s3);
        char ch1='b';
        String s2=Character.toString(ch1);
        System.out.println(ch1);
        
        
        Integer inte=new Integer(56789);
        String s5=inte.toString();
        System.out.println(s5);
        
        //String to primtive
        String str3="456789";
        int sdf=Integer.parseInt(str3);
        System.out.println(sdf);
        
        
	}

	

}
