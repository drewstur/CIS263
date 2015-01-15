/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab04_1 - Using Methods
	Due:		Due: 09/18/2014
	Instructor: Michael Mick
*/

import java.util.Scanner;

public class MiniLab04_1
{
   public static void main(String[] args)
   {
	   int iNum;
	   float fNum;
	   fNum = getInput();
	   iNum = (int)fNum;

	   if(iNum != fNum)
	   {
	       fNum = cube(fNum);
   	   }
   	   else
   	   {
		   fNum = cube(iNum);
	   }

	   printResult(fNum);
   }

   public static float getInput()
   {
	   float result;
	   Scanner scan = new Scanner(System.in);
	   System.out.print("Please enter a float number: ");
	   result = scan.nextFloat();
	   return(result);
   }

   public static float cube(float userInput)
   {
		return(userInput*userInput*userInput);
   }

   public static float cube(int userInput)
   {
   		return(int)(userInput*userInput*userInput);
   }

   public static void printResult(float cubedInput)
   {
		System.out.println("The cubed result is: "+cubedInput);
   }
}