/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab08 - Exceptions
    Due:        Due: 10/30/2014
    Instructor: Michael Mick
*/
public class Ball
{
       public static final float NO_AIR = 0F;
       public static final float LOW_AIR = 10F;
       public static final float NORMAL_AIR = 25F;
       public static final float HIGH_AIR = 30F;

       private final boolean DEFLATED = false;
       private final boolean INFLATED = true;

       private boolean inflated = INFLATED;
       private float airPressure = 5;

       public Ball()
       {
	   }

	   public Ball(float ballPressure) throws BallException
	   {
		   setAirPressure(ballPressure);
	   }

	   public boolean isInflated()
	   {
		   return inflated;
	   }

	   private void setInflated(boolean newInflated)
	   {
		   this.inflated = newInflated;
	   }

	   public float getAirPressure()
	   {
		   return airPressure;
	   }

	   public void setAirPressure(float newAirPressure) throws BallException
	   {
		   if(newAirPressure > NO_AIR)
		   {
		       if(newAirPressure < HIGH_AIR)
		       {
		           airPressure = newAirPressure;
		           setInflated(INFLATED);
			   }
			   else
			   {
				    throw new BallException(newAirPressure);
			   }
		   }
		   else
		   {
			   setInflated(DEFLATED);
			   airPressure = (NO_AIR);
		   }
	   }

	   public void bounce() throws BallException
	   {
		   if(isInflated())
			   throw new BallException("You must inflate the ball before you can bounce it!");

		   if(airPressure < LOW_AIR)
		   	   throw new BallException("The ball needs more air before you can bounce it!");

	   }

	   public String toString()
	   {
		   if(isInflated())
	   	   {
		       return "inflated ball with an air pressure of " +this.getAirPressure();
		   }
		   else
		   {
			   return "uninflated ball with an air pressure of " +this.getAirPressure();
		   }
	   }
}