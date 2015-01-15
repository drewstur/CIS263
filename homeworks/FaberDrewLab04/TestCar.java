/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab04 - A Car Object
	Due:		Due: 10/12/14
	Instructor: Michael Mick
*/

public class TestCar
{
	public static void main(String[] args)
	{
		System.out.println("\nNew car.");
		Car car1 = new Car();
		System.out.println(car1.toString());

		System.out.println("\nNew car.");
		Car car2 = new Car("Ford", "Mustang");
		System.out.println(car2.toString());

		System.out.println("\nRepaint car to yellow; start car, put in reverse at 5 mph.");
		car2.setColor("yellow");
		car2.setOn(true);
		car2.setGear(Car.REVERSE);
		car2.setSpeed(5);
		System.out.println(car2.toString());

		System.out.println("\nStop car; put in drive at 30 mph.");
		car2.setSpeed(0);
		car2.setGear(Car.DRIVE);
		car2.setSpeed(30);
		System.out.println(car2.toString());

		System.out.println("\nNew car.");
		Car car3 = new Car("red", "Dodge", "Viper");
		System.out.println(car3.toString());

		System.out.println("\nStart car; put in drive at 70 mph.");
		car3.setOn(true);
		car3.setGear(Car.DRIVE);
		car3.setSpeed(70);
		System.out.println(car3.toString());

		System.out.println("\nStop car; put in park; turn off.");
		car3.setSpeed(0);
		car3.setGear(Car.PARK);
		car3.setOn(false);
		System.out.println(car3.toString());
	}
}