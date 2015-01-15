/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab05 - Arrays and Strings
    Due:        Due: 10/02/2014
    Instructor: Michael Mick
*/

import java.util.Scanner;

public class MiniLab06
{
	public static void main(String[] args)
	{
		String userString;
		char[] arrayString = new char[0];
		StringBuffer sBuffer = new StringBuffer();
		Scanner scan = new Scanner(System.in);

		System.out.println("");
		System.out.print("Enter a phrase: ");
		userString = scan.nextLine();

		arrayString = userString.toCharArray();

		System.out.println("");
		System.out.print("Entered message: ");

		for(int ctr = 0; ctr < arrayString.length; ctr++)
		{
			System.out.print(arrayString[ctr]);
		}

		sBuffer.append(arrayString);
		sBuffer.reverse();
		System.out.println("\n\nReversed: "+sBuffer);
		System.out.println("");
	}
}