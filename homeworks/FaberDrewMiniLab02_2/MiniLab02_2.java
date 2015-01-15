/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab 02_2 - Scanner Integer
	Due:		Due: 09/07/14
	Instructor: Michael Mick
*/

import java.util.Scanner;

public class MiniLab02_2
{
	public static void main(String[] args)
	{
		int userInteger;
		boolean even, odd;

		//User enters an integer value
		System.out.print("Please enter an integer value: ");
		Scanner scan = new Scanner(System.in);
		userInteger = scan.nextInt();
		//shortcut assignment
		userInteger += 5;
		//assigning boolean values
		even = userInteger%2 == 0;
		odd = userInteger%2 == 1;

		System.out.println("Input +5 is even?: "+even);
		System.out.println("Input +5 is odd?:  "+odd);
	}
}