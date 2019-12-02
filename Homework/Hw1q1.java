//Sint Kaung
// 112776130

import java.util.Scanner;

public class Hw1q1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the three edges of the triangle: ");
		//Sides of the triangle
		double x = input.nextDouble(); 
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		if (x+y>z && x+z >y && z+y>x)
			System.out.println("The perimeter is " + (x + y + z));
		else
			System.out.print("The input is invalid");
		
		input.close();
	}
	
}
