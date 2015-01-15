/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		Lab05 - encrypt/decrypt
	Due:		Due: 11/09/14
	Instructor: Michael Mick
*/
public class Decoder
{
	public final static boolean ENCRYPT = true;
	public final static boolean DECRYPT = false;
	StringBuffer code =  new StringBuffer("fgwsaedrzxcvqtyuhjnbm kipol");
	StringBuffer alpha = new StringBuffer("abcdefghijklmnopqrstuvwxyz ");

	public String decode(String msg, boolean encryptMode)
	{
		StringBuffer msgBuffer = new StringBuffer(msg);
		StringBuffer Translation = new StringBuffer();
		String valueMsg, replaceLetter;
		int indexOfMsg;

		for(int ctr = 0; ctr < msg.length(); ctr++)
		{
			if(encryptMode)
			{
				valueMsg = String.valueOf(msgBuffer.charAt(ctr));
				indexOfMsg = alpha.indexOf(valueMsg);
				replaceLetter = String.valueOf(code.charAt(indexOfMsg));
				Translation.append(replaceLetter);
			}
			else
			{
				valueMsg = String.valueOf(msgBuffer.charAt(ctr));
				indexOfMsg = code.indexOf(valueMsg);
				replaceLetter = String.valueOf(alpha.charAt(indexOfMsg));
				Translation.append(replaceLetter);
			}
		}
	return Translation.toString();
	}
}