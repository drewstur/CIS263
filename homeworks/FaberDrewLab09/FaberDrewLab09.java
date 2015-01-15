/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab13 - Applet/App Purdue Songs
    Due:        Due: 12/11/2014
    Instructor: Michael Mick
*/
import javax.swing.*;
import java.net.URL;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class FaberDrewLab09 extends JApplet implements ActionListener
{
	private String song;
	private AudioClip hymnClip, hailClip;
	private JButton jbtPlay = new JButton("Play");
	private JButton jbtStop = new JButton("Stop");
	private String [] purdueSongs = new String [] {"Hymn Song", "Hail Clip"};
	private JComboBox comboBox = new JComboBox(purdueSongs);

	public FaberDrewLab09()
	{
	}

	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == jbtPlay)
	    	if((String)comboBox.getSelectedItem() == "Hymn Song")
				hymnClip.play();

		if (e.getSource() == jbtStop)
			if((String)comboBox.getSelectedItem() == "Hymn Song")
				stop();
	} // actionPerformed

	public void start()
	{
		//if(comboBox.getSelectedIndex() !=  null)
			//comboBox.getSelectedIndex().loop();
	}
	public void stop()
	{
		//if(blueClip !=  null)
		//	blueClip.stop();
	}

	public void init()
	{
		URL hymnUrl = getClass().getResource("hymn.wav");
		hymnClip = Applet.newAudioClip(hymnUrl);
		URL hailUrl = getClass().getResource("hail.wav");
		hailClip = Applet.newAudioClip(hailUrl);
       	add(comboBox, BorderLayout.NORTH);
       	JPanel jbtPanel = new JPanel();
       	jbtPlay.addActionListener(this);
       	jbtStop.addActionListener(this);
       	jbtPanel.add(jbtPlay, BorderLayout.SOUTH);
       	jbtPanel.add(jbtStop, BorderLayout.SOUTH);
       	add(jbtPanel, BorderLayout.CENTER);
	}

	public static void main(String[] args)
	{
		// Create a frame
		JFrame frame = new JFrame("Drew Faber Lab09 - Song Player");

		// Create an instance of the applet
		FaberDrewLab09 applet = new FaberDrewLab09();
		applet.init();

		// Add the applet instance to the frame
		frame.add(applet, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Display the frame
		frame.setSize(400, 320);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true);
	}
}
