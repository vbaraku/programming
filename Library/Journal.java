
public class Journal extends Title 
{
	private String editor;
	
	public Journal(String editor, int id, String title){
		// this.editor = editor; This doesnt work, super must be first
		super(id, title);
		this.editor = editor;

	}

	public String getEditor() 
	{
		return editor;
	}
	
	public void setEditor(String editor)
	{
		this.editor = editor;
	}
	
	public String toString()
	{
		return super.toString() + "Editor: " + editor ;
	}
}
