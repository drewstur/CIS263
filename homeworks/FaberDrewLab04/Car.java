/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab04 - A Car Object
	Due:		Due: 10/12/14
	Instructor: Michael Mick
*/

public class Car
{
	public final static int PARK = 0;
	public final static int REVERSE = 1;
	public final static int NEUTRAL = 2;
	public final static int DRIVE = 3;

	private int speed = 0;
	private int gear;
	private boolean on = false;
	private String make = "Dodge";
	private String model = "Caravan";
	private String color = "white";

	public Car()
	{
	}

	public Car(String make, String model)
	{
		this.make = make;
		this.model = model;
	}

	public Car(String color, String make, String model)
	{
		this.color = color;
		this.make = make;
		this.model = model;
	}

	public int getSpeed()
	{
		return speed;
	}

	public String getMake()
	{
		return make;
	}

	public String getModel()
	{
		return model;
	}

	public String getColor()
	{
		return color;
	}

	public String getGear()
	{
		String currentGear = "";

		if(this.gear == PARK)
			currentGear = "Park";
		if(this.gear == REVERSE)
			currentGear = "Reverse";
		if(this.gear == NEUTRAL)
			currentGear = "Neutral";
		if(this.gear == DRIVE)
			currentGear = "Drive";

		return currentGear;
	}

	public boolean getOn()
	{
		return on;
	}

	public void setOn(boolean on)
	{
		this.on = on;
	}

	public void setColor(String color)
	{
		this.color = "repainted to "+color;
	}

	public void setSpeed(int speed)
	{
		if(this.gear == DRIVE || this.gear == REVERSE)
			this.speed = speed;
	}

	public void setGear(final int gear)
	{
		if(this.speed == 0)
			this.gear = gear;
	}

	public String toString()
	{
		return ("This Car is a "+getColor()+", "+getMake()+" "+getModel()+"."
				+"\nIt is in "+getGear()+" with a speed of "+getSpeed()
				+"\nand currently is "+((getOn()) ? "running":"not running")+"\n");
	}
}