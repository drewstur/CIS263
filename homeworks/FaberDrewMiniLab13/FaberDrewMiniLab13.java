/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab13 - Applet/App blue song clip
    Due:        Due: 12/11/2014
    Instructor: Michael Mick
*/
import javax.swing.*;
import java.net.URL;
import java.applet.*;

public class FaberDrewMiniLab13 extends JApplet
{
	private AudioClip blueClip;

	public FaberDrewMiniLab13()
	{
		URL blueUrl = getClass().getResource("blues.wav");
		blueClip = Applet.newAudioClip(blueUrl);
		blueClip.loop();
	}

	public void start()
	{
		if(blueClip !=  null)
			blueClip.loop();
	}
	public void stop()
	{
		if(blueClip !=  null)
			blueClip.stop();
	}

	public static void main(String[] args)
	{
		// Create a frame
		JFrame frame = new JFrame("Drew Faber Minilab13");

		// Create an instance of the applet
		FaberDrewMiniLab13 applet = new FaberDrewMiniLab13();
		applet.init();


		// Add the applet instance to the frame
		frame.add(applet);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Display the frame
		frame.setSize(400, 320);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
	}
}
