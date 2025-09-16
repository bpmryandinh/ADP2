import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Input decimal number: ");
        Scanner scan = new Scanner(System.in);
        //user input decimal number
        int decimalNumber = scan.nextInt();

        System.out.println("Decimal number: " + decimalNumber);
        //call binary method
        int binaryNumber = binary(decimalNumber);
        System.out.println("Binary number: " + binaryNumber);

    }

    public static int binary(int n) {
        int binaryNumber = 0;

        //base case
        if (n < 0) {
            return 0;
        } else if (n == 1) {
            return 1;

        //general case    
        } else {
            //recursive call
            //get remainder
            binaryNumber = n % 2 ; 
            /*
                add to binary number
                multiply by 10 to shift left
                call binary method with n/2
            */
            binaryNumber = binaryNumber + (10 * binary(n / 2));
            
            //return binary number
            return binaryNumber;


            
        }
        
    }

    
}