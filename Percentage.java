import java.util.Scanner;

public class Percentage{
	
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		double a;
		double b;
		double percentage;

		System.out.println("Please enter the first integer number");
		a = scan.nextDouble();
		System.out.println("Please enter the second integer number");
		b = scan.nextDouble();


		percentage = b * 100 / a;
		System.out.println(b + " is " + percentage + "% " + "of " + a);



	}	




}