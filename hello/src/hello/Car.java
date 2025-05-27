package hello;

public abstract class Car {
	abstract void color(); 
}
class Kia extends Car{
	void color() {
		System.out.println("White");
	}
}

class Nexon extends Car{
	void color() {
		System.out.println("Black");
	}
}
class A{
public static void main(String[] args) {
		Kia k=new Kia();
		Nexon n=new Nexon();
		k.color();
        n.color();
}
}

	
	

