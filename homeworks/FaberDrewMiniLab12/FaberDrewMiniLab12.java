/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab12 - GUI Application
    Due:        Due: 12/4/2014
    Instructor: Michael Mick
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class FaberDrewMiniLab12 extends JFrame
{
	JLabel jlblName = new JLabel("Name: ",JLabel.CENTER);
	JLabel jlblDesc = new JLabel("Student:");
	JTextField jftName = new JTextField(10);

	String[] traits= {"has shown improvement.", "relates well to others.",
					  "is a pleasure to have as a student!","works independently.",
					  "shows leadership.", "completes work on time.",
					  "has good organizational skills.", "does outstanding work!"};

	JComboBox<String> jcboTraits = new JComboBox<String>(traits);
	JButton jbtGo = new JButton("GO!");
	JRadioButton jrbMale = new JRadioButton();
	JRadioButton jrbFemale = new JRadioButton();

	public static void main (String[] args)
	{
		FaberDrewMiniLab12 frame = new FaberDrewMiniLab12();
		frame.setTitle("Drew Faber MiniLab12");
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public FaberDrewMiniLab12()
	{
		//create panel for rbuttons
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setLayout(new GridLayout(1,2));

		//add labels to buttons
		jrbMale.setText("Male");
		jrbFemale.setText("Female");

		//add buttons to panel
		jpRadioButtons.add(jrbMale);
		jpRadioButtons.add(jrbFemale);

		// set default and set border
		jrbMale.setSelected(true);
		jpRadioButtons.setBorder(BorderFactory.createLineBorder(Color.black));

		//add buttons to group
		ButtonGroup group = new ButtonGroup();
		group.add(jrbMale);
		group.add(jrbFemale);


		JPanel  jpTop = new JPanel();
		jpTop.setLayout(new FlowLayout());
		jpTop.add(jlblName);
		jpTop.add(jftName);
   		add((jpTop), BorderLayout.NORTH);

		JPanel  jpCenter = new JPanel(new FlowLayout());
		jpCenter.add(jpRadioButtons);
		jpCenter.add(jcboTraits);
		jpCenter.add(jbtGo);
   		add((jpCenter), BorderLayout.CENTER);

   		add((jlblDesc), BorderLayout.SOUTH);
		jbtGo.setToolTipText("Click to create Label");

        jbtGo.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
 					jlblDesc.setText("Student: "+jftName.getText()+". "+
 										(jrbMale.isSelected() ? "He " : "She ")+
 									    	jcboTraits.getSelectedItem());
                }
			}
		);
	}
}

