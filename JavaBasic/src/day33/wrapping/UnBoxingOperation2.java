package day33.wrapping;

public class UnBoxingOperation2 {

	public static void main(String[] args) {
	
		Double doubleObj=25.2566;//
		System.out.println("doubleObj: "+doubleObj);
		//un-boxing
		double salary=doubleObj.doubleValue();// 
		System.out.println(salary);
		System.out.println(doubleObj==salary);//
		
		Boolean b=true;//
		boolean b1=b.booleanValue();//
		System.out.println(b1);
		
		Character c1=new Character('a');//
		char c2=c1.charValue();//
		
		Integer i=25;
		double d=i.intValue();
		
		Double d2 = 11.1;
		int e=d2.intValue();
		System.out.println(e);
	}
}