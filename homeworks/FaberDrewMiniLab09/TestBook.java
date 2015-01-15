/*
    Name:       Drew Faber
    Course:     CIS 263-01
    Desc:       MiniLab09 - interfaces, abstracts, Oh my!
    Due:        Due: 11/06/2014
    Instructor: Michael Mick
*/
public class TestBook
{
	public static void main(String[] args)
	{
		Fiction book1 = new Fiction("The Compatible Congress");					 // a new Fiction book
		Fiction book2 = new Fiction("Getting Congressional Approval Above 90%"); // a new Fiction book
		Fiction book3 = new Fiction("Super Senator - An Honest Abe");			 // a new Fiction book

		NonFiction book4 = new NonFiction("Balance of Powers");			// a new NonFiction book
		NonFiction book5 = new NonFiction("Winning Elections for $$");	// a new NonFiction book
		NonFiction book6 = new NonFiction("Jackpot! The New Senator");	// a new NonFiction book

		System.out.println("The 1st book, "+book1.getTitle()+
						   ", is fiction with a price of $"+book1.getPrice());

		System.out.println("Trying to recycle the 1st book, ");
		book1.recycle();
		System.out.println();

		Book[] array = new Book[6];
		array[0] = book1;
		array[1] = book2;
		array[2] = book3;
		array[3] = book4;
		array[4] = book5;
		array[5] = book6;

		for(Book book: array)
		{
		   if(book instanceof Recyclable)
		   {
		      ((Fiction)book).recycle();
		      System.out.println(book.getTitle()+" price="+book.getPrice());
		   }
		   else
		   {
		      System.out.println(book.getTitle()+" price="+book.getPrice()+" is not recyclable.");
		   }
		}
	}
}