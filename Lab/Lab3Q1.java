import java.util.Scanner;
public class Lab3Q1
{
	public static void main(String[] args)
	{
		System.out.print("Enter a degree in Celsius:");
		Scanner input = new Scanner(System.in);
		double c = input.nextDouble();
		double f = ((9.0/5)*c)+32;
		System.out.println(c + " Celsius is " + f + " Fahrenheit");
		input.close();
	}
}