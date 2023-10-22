/*
Define a method printResult() that takes two double parameters, and outputs "Power: " followed by the result of raising the first parameter to the power of the second parameter with a precision of two digits as follows, ending with a newline.

Ex: If the input is 0.50 2.50, then the output is:

Power: 0.18

Note:

Recall Math.pow(x, y) returns x to the power of y. Ex: Math.pow(6.0, 2.0) evaluates to 36.0.
Use System.out.printf("%.2f", myDouble) to output doubles with precision of two digits.
 */

import java.util.Scanner;

public class Result {

    /* Your code goes here */
    public static void printResult(double d1, double d2){
        double powerRaised = Math.pow(d1, d2);
        System.out.printf("Power: " + "%.2f\n", powerRaised);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double input1;
        double input2;

        input1 = scnr.nextDouble();
        input2 = scnr.nextDouble();

        printResult(input1, input2);
    }
}