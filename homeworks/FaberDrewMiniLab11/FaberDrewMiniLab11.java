/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab11 - ActionListener
    Due:        Due: 11/20/2014
    Instructor: Michael Mick
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class FaberDrewMiniLab11 extends JFrame
{
	public FaberDrewMiniLab11()
	{
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2,5,5));
		JLabel jlblText = new JLabel("This is text in a Label",JLabel.CENTER);
		JButton jbtBold = new JButton("Bold");
   		JButton jbtItalics = new JButton("Italics");

		add(jlblText);
   		southPanel.add(jbtBold);
   		southPanel.add(jbtItalics);
   		add((southPanel), BorderLayout.SOUTH);

		jbtBold.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						   Font f = jlblText.getFont();

						   if(f.isBold())
							  jlblText.setFont(f.deriveFont(f.getStyle() - Font.BOLD));
						   else
							  jlblText.setFont(f.deriveFont(f.getStyle() + Font.BOLD));
						}
					}
				);

		jbtItalics.addActionListener(
					new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
						   Font f = jlblText.getFont();

						   if(f.isItalic())
							  jlblText.setFont(f.deriveFont(f.getStyle() - Font.ITALIC));
						   else
							  jlblText.setFont(f.deriveFont(f.getStyle() + Font.ITALIC));
						}
					}
				);
	}

	public static void main(String[] args)
  	{
		FaberDrewMiniLab11 frame = new FaberDrewMiniLab11();
		frame.setTitle("Drew Faber MiniLab11");
		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
  	}
}