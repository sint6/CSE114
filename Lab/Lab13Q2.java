import java.util.Scanner;

public class Lab13Q2 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3x3 matrix row by row: ");
		double[][] array = new double[3][3];
		for (int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++) 
				array[i][j] = input.nextDouble();
		input.close();
		boolean isMarkov = isMarkovMatrix(array);
		if (isMarkov)
			System.out.println("It is a markov matrix");
		else
			System.out.println("It is not a markov matrix");

	}
	public static boolean isMarkovMatrix(double[][] m)
	{
		for (int j=0;j<2;j++)
		{
			double sum=0;
			for (int i=0;i<m.length;i++)
			{
				sum += m[i][j];
				if(m[i][j]<0)
					return false;
			}
			if (sum != 1)
				return false;
		}
		return true;
	}
}
