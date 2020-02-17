/************************************************************/
/*Program:  Chp-2_Arithmetic_Smallest_Largest				*/
/*CIS163AA                                                  */
/*Edward Muniz                                              */
/*2/15/20                                                   */
/*Practice with Java!										*/
/************************************************************/

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		//setup the input
		Scanner input = new Scanner(System.in);
		
		//provide user information about how to use the program
		System.out.print("Hello! The purpose of this program is to let you, the user, input 3 numbers. \n");
		System.out.print("With the three numbers you've provided we will calculate the following...\n");
		System.out.print("The sum, average, product, smallest, and largest of the numbers.\n\n");
		
		//prompt the user for the numbers
		System.out.print("Type your first number: ");
		int number1 = input.nextInt();
		System.out.print("Type your second number: ");
		int number2 = input.nextInt();
		System.out.print("Type your third number: ");
		int number3 = input.nextInt();
		input.close();
		System.out.print("Your numbers were " + number1 + ", " + number2 + ", and " + number3 + "\n");
		
		//calculate the sum
		int sum = number1 + number2 + number3;
		System.out.print("The sum of " + number1 + ", " + number2 + ", and " + number3 + " is " + sum + "\n");
		
		//calculate the average
		int average = sum / 3;
		System.out.print("The average of " + number1 + ", " + number2 + ", and " + number3 + " is " + average + "\n");
		
		//calculate the product
		int product = number1 * number2 * number3;
		System.out.print("The product of " + number1 + ", " + number2 + ", and " + number3 + " is " + product + "\n");
		
		//calculate the smallest and largest
		int smallest = 0;
		int largest = 0;
		
		if(number1 >= number2 && number1 >= number3) {
			largest = number1;
		} else if(number2 >= number1 && number2 >= number3) {
			largest = number2;
		} else if(number3 >= number1 && number3 >= number2) {
			largest = number3;
		}
		
		if(number1 <= number2 && number1 <= number3) {
			smallest = number1;
		} else if(number2 <= number1 && number2 <= number3) {
			smallest = number2;
		} else if(number3 <= number1 && number3 <= number2) {
			smallest = number3;
		}
		
		System.out.print("The largest number is " + largest + "\n");
		System.out.print("The smallest number is " + smallest);
		
	}//end method main

}//end class Arithmetic
