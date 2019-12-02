import java.util.Scanner;

public class Lab15Q1 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		QuadraticEquation q = new QuadraticEquation(a,b,c);
		
		if (q.getDiscriminant()>0)
		System.out.println("The equation has two roots " + q.getRoot1() 
												+ " and "+ q.getRoot2());
		else if (q.getDiscriminant() == 0)
			System.out.println("The equation has one root " + q.getRoot1());
		else
			System.out.println("The equation has no real roots");
		input.close();
	}
}



