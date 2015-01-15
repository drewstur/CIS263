public class Boat
{
	protected double length = 19;
	protected int year = 2007;

	public Boat()
	{
	}

	public Boat(double length, int year)
	{
		this.length = length;
		this.year = year;
	}

	public double getLength()
	{
		return length;
	}

	public int getYear()
	{
		return year;
	}
}

class MotorBoat extends Boat
{
	private final int MIN_MOTORS = 0;
	private final int MAX_MOTORS = 4;
	private int numberOfEngines = 1;

	public MotorBoat()
	{
		super();
	}

	public MotorBoat(int numberOfEngines, double length, int year)
	{
		super(length, year);

		if(numberOfEngines >= 0 && numberOfEngines <=4)
		{
			this.numberOfEngines = numberOfEngines;
		}
		else
		{
			this.setNumberOfEngines(0);
		}

	}

	public int getMinMotors()
	{
		return MIN_MOTORS;
	}

	public int getMaxMotors()
	{
		return MAX_MOTORS;
	}

	public int getNumberOfEngines()
	{
		return numberOfEngines;
	}

	public void setNumberOfEngines(int numberOfEngines)
	{
		this.numberOfEngines = numberOfEngines;
	}

	public String toString()
	{
		return("This is a "+getClass().getName()+":"
			   +"\n   with a length of: "+super.getLength()
			   +"\n   made in the year: "+super.getYear()
			   +"\n  number of engines: "+getNumberOfEngines());
	}
}

class SailBoat extends Boat
{
	private final int MIN_SAILS = 1;
	private final int MAX_SAILS = 12;
	private int numberOfSails = 1;
	private boolean motor = false;

	public SailBoat()
	{
		super(25, 2011);
	}

	public SailBoat(double length, int year, int numberOfSails, boolean motor)
	{
		super(length, year);
		this.numberOfSails = numberOfSails;
		this.motor = motor;
	}

	public int getMAX_SAILS()
	{
		return MAX_SAILS;
	}

	public int getMIN_SAILS()
	{
		return MIN_SAILS;
	}

	public int getNumberOfSails()
	{
		return numberOfSails;
	}

	public boolean getMotor()
	{
		return motor;
	}

	public void setNumberOfSails(int numberOfSails)
	{
		this.numberOfSails = numberOfSails;
	}

	public void setMotor(boolean motor)
	{
		this.motor = motor;
	}

	public String toString()
	{
		return("This is a "+getClass().getName()+":"
			   +"\n width a length of: "+getLength()
			   +"\n  made in the year: "+getYear()
			   +"\n   number of sails: "+getNumberOfSails()
			   +"\n    motor on board: "+getMotor());
	}
}
