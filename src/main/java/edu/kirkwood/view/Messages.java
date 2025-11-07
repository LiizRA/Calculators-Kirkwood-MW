package edu.kirkwood.view;

import static edu.kirkwood.view.UIUtility.displayMessage;

public class Messages {

    public static void hello() {
        displayMessage("Welcome to the Kirkwood Calculators Application");
    }

    public static void goodbye() {
        displayMessage("Goodbye");
    }

    public static void fractionGreet() {
        displayMessage("Welcome to Marc's Fraction Calculator");
        System.out.println("Enter calculations in the format: [fraction] [operator] [fraction]");
        System.out.println("Example: 1 1/2 + 3/4\n");
    }

    public static void fractionGoodbye() {
        displayMessage("Thank you for using Marc's Fraction Calculator");
    }

    public static void investmentGreet() {
        displayMessage("Welcome to Lizbeth's Investment Calculator");
        // You'll need to update the instructions for how the user interacts with the investment calculator
        System.out.println("Enter the values in format of [Amount invested (in stocks and bonds)] " +
                ",[Stock Rate], [Bond Rate], [Annual income]).");
        System.out.println("Example: \n50000,\n 6,\n 2 ,\n 1892 ,\n This should return 22,300 in bonds and 27,700 in stocks"); // This should return 22,300 in bonds and 27,700 in stocks
    }


    public static void investmentGoodbye() {
        displayMessage("Thank you for using Liiz's Investment Calculator");
    }
}
