package base;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Scott Matson
 */

import java.util.Scanner;

/*
Exercise 5 - Simple Math

You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output

What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints

-Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
-Keep the inputs and outputs separate from the numerical conversions and other processing.
-Generate a single output statement with line breaks in the appropriate spots.

Challenges

-Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
-Don’t allow the user to enter a negative number.
-Break the program into functions that do the computations.
-Implement this program as a GUI program that automatically updates the values when any value changes.
*/
public class App {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num = ui.nextLine();
        System.out.print("What is the second number? ");
        String num2 = ui.nextLine();

        int a = Integer.parseInt(num);
        int b = Integer.parseInt(num2);
        int product = a * b;
        int quotient = a / b;
        int sum = a + b;
        int difference = a - b;

        System.out.println(a + " + " + b + " = " + sum + "\n" + a + " - " + b + " = " + difference + "\n" + a + " * " + b + " = " + product + "\n" + a + " / " + b + " = " + quotient);



    }
}
