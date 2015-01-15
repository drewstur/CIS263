/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab08 - Exceptions
    Due:        Due: 10/30/2014
    Instructor: Michael Mick
*/
public class BallException extends Exception
{
	public BallException(String msg)
	{
		super(msg);
	}

	public BallException(float pressure)
	{
		super("This ball would explode with a pressure of "+pressure);
	}
}