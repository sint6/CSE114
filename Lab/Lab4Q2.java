import java.util.Scanner;
public class Lab4Q2
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the weight of the package (lbs):");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		input.close();
		
		if (weight > 20)
			System.out.print("This package cannot be shipped.");
		else if (weight <= 0)
			System.out.print("Invalid Input.");
		else
		{
			if (weight > 0 && weight <= 1)
				System.out.print("The package costs $3.5");
			else if (weight > 1 && weight <= 3)
				System.out.print("The package costs $5.5");
			else if (weight > 3 && weight <= 10)
				System.out.print("The package costs $8.5");
			else 
				System.out.print("The package costs $10.5");
		}
	}
}