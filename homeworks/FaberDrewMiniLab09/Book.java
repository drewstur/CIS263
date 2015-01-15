/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab09 - interfaces, abstracts, Oh my!
    Due:        Due: 11/06/2014
    Instructor: Michael Mick
*/
public abstract class Book
{
	private String title;
	public float price;

	public Book(String title)
	{
		setTitle(title);
	}

	private void setTitle(String newTitle)
	{
		title = newTitle;
	}

	public String getTitle()
	{
		return title;
	}

	abstract void setPrice(float price);

	public float getPrice()
	{
		return price;
	}

}