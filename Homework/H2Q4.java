//Sint Kaung
//112776130

import java.util.Scanner;

public class H2Q4
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double[][] m1 = new double[3][3];
		double[][] m2 = new double[3][3];
		
		System.out.print("Enter matrix1: ");
		for (int i=0;i<m1.length;i++)
			for (int j=0;j<m1[i].length;j++)
				m1[i][j] = input.nextDouble();
		
		System.out.print("Enter matrix2: ");
		for (int i=0;i<m2.length;i++)
			for (int j=0;j<m2[i].length;j++)
				m2[i][j] = input.nextDouble();
		
		double[][] sum = multiply(m1, m2);
		
		System.out.println("Multiplication of matrices is: ");
		for (int i=0;i<m1.length;i++)
		{
			System.out.printf("%.1f\t %.1f\t %.1f\t \n", sum[i][0], sum[i][1], sum[i][2]);
		}
		
		input.close();
	}
	public static double[][] multiply(double[][] a, double[][] b) 
	{
        double[][] c = new double[a.length][a.length];
        
        for (int i = 0; i < a.length; i++) 
            for (int j = 0; j < a.length; j++) 
                for (int k = 0; k < a[i].length; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c; 
	}
}	
