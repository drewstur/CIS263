/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab05 - encrypt/decrypt
	Due:		Due: 11/09/14
	Instructor: Michael Mick
*/

import javax.swing.JOptionPane;

public class TestEncrypt
{
	public static void main(String[] args)
	{
		Decoder msg1 = new Decoder();
		String msg;

		do
		{
			msg = JOptionPane.showInputDialog(null,
												"Enter message to encrypt:",
												"CIS 263 Lab06 Drew Faber",
												JOptionPane.QUESTION_MESSAGE);

			msg = msg1.decode(msg, Decoder.ENCRYPT);


			JOptionPane.showMessageDialog(null,
											msg,
											"CIS263 Lab06 Drew Faber",
											JOptionPane.INFORMATION_MESSAGE);
		}while(msg != null);
	}
}