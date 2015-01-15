/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab10 - GUI
    Due:        Due: 11/13/2014
    Instructor: Michael Mick
*/
import javax.swing.*;
import java.awt.*;

public class FaberDrewMiniLab10 extends JFrame
{
	public FaberDrewMiniLab10()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(5, 5));
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,2,5,5));

		JButton red = new JButton("Red");
		red.setForeground(Color.RED);
		southPanel.add(red);

		JButton blue = new JButton("Blue");
		blue.setForeground(Color.BLUE);
		southPanel.add(blue);
		southPanel.setBorder(BorderFactory.createTitledBorder("Buttons"));
		add((southPanel), BorderLayout.SOUTH);

		JLabel northLabel = new JLabel("This is text in a Label");
		northLabel.setOpaque(true);
		northLabel.setBackground(Color.BLACK);
		northLabel.setForeground(Color.WHITE);
		add((northLabel), BorderLayout.NORTH);

		JTextField westText = new JTextField("This is the West area");
		westText.setFont(new Font("Verdana",Font.ITALIC,12));
		JTextField eastText = new JTextField("This is the East area");
		eastText.setFont(new Font("Verdana",Font.ITALIC+Font.BOLD,12));
		JButton centerButton = new JButton("This is the Center");
		 centerButton.setForeground(Color.RED);

		add((westText) , BorderLayout.WEST);
		add((eastText) , BorderLayout.EAST);
		add((centerButton), BorderLayout.CENTER);
  	}
	public static void main(String[] args)
  	{
		FaberDrewMiniLab10 frame = new FaberDrewMiniLab10();
		frame.setTitle("Drew Faber MiniLab10");
		frame.setSize(450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
  	}
}
