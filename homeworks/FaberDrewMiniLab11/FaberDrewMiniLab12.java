- Create a GUI application which
   - imports the following:
         import java.awt.*;
         import java.awt.event.*;
         import javax.swing.*;
         import javax.swing.border.*;
   - has a JLabel, jlblName, containing the text, "Name: " (everything within the quotes, but not the quotes themselves)
   - has a JTextField, jtfName, of size 10 in which the user can type a name    
   - has two JRadioButton variables, jrbMale and jrbFemale
   - has an array of String, traits, using the following values as initializers:
         "has shown improvement.", "relates well to others.", "is a pleasure to have as a student!", 
         "works independently.", "shows leadership.", "completes work on time.", 
         "has good organizational skills.", "does outstanding work!"
   - has a drop-down list (JComboBox), jcboTraits, containing all of the trait values available. To avoid a warning
      from using an older format, use :    JComboxBox<String> jcboTraits = new JComboBox<String>(traits);
   - has a JButton,jbtGo, containined text of "GO!"
   - has a JLabel, jlblDesc, to hold the description after the GO! button is clicked. Initialize with "Student:"

- In the only (default) constructor, 
   - create a JPanel, jpRadioButtons, to hold the radio buttons; use a GridLayout of 1 row and 2 columns
   - create a new JRadioButton object, assigned to jrbMale, with a label of "Male" and add it to the panel
   - create a new JRadioButton object, assigned to jrbFemale, with a label of "Female" and add it to the panel
   - set the jrbMale as selected
   - set a new LineBorder of color BLACK to the panel, jpRadioButtons

   - create a ButtonGroup, group. Add each of the two RadioButton objects to this group so selection is exclusive.

   - create a JPanel, jpTop, using FlowLayout; add the label, jlblName, and the text field, jtfName, to the panel;
     Add the panel, jpTop, to the NORTH area of the window

   - create a JPanel, jpCenter, using FlowLayout. To this panel, add the panel, jpRadioButtons; add the ComboBox, 
     jcboTraits; and add the JButton, jbtGo, in this order.
     Add this panel, jpCenter, to the CENTER area of the window

   - Add the JLabel, jlblDesc, to the SOUTH area of the window

   - Set a tool tip text on the jbtGo button which will display "Click to create label"

   - Add to the JButton, jbtGo, an anonymous ActionListener so that when the button is clicked, 
     you will set the text of the JLabel, jlblDesc, to "Student: " plus the text you can get from the text field,
     jtfName, plus (if the jrbMale is selected, then the text "He ", otherwise the text, "She "), plus the
     selected item from the JComboBox, jcboTraits. (see sample output)

- In your main() method,
   create a new window and set the title to Your name and "MiniLab12", as in "Ima Skolar MiniLab12"
   set the size of the window to 400 wide and 200 high
   set the location of the window relative to null so that it centers on screen
   set it to exit when the window is closed, then display the window

   Output shown below displays functionality. Yours should match.