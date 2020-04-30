
public class Student {
	private String regNumber;
	private String name;
	private int credits;
	private byte levelOfStudies;

	public Student(String regNumber, String name){
		this.regNumber = regNumber;
		this.name = name;
		credits = 0;
		levelOfStudies = 1;

	}

	public Student(){
		regNumber = null;
		name = null;
		credits = 0;
		levelOfStudies = 1;
	}
	
	
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public byte getLevelOfStudies() {
		return levelOfStudies;
	}
	
	public void passUnit() {
		credits += 10;
	}
	
	public void proceedToNextLevel() {
		if(credits >= 100) {
			levelOfStudies++;
			credits = 0;
		}
	}
	@Override
	public String toString() {
		return "Student [regNumber=" + regNumber + ", name=" + name + ", credits=" + credits + ", levelOfStudies="
				+ levelOfStudies + "]";
	}
	
	
	
	

}
