/*
	Name:		Drew Faber
	Course:		CIS 263-01
	Desc:		MiniLab05 - Pilot using objects/getters/setters
	Due:		Due: 09/25/14
	Instructor: Michael Mick
*/
public class Pilot
{
 	private int id = 1;
	private int age = 45;
	private boolean commExp = true;
	private boolean milExp = true;

    public Pilot()
    {
    }

    public Pilot(int idIntiate)
    {
	    id = idIntiate;
    }

    public Pilot(int idIntiate, int ageIntiate)
    {
	    id = idIntiate;
	    age = ageIntiate;
    }

    public Pilot(int idIntiate, int ageIntiate, boolean commExpIntiate, boolean milExpIntiate)
    {
	    id = idIntiate;
		age = ageIntiate;
		commExp = commExpIntiate;
		milExp = milExpIntiate;
	}

	public int getId()
	{
		return id;
	}

	public int getAge()
	{
		return age;
	}

	public boolean getcommExp()
	{
		return commExp;
	}

	public boolean getmilExp()
	{
		return milExp;
	}

	public void setAge(int age)
	{
		age = age;
    }

	public void setcommExp(boolean commExp)
	{
		commExp = commExp;
	}

	public void setmilExp(boolean milExp)
	{
		milExp = milExp;
	}

	public void display()
	{
	    System.out.println("Pilot ID:\t"+getId());
	    System.out.println("     Age:\t"+getAge());
	    System.out.println("Comm Exp:\t"+getcommExp());
	    System.out.println(" Mil Exp:\t"+getmilExp());
	    System.out.print("\n");
	}
}
