import java.util.Scanner;
public class Lab4Q1 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a, b, c:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = Math.pow((b*b)-(4*a*c), 0.5); //Discriminant
		double r1 = (-b + d)/(2*a); //Root 1
		double r2 = (-b - d)/(2*a); //Root 2
		input.close();
		
		if(d > 0)
			System.out.print("The equation has two roots" + r1 + " and " + r2);
		else if (d == 0)
			System.out.print("The equation has one root " + r1 );
		else 
			System.out.print("The equation has no real roots");
	}
}
