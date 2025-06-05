package programs;
import java.lang.*;
public class Powerbase {

	public static void main(String[] args) {
	    int base=2;
        int exp=3;
        int res=1;
        while(exp!=0){
            res*=base;
            exp--;
        }
        System.out.println("Result:"+res);

	}

}
