/*
	Drew Faber
	CIS 263-01
	Lab 01 - FirstJApplet
	Due: 08/31/14
	Instructor: Michael Mick
*/

import javax.swing.JOptionPane;

public class FirstApp
{
	public static void main(String[] args)
	{
		System.out.println("Prof. Mick welcomes you to our flavor of Java!");

		JOptionPane.showMessageDialog(null,
		  "Prof. Mick welcomes you to our flavor of Java!",
		  "Lab01 application",
		  JOptionPane.INFORMATION_MESSAGE);
	}
}