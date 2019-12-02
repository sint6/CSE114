import java.util.Scanner;

public class Lab15Q2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		
		double[][] array = new double[4][4];
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++) 
				array[i][j] = input.nextDouble();
		System.out.println("Sum of the elements in the major diagonal is " 
				+ sumMajorDiagonal(array));
		input.close();
	}
	public static double sumMajorDiagonal(double[][] m)
	{
		double sum = 0;
		for (int i=0;i<4;i++)
			sum += m[i][i];
		return sum;
	}
}
