import java.util.Scanner;

public class RandomSquare{
	
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		
		int a = (int)(Math.random()*100);

		System.out.println("The square root of " + a  + " is: ");

		double b = Math.sqrt(a);

		System.out.println(b);
		
		
		


	}	




}