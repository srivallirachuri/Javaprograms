package constructors;

class Emp {
	void salary()
	{
		int sal=20000;
		System.out.println("Emp1 salary is:"+sal);
		
	}
}
 class Moverriding extends Emp
{
	void salary()
	{
		int sal=30000;
		System.out.println("Emp1 salary is:"+sal);
	}
	public static void main(String[] args)
	{
		Emp e=new Emp();
		e.salary();
	}
	
}

