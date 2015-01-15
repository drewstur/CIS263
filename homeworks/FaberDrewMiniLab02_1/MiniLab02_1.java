/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab 02_1 - Data types and Casting
	Due:		Due: 09/07/14
	Instructor: Michael Mick
*/

public class MiniLab02_1
{
	public static void main(String[] args)
	{
		//primitive data type; named constant, literal constant
		final int FIVE = 5;

		//primitive data type variables, literal constant
		int result, remainder;
		float decimalNumber = 43.5F;

		//implicit casting, String concatenation, escape sequences, extra spaces in \t to push output to next column
		System.out.println("The float result of "+decimalNumber+"/"+FIVE+" "+"is   \t"+decimalNumber/FIVE);

		//explicit casting, integer division
		result = (int) decimalNumber/FIVE;
		System.out.println("\nThe integer result of "+decimalNumber+"/"+FIVE+" "+"is \t"+result);

		//modulus division
		remainder = (int)decimalNumber%FIVE;
		System.out.println("\nThe integer remainder of "+decimalNumber+"/"+FIVE+" "+"is \t"+remainder);
	}
}