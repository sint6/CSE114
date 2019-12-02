import java.util.Scanner;
public class Lab3Q2
{
	public static void main(String[] args)
	{
		double J; // Energy in Joules
		double W; // Amount of Water in Kilograms
		double fTemp; // Final Temperature
		double iTemp; // Initial Temperature
		System.out.print("Enter the amount of water in kilograms:");
		Scanner input = new Scanner(System.in);
		W = input.nextDouble();
		System.out.print("Enter the initial temperature:");
		Scanner input2 = new Scanner(System.in);
		iTemp = input2.nextDouble();
		System.out.print("Enter the final temperature:");
		Scanner input3 = new Scanner(System.in);
		fTemp = input3.nextDouble();
		J = W*(fTemp - iTemp)*4184;
		System.out.print("The energy needed is " + J);
		input.close();
		input2.close();
		input3.close();
	}

}
