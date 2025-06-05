package programs;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 20;
        int a = 0,b =1;
        
     // Here we are printing 0th and 1st terms
       System.out.print (a + " , " + b + " , ");
       int nextterm;
       for(int i = 2;i<num;i++){
           nextterm=a+b;
           a=b;
           b=nextterm;
       System.out.print (nextterm+" , ");
       }

	}

}
