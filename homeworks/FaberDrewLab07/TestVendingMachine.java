/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab08 - Vending Machine Exceptions
    Due:        Due: 11/23/2014
    Instructor: Michael Mick
*/
import javax.swing.*;
import java.io.Console;

public class TestVendingMachine
{
	public static void main(String[] args) throws VendingMachineException
  	{
		int deposit = 0;
		int change = 0;
		String choice = null;
        Console console = System.console();

        if (console != null)
        {
			// create VendingMachine object
			console.format("Beginning Vending Machine Simulation.%n%n");

			VendingMachine vm1 = new VendingMachine();			// create a new vending machine object
			console.format("%s%n%n",vm1);

			deposit = Integer.parseInt(console.readLine("Enter money as integer (e.g., 50) or 0 to exit: "));

			while(deposit > 0)
			{
				try
				{
					vm1.depositMoney(deposit);
					choice = console.readLine("Please make a selection (e.g., A1): ");

					change = vm1.buyItem(choice);

					console.format("%nDispensing ...%n%n");
					console.format("%s%n",vm1);
					console.format("Change returned = %d%n%n",change);
				}
				catch(VendingMachineException vme)
				{
					System.out.println("Error: "+vme.getMessage());
				}
				deposit = Integer.parseInt(console.readLine("\nEnter money as integer (e.g., 50) or 0 to exit: "));
			}

			if(vm1.getDeposit() > 0)
				console.format("%nReturning change: $0.%d%n.", vm1.getChange());

			console.format("%nEnd of program.");
        }
        else
            System.err.println("No console.");
  	}
}