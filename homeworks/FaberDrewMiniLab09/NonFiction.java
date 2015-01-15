/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab09 - interfaces, abstracts, Oh my!
    Due:        Due: 11/06/2014
    Instructor: Michael Mick
*/
public class NonFiction extends Book
{
	public NonFiction(String newTitle)
	{
		super(newTitle);
		setPrice(37.99F);
	}

	public void setPrice(float newPrice)
	{
		price = newPrice;
	}
}