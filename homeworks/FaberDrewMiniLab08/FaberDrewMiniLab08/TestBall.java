/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab08 - Exceptions
    Due:        Due: 10/30/2014
    Instructor: Michael Mick
*/
public class TestBall
{
	public static void main(String[] args) throws BallException
	{
		Ball myBall = new Ball(Ball.NORMAL_AIR);	// a new Ball with a normal air pressure
		Ball flatBall = new Ball(Ball.NO_AIR);		// a new Ball with no air pressure
		Ball lowBall = new Ball();					// a new default Ball
		Ball highBall = new Ball(Ball.NORMAL_AIR);	// a new Ball with a normal air pressure
//		Ball highBall2 = new Ball(Ball.HIGH_AIR);	// a new Ball with high air pressure

		// trying myBall
		try
		{
			System.out.println("My Ball is an "+lowBall);

			System.out.println("My ball has a pressure of "+myBall.getAirPressure());

			System.out.println("Can I bounce it?");
			myBall.bounce();
			System.out.println("Yes, I can bounce it!");
		}
		catch(BallException ex)
		{
		// when there is a problem, output the following, where be is the passed exception

			System.out.println("My Ball problem!\n"+ex);
		}



		// trying low ball
		try
		{
			System.out.println("\n\nLow Ball is an "+lowBall);

			if(lowBall.isInflated())
				System.out.println("Low ball is inflated at a pressure of "+lowBall.getAirPressure());

			System.out.println("Can I bounce it?");
			lowBall.bounce();
			System.out.println("Yes, I can bounce it!");
		}
		catch(BallException ex)
		{
		// when there is a problem, output the following, where be is the passed exception

			System.out.println("Low Ball problem!\n"+ex);
		}


		// trying flat ball
		try
		{
			System.out.println("\n\nFlat Ball is an "+flatBall);

			if(!flatBall.isInflated())
			{
				System.out.println("Increasing flat ball air pressure to "+Ball.NORMAL_AIR);
				flatBall.setAirPressure(Ball.NORMAL_AIR);
				flatBall.bounce();
				System.out.println("Now I can bounce it!");
			}
		}
		catch(BallException ex)
		{

		// when there is a problem, output the following, where be is the passed exception

			System.out.println("Flat Ball problem!\n"+ex);
		}



		// trying high ball
		try
		{
			System.out.println("\n\nHigh Ball is an "+highBall);

			System.out.println("Setting pressure to "+Ball.NO_AIR);
			highBall.setAirPressure(Ball.NO_AIR);
			System.out.println("High Ball is an "+highBall);

			System.out.println("Setting pressure to "+(Ball.HIGH_AIR+10));
			highBall.setAirPressure(Ball.HIGH_AIR+10);
			System.out.println("High Ball is an "+highBall);
		}
		catch(BallException ex)
		{

		// when there is a problem, output the following, where be is the passed exception

			System.out.println("High Ball problem!\n"+ex);
			// rethrow the original exception for highBall here
		}
		finally
		{
		// make it so this code will be done without regard to an exception
			System.out.println("\nEnd of Program\n");
		}
	}

}