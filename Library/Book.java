
public class Book extends Title 
{
	private String author;

	public Book(String author, int id, String title){
		// this.editor = editor; This doesnt work, super must be first
		super(id, title);
		this.author = author;

	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setEditor(String author)
	{
		this.author = author;
	}
	
	public String toString()
	{
		return super.toString() + "Author: " + author ;
	}
}
