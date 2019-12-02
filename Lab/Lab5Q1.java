import java.util.Scanner;

public class Lab5Q1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a three-digit number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int n1 = num/100;
		int n3 = num%100%10;
		if (n1==n3)
			System.out.println(num + " is a palindrome.");
		else
			System.out.println(num + " is not a palindrome.");
		input.close();
	}
}