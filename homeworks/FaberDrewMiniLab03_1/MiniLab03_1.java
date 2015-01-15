/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab03_1 - Scanner Integer
	Due:		Due: 09/11/14
	Instructor: Michael Mick
*/

import java.util.Scanner;

public class MiniLab03_1
{
	public static void main(String[] args)
	{
		boolean even = false;
		int inputNum;

		System.out.print("Enter an integer value: ");
		Scanner scan = new Scanner(System.in);
		inputNum = scan.nextInt();

		even = (inputNum%2 == 0);

		if(even)
		{
			even = true;
			System.out.println("The entered integer is even - "+even);
		}
		else
		{
			System.out.println("The enter integer is odd - "+even);
		}

		even = (inputNum%2 == 0) ? true:false;

		switch(inputNum)
		{
			case 3: case 7:
				System.out.println("\nYou win the grand prize!");
				break;
			case 2:
				System.out.println("\nYou win the 2nd place prize!");
				break;
			default:
				System.out.println("\nSorry! You were not a winner!");
				break;
		}
		System.out.println("\nProgram complete.");
	}
}