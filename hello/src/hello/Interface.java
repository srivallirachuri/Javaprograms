package hello;
interface I{
void m1();
void m2();
}
public class Interface implements I{
	public void m1() {
			System.out.println("Interface m1");
	}
	public void m2() {
		System.out.println("Interface m2");

	}
	public static void  main(String[] args) {
		Interface i=new Interface();
		i.m1();
		i.m2();
	
	}
 }


