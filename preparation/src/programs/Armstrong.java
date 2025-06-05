package programs;
//powers of a number equals to originL NUMBER
public class Armstrong {

	public static void main(String[] args) {

        int number = 371, originalNumber, remainder, result = 0;//declaration 

        originalNumber = number;//assigning number to check conditions

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}
