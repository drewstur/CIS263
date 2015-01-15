/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab09 - interfaces, abstracts, Oh my!
    Due:        Due: 11/06/2014
    Instructor: Michael Mick
*/
public class Fiction extends Book implements Recyclable
{
	public Fiction(String newTitle)
	{
		super(newTitle);
		setPrice(24.99F);
	}

	public void setPrice(float newPrice)
	{
		price = newPrice;
	}

	public void recycle()
	{
		System.out.print("Recycling this book...");
	}
}