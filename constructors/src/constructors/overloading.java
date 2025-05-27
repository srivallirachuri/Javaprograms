package constructors;

public class overloading {
	overloading(int sum){
		int a=10,b=3;
		sum=a+b;
		System.out.println("value is:"+sum);
	}
	void overloading(int sub){
		int a=30,b=20;
		sub=a-b;
		System.out.println("value is:"+sub);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage constructors;
		overloading obj1=new overloading(0);
		overloading obj2=new overloading(13);
		overloading obj3=new overloading(10);
	}
	}
