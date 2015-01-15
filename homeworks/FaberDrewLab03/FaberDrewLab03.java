/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab03 - Payroll Calculation
	Due:		Due: 09/28/14
	Instructor: Michael Mick
*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FaberDrewLab03
{
    public static void main(String[] args)
    {
		 float hoursWorked, hourWage, totalPay;
		 String stringValue;

		 stringValue = JOptionPane.showInputDialog("Enter hours (0 to quit):");
		 hoursWorked = Float.parseFloat(stringValue);

		 while(hoursWorked > 0)
		 {
			  stringValue = JOptionPane.showInputDialog("Enter pay rate:");
			  hourWage = Float.parseFloat(stringValue);

			  totalPay = calcPay(hoursWorked, hourWage);

			  JOptionPane.showMessageDialog(null, "The calculated payment amount is "+String.format("$%.2f",+totalPay),
			    							      "CIS263 Lab03 Drew Faber Pay Calculator",
			                                      JOptionPane.INFORMATION_MESSAGE );

			  stringValue = JOptionPane.showInputDialog("Enter hours (0 to quit):");
			  hoursWorked = Float.parseFloat(stringValue);
		 }
    }

    public static float calcPay(float hours, float wage)
    {
		 return Math.round((hours*wage)*100)/100f;
    }
}
