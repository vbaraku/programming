
public class BookCopy implements Borrowable
{
	private int id;
	private boolean available;
	
	public void isBeingBorrowed(){

		if(available){
			available = false;
		}
	
	}

	public void isBeingReturned(){
		if(!available){
			available = true;
		}
	}

	public int getId()
	{
		return id;
	}
	
	public boolean isAvailable()
	{
		return available;
	}
	
	public String toString() {
		return "BookcCopy [id=" + id + ", available=" + available + "]";
	}
}
