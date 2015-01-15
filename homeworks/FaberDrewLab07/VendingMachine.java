/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab08 - Vending Machine Exceptions
    Due:        Due: 11/23/2014
    Instructor: Michael Mick
*/
import java.util.Random;
import java.util.regex.*;

public class VendingMachine
{
	// soft drinks  candy bars  snacks
	private String[][] items = { {"Pepsi",		"Snickers",		"Potato Chips"},
								 {"Diet Pepsi",	"Resse's Cup",	"Ruffles"},
								 {"Dr. Pepper",	"M&M chocolate","Fritos"},
								 {"Diet Dr. P",	"Peanut M&Ms",	"Doritos"},
								 {"Sprite",		"Twisters",		"Almonds"},
								 {"Diet Sprite","Hershey's",	"Peanuts"} };

	private int[][] prices = { {75,65,30},
							   {80,60,35},
							   {70,55,40},
							   {75,60,45},
							   {60,45,50},
							   {65,40,35} };

	private int[][] quantity = { {3,1,0},
							     {4,6,5},
							     {7,5,4},
							     {5,0,5},
							     {0,4,0},
							     {6,4,3} };

    private int depositedAmt = 0;
    private boolean haveValidSelection = false;
    private int selectedRow = 0;
    private char selectedCol = 'A';

	// default constructor
	public VendingMachine()
  	{
  	}

	public int buyItem(String selection) throws VendingMachineException
	{
		Pattern validChars = Pattern.compile("[^A-Ca-c1-6]+");
		Matcher m1 = validChars.matcher(selection);

		Pattern selectionRange = Pattern.compile("[1-6]+");
		Matcher m2;
		boolean illegal = false;
		int change = -1;

		if(depositedAmt > 0)
		{
			if(selection.length() != 2) illegal = true;
			if(!illegal) illegal = m1.find();

			if(!illegal) if( Character.getNumericValue(selection.charAt(1)) < 1) illegal = true;

			m2 = selectionRange.matcher(selection.substring(0,1));
			if(!illegal) illegal = m2.find();

			haveValidSelection = !illegal;

			if(haveValidSelection)
			{
				selectedRow = Character.getNumericValue(selection.charAt(1) - 1);
				selectedCol = Character.toUpperCase(selection.charAt(0));
				int col = selectedCol - 65;

				if(quantity[selectedRow][col] > 0)
				{
					if( depositedAmt >= prices[selectedRow][col])
					{
						depositedAmt -= prices[selectedRow][col];
						--quantity[selectedRow][col];
						change = getChange();
					}
					else
						throw new VendingMachineException("Insufficient funds for item: "+items[selectedRow][col]+"\nCost: $0."+prices[selectedRow][col]+", Deposited: $0."+depositedAmt);
				}
				else
			   		throw new VendingMachineException("Out of stock on this item: "+items[selectedRow][col]+"\nCost: $0."+prices[selectedRow][col]);
			}
			else
				throw new VendingMachineException("Invalid item selection: "+selection);
		}
		else
			throw new VendingMachineException("Please enter proper funds before making selection");

		return change;
	}

	public void depositMoney(int payment)
	{
		if(payment > 0)
			depositedAmt += payment;
	}

	public int getChange()
	{
		int returned = depositedAmt;
		depositedAmt = 0;
		return returned;
	}

   	public int getDeposit()
   	{
		return depositedAmt;
   	}

	// returns String representation of object
  	public String toString()
  	{
		// display items, quantity on hand, and prices
		StringBuffer display = new StringBuffer();

		// holds display contents
		display.append("  Price  A (in stock)    Price  B (in stock)      Price  C (in stock)\n");
		display.append("1 $0."+prices[0][0]+"  Pepsi("+quantity[0][0]+")        $0."+prices[0][1]+"  Snickers("+quantity[0][1]+")       $0."+prices[0][2]+"  Potato Chips("+quantity[0][2]+")\n");
		display.append("2 $0."+prices[1][0]+"  Diet Pepsi("+quantity[1][0]+")   $0."+prices[1][1]+"  Resse's Cup("+quantity[1][1]+")    $0."+prices[1][2]+"  Ruffles("+quantity[1][2]+")\n");
		display.append("3 $0."+prices[2][0]+"  Dr. Pepper("+quantity[2][0]+")   $0."+prices[2][1]+"  M&Ms (reg)("+quantity[2][1]+")     $0."+prices[2][2]+"  Fritos("+quantity[2][2]+")\n");
		display.append("4 $0."+prices[3][0]+"  Diet Dr. P("+quantity[3][0]+")   $0."+prices[3][1]+"  Peanut M&Ms("+quantity[3][1]+")    $0."+prices[3][2]+"  Doritos("+quantity[3][2]+")\n");
		display.append("5 $0."+prices[4][0]+"  Sprite("+quantity[4][0]+")       $0."+prices[4][1]+"  Twisters("+quantity[4][1]+")       $0."+prices[4][2]+"  Almonds("+quantity[4][2]+")\n");
		display.append("6 $0."+prices[5][0]+"  Diet Sprite("+quantity[5][0]+")  $0."+prices[5][1]+"  Hershey's("+quantity[5][1]+")      $0."+prices[5][2]+"  Peanuts("+quantity[5][2]+")\n");

		return display.toString();
  	}
}