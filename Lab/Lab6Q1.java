import java.util.Scanner;

public class Lab6Q1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point with two coordinates:");
		double x = input.nextDouble();
		double y= input.nextDouble();
		if (Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5) <= 10)
			System.out.println("Point (" + x + "," + y + ") is in the circle.");
		else
			System.out.println("Point (" + x + "," + y + ") is not in the circle.");
		input.close();
	}

}
