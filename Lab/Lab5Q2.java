import java.util.Scanner;

public class Lab5Q2 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int num = input.nextInt();

		System.out.println("Is 10 divisible by 5 and 6? " + ((num % 5 == 0) && (num % 6 == 0)));
		System.out.println("Is 10 divisible by 5 or 6? " + ((num % 5 == 0) || (num % 6 == 0)));
		System.out.println("Is 10 divisible by 5 of 6, but not both? " + ((num % 5 == 0) ^ (num % 6 == 0)));
		
		input.close();
	}
}