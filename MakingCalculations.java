import java.util.Scanner;

public class MakingCalculations{
	
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		double a = 5.2;
		int b;
		

		System.out.println("Please enter an integer number");
		b = scan.nextInt();
		double addition = a + b;
		double subtraction = a - b;
		double multiplication = a * b;
		double division = a / b;
		System.out.println("a + b is " + addition + ". a - b is " + subtraction + ". a * b is " + multiplication + ". a / b is " + division + ".");
	


	}	




}