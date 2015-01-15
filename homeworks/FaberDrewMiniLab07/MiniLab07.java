/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab07 - Inheritence and Polymorphism
    Due:        Due: 10/09/2014
    Instructor: Michael Mick
*/

public class MiniLab07
{
	public static void main(String[] args)
	{
		MotorBoat mBoat1 = new MotorBoat();
		MotorBoat mBoat2 = new MotorBoat(2, 25, 2009);

		SailBoat sBoat1 = new SailBoat();
		SailBoat sBoat2 = new SailBoat(50, 2010, 3, true);

		System.out.println("Boat 1 before changes:\n"+mBoat1+"\n");
		if(mBoat1.getNumberOfEngines()<2)
			mBoat1.setNumberOfEngines(3);
		System.out.println("Boat 1 after changes:\n"+mBoat1+"\n");

		System.out.println("Boat 2 before changes:\n"+mBoat2+"\n");
		if(mBoat2.getNumberOfEngines()<2)
			mBoat2.setNumberOfEngines(5);
		System.out.println("Boat 2 after changes:\n"+mBoat2+"\n");

		System.out.println("Boat 3 before changes:\n"+sBoat1+"\n");
		if(!sBoat1.getMotor())
			sBoat1.setMotor(true);
		if(sBoat1.getNumberOfSails()<3)
			sBoat1.setNumberOfSails(3);
		System.out.println("Boat 3 after changes:\n"+sBoat1+"\n");

		System.out.println("Boat 4 before changes:\n"+sBoat2+"\n");
		sBoat2.setMotor(false);
		sBoat1.setNumberOfSails(25);
		System.out.println("Boat 4 after changes:\n"+sBoat2+"\n");
	}
}

