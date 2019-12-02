import java.util.Scanner;

public class Q3Location {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int ro = input.nextInt();
		int co = input.nextInt();
		double[][] array = new double[ro][co];
		System.out.println("Enter the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
		}
		Location l = new Location();
		l.locateLargest(array);
		System.out.println("The location of the largest element " + l.getMaxValue(array) + " is at (" + l.row +"," + l.column + ")");
		input.close();
	}

}
