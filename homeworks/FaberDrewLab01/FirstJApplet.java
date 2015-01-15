/*
	Drew Faber
	CIS 263-01
	Lab 01 - FirstJApplet
	Due: 08/31/14
	Instructor: Michael Mick
*/

import javax.swing.JApplet; //import JApplet class
import java.awt.Graphics; //import graphics class

public class FirstJApplet extends JApplet
{
	public void paint( Graphics g)
	{
		g.drawString("Prof. Mick welcomes you to our flavor of Java!",
					 25, 25);
	}
}
