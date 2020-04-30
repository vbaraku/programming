
public class Title 
{
	private int id;
	private String title;
	
	public Title(int id, String title){
		this.id = id;
		this.title = title;
	}

	public int getId() 
	{
		return id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String toString()
	{
		return "Id: " + id + " Title: " + title;
	}
}
