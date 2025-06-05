package programs;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int n=s.nextInt();
		    System.out.println("Enter number:");
		    if(n % 2==0)
		    	System.out.println("Number is even");
		    else
		    	System.out.println("Number is odd");
	}
		    

}
