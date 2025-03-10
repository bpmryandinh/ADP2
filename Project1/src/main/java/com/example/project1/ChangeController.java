package com.example.project1;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;



public class ChangeController {

    @FXML
    private Label welcomeText;

    //random price generator
    Random random = new Random();
    double randomPrice = (Math.random() * 10000);
    public void initialize() {
        randomPrice = Math.round(randomPrice);
        randomPrice = randomPrice / 100;
        welcomeText.setText("Price: $" + randomPrice); // display random price in scene
    }

    @FXML
    protected void MakeChange() { //button to make change
        double userMoney = Double.parseDouble(userInput.getText()); //converts user's input to double
        double change = (userMoney - randomPrice) * 100;
        change = Math.round(change);
        change = change / 100;

        //use to display change owed to the customer after inputing money
        double changeOwed = change;

        //if user inputs money less than randomPrice
        if (userMoney < randomPrice) {
            welcomeText.setText("Too low! Please pay the correct amount." +
                                "\n                       Price: $" + randomPrice);
        } else {

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
            while (change >= 50.00) { // fifty
                fifty = (int) (change / 50.00); // converts double to int
                change = ((change - 50.00 * fifty) * 100) / 100;
            }

            while (change >= 20.00) { // twenty
                twenty = (int) (change / 20.00);
                change = ((change - 20.00 * twenty) * 100) / 100;
            }

            while (change >= 10.00) { // ten
                ten = (int) (change / 10.00);
                change = ((change - 10.00 * ten) * 100) / 100;
            }

            while (change >= 5.00) { // five
                five = (int) (change / 5.00);
                change = ((change - 5.00 * five) * 100) / 100;
            }

            while (change >= 1.00) { // one
                one = (int) (change / 1.00);
                change = change - 1.00 * one;
            }

            while (change >= 0.25) { // quarter
                quarter = (int) (change / 0.25);
                change = change - 0.25 * quarter;
            }

            while (change >= 0.10) { // dime
                dime = (int) (change / 0.10);
                change = change - 0.10 * dime;
            }

            while (change >= 0.05) { // nickel
                nickel = (int) (change / 0.05);
                change = change - 0.05 * nickel;
            }

            while (change >= 0.01) { // penny
                penny = (int) (change / 0.01);
                change = change - 0.01 * penny;
                //rounding error that causes the program to be a penny short occasionally
            }

            // print the number of each currency
            differenceText.setText("You paid: $" + userMoney + //prints how much the user inputed
                                   "\n$" + userMoney + " - " + " $" + randomPrice); //displays formula

            changeText.setText("Change: $" + changeOwed);//create a function to display change owed

            //displays how much of each denomination is used for change
            fiftyText.setText("Fifties: " + fifty);
            twentyText.setText("Twenties: " + twenty);
            tenText.setText("Tens: " + ten);
            fiveText.setText("Fives: " + five);
            oneText.setText("Ones: " + one);
            quarterText.setText("Quarters: " + quarter);
            dimeText.setText("Dimes: " + dime);
            nickelText.setText("Nickels: " + nickel);
            pennyText.setText("Pennies: " + penny);
        }
    }

    @FXML
    //user inputs money here
    public TextField userInput;

    @FXML
    private Label differenceText;

    @FXML
    private Label changeText;

    @FXML
    private Label fiftyText;

    @FXML
    private Label twentyText;

    @FXML
    private Label tenText;

    @FXML
    private Label fiveText;

    @FXML
    private Label oneText;

    @FXML
    private Label quarterText;

    @FXML
    private Label dimeText;

    @FXML
    private Label nickelText;

    @FXML
    private Label pennyText;



}





