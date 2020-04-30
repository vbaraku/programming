
public class Creature
{
	private int health;
	private int strength;
	
	public int getHealth() 
	{
		return health;
	}
	
	public int getStrength() 
	{
		return strength;
	}
	public void setHealth(int health) 
	{
		this.health = health;
	}
	
	public void setStrength(int strength) 
	{
		this.strength = strength;
	}


	
	public String toString()
	{
		return "Health: " + health + "Strenght: " + strength ;
	}
}
