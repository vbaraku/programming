import java.util.Scanner;

public class CalculateUserAge{
	
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		String name;
		int yearOfBirth;
		int now = 2019;
		int age;

		System.out.println("What is your name?");
		name = scan.nextLine();
		System.out.println("Hello, " + name);
		System.out.println("What is your year of birth " + name + "?");
		yearOfBirth = scan.nextInt();
		age = now - yearOfBirth;
		System.out.println("Your age is: " + age);



	}	




}