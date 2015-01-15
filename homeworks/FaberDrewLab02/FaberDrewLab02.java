/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab 02 - Rock,Paper,Scissors
	Due:		Due: 09/14/14
	Instructor: Michael Mick
*/
import java.util.Scanner;

public class FaberDrewLab02
{
   public static void main(String[] args)
   {

      int humanNumber, computerNumber;
	  String humanType ="", computerType ="", anotherRound, resultDecision;

      do
      {//gathering human decision
	     System.out.println("\nEnter your choice of");
		 System.out.println("   1. Rock");
		 System.out.println("   2. Paper");
		 System.out.println("   3. Scissors");
		 System.out.print("by typing the number: ");
		 Scanner scan = new Scanner(System.in);
		 humanNumber = scan.nextInt();

		 //computer decision is made
		 computerNumber =((int)(Math.round(Math.random()*10)))%3 + 1;
		 switch (computerNumber)
		 {
		    case 1: computerType = "Rock";
				    break;
	        case 2: computerType = "Paper";
					break;
		    case 3: computerType = "Scissors";
					break;
		 }

		  //setting correct message for string
		  if(humanNumber == 3 && computerNumber == 2)
		  {
		     resultDecision = "You win!!";
		  }
		  else if(humanNumber == 2 && computerNumber == 1)
		  {
		     resultDecision = "You win!!";
		  }
		  else if(humanNumber == 1 && computerNumber == 3)
		  {
			 resultDecision = "You win!!";
		  }
		  else if(humanNumber == computerNumber)
		  {
			 resultDecision = "A tie! We should do that again.";
		  }
		  else
		  {
		     resultDecision = "I win!!";
		  }

		  //setting correct string for human decision and displaying results or wrong input message
		  if(humanNumber > 0 && humanNumber <= 3)
		  {
		     if(humanNumber == 1)
			 {
			    humanType = "Rock";
			 }
			 else if(humanNumber == 2)
			 {
				humanType = "Paper";
			 }
			 else if(humanNumber == 3)
			 {
				humanType = "Scissors";
			 }
		     System.out.println("\nI choose "+computerType+", and you choose "+humanType+". "+resultDecision);
		  }
		  else
		  {
	         System.out.println("\nYou should enter only 1,2, or 3.");
	      }

      System.out.print("\nAgain?(Y/N): ");
	  anotherRound = scan.next();
      }while(anotherRound.equals("y"));
   }
}
