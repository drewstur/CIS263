/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab05 - Pilot using objects/getters/setters
	Due:		Due: 09/25/14
	Instructor: Michael Mick
*/
public class TestPilot
{
   public static void main(String[] args)
   {   //create reference variables
       Pilot pilotOne, pilotTwo, pilotThree, pilotFour;
       //create objects
       pilotOne = new Pilot();
       pilotTwo = new Pilot(11);
       pilotThree = new Pilot(12, 55);
       pilotFour = new Pilot(13, 35, false, true);
       //display objects
       pilotOne.display();
       pilotTwo.display();
       pilotThree.display();
       pilotFour.display();
   }
}