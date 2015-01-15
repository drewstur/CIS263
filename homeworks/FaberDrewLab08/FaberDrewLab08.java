/*
 Name:       Drew Faber
 Course:     CIS 263-01
 Desc:       MiniLab12 - Event handling with images
 Due:        Due: 12/07/2014
 Instructor: Michael Mick
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class FaberDrewLab08 extends JFrame
{
	private JButton lastButtonPressed;

	public FaberDrewLab08()
	{
		JPanel imgPanel = new JPanel();
		imgPanel.setLayout(new BorderLayout());
		JLabel imgLabel = new JLabel(new ImageIcon("lucyIn.jpg"));
		JLabel jlblDesc = new JLabel("The Doctor is in.");
		add(imgLabel, BorderLayout.NORTH);
		add(jlblDesc, BorderLayout.SOUTH);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2,5,5));
		JButton jbtIn = new JButton("Click for In");
		JButton jbtOut = new JButton("Click for Out");

		southPanel.add(jbtIn);
		southPanel.add(jbtOut);
		add((southPanel), BorderLayout.CENTER);

		jbtIn.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JButton buttonIn = (JButton) e.getSource();
							imgLabel.setIcon(new ImageIcon("lucyIn.jpg"));

							if(lastButtonPressed == buttonIn)
							{
								jlblDesc.setText("The Docter IS IN, already!");
							}
							else
							{
								jlblDesc.setText("The Docter is in.");
							}
							lastButtonPressed = buttonIn;
						}
					}
				);

		jbtOut.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JButton buttonOut = (JButton) e.getSource();
							imgLabel.setIcon(new ImageIcon("lucyOut.jpg"));

							if(lastButtonPressed == e.getSource())
							{
								jlblDesc.setText("The Docter IS OUT, already!");
							}
							else
							{
								jlblDesc.setText("The Docter is out.");
							}
							lastButtonPressed = buttonOut;
						}
					}
				);
	}

	public static void main(String[] args)
  	{
		FaberDrewLab08 frame = new FaberDrewLab08();
		frame.setTitle("CIS 263 Drew Faber");
		frame.setSize(400, 350);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
  	}
}