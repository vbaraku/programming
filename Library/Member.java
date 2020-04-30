
public class Member 
{
	private int id;
	private String name;
	//private int nowOnLoan; IT APPEARS ON THE DIAGRAM BUT WE WILL NOT NEED IT
	public static final int MAX_ON_LOAN = 6;
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Id: " + id + " Name: " + name;
	}
}
