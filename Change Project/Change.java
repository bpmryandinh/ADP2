import java.util.Random;
import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

         // display bill
        double randomPrice = (Math.random() * 10000);
        randomPrice = Math.round(randomPrice);
        randomPrice = randomPrice/100;

        System.out.println("Price: " + randomPrice);
        

        // user input change
        System.out.println("\nEnter money");
        int userMoney = scan.nextInt();

        // subtract randomPrice - userMoney
        // not dollarBills no more
        double change = (userMoney - randomPrice) * 100;
        change = Math.round(change);
        change = change/100;

        System.out.println("\nChange: " + change);

        // denominations
        // saves how many of each
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        //loop through each denomoination of currency
            while (change > 50.00) { // fifty
                fifty = (int) (change / 50.00); // converts double to int

                change = ((change - 50.00 * fifty)*100)/100;

                //System.out.println("New Change: " + change); check
                
                } 
                System.out.println("Fifties: " + fifty); // print the number of each currency
                
           while(change > 20.00) { // twenty
                twenty = (int) (change / 20.00);

                change = ((change - 20.00 * twenty)*100)/100;

                //System.out.println("New Change: " + change); check
                
                }
                System.out.println("Twenties: " + twenty); // print the number of each currency

             while (change > 10.00) { // ten
                ten = (int) (change / 10.00);

                change = ((change - 10.00 * ten)*100)/100;

                //System.out.println("New Change: " + change); check
                
                } 
                System.out.println("Tens: " + ten);  // print the number of each currency

            while (change > 5.00) { // five
                five = (int) (change / 5.00);

                change = ((change - 5.00 * five)*100)/100;

                //System.out.println("New Change: " + change); 
                
                }
                System.out.println("Fives: " + five); // print the number of each currency
            
            while (change > 1.00) { // one
                one = (int) (change / 1.00);
            
                change = change - 1.00 * one;

                //System.out.println("New Change: " + change); 
                
                } 
                System.out.println("Ones: " + one); // print the number of each currency

            while (change >= 0.25) { // quarter
                quarter = (int) (change / 0.25);
               
                change = change - 0.25 * quarter;
                
                System.out.println("\nQuarter Change: " + change);  

                } 
                System.out.println("Quarters: " + quarter); // print the number of each currency

            while (change >= 0.10) { // dime
                dime = (int) (change / 0.10);
                //System.out.print("Dime change: ");   
                change = change - 0.10 * dime;
                
                System.out.println("\nDime Change: " + change); 

                } 
                System.out.println("Dimes: " + dime); // print the number of each currency

            while (change >= 0.05) { // nickel
                nickel = (int) (change / 0.05);

                change = change - 0.05 * nickel;
                
                System.out.println("\nNickel Change: " + change);

                } 
                System.out.println("Nickels: " + nickel); // print the number of each currency

            while (change >= 0.01) { // penny
                penny = (int) (change / 0.01);
                
                change = (change - 0.01 * penny);
                
                System.out.println("\nPenny Change: " + change); 

                if(change >= 0.005){
                    penny = penny + 1;
                }
                }
                System.out.println("Pennies: " + penny); // print the number of each currency
        
    }

}


