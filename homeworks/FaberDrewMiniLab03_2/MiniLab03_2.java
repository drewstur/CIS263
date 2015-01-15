/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab03_1 - Scanner Integer
	Due:		Due: 09/11/14
	Instructor: Michael Mick
*/

/*
Purpose: to demonstrate the use of Loops in Java

- define needed variables (e.g., temp and inputNum)

- prompt the user to "Please enter an integer number between 1 and 10: " using Scanner for input

- be sure to insert a blank line following the output of each of the following:

- use a while() with braces to display, Counting at <temp>, for each value of temp to inputNum, inclusive; with temp initially 0

- use a while() without braces to display, Counting at <temp>, for each value of temp to inputNum, inclusive; with temp initially 0

- use a for() with braces to display, Counting at <temp>, for each value of temp to inputNum, inclusive
     set temp to 0 within the for() before beginning the loop

- use a for() without braces to display, Counting at <start>, for each value of temp to inputNum, inclusive;
    define the variable, start; use it to count the loops and properly initialize start to 0 within the for() before
    beginning the loop

- use a do/while() to display, Counting at <temp>, for each value of temp to inputNum, inclusive

- insert the following as the last statement in your program:
    System.out.println("\nProgram complete.");

- use comments appropriately
*/

import java.util.Scanner;

public class MiniLab03_2
{
	public static void main(String[] args)
	{
		int temp = 0, inputNum;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer number between 1 and 10: ");
		inputNum = scanner.nextInt();

		while(temp <= inputNum)
		{
			System.out.println("Counting at "+temp++);
		}

		temp = 0;
		while(temp <= inputNum)
			System.out.println("Count at "+temp++);


		for(temp = 0; temp <=  inputNum; temp++)
		{
			System.out.println("Counting at "+temp);
		}

		for(int start = 0; start <= inputNum; start++)
			System.out.println("Counting at "+temp);

		temp = 0;
		do
		{
			System.out.println("Counting at "+temp);
			temp++;
		}
		while(temp <= inputNum);

		System.out.println("\nProgram complete.");


	}
}