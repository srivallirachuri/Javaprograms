package hello;

public abstract class Abstract {
	abstract void m1();
	void m2()
	{
		System.out.println("abstract method1");	
		}
}
class Abs extends Abstract{
	 void m1()
	 {
		 System.out.println("abstract method2");	
	 }
 
	public static void main(String[] args) {
		
		Abs a=new Abs();
		a.m1();
		a.m2();
		

	}
 } 
