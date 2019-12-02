import java.util.Scanner;

public class Lab8Q2 {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();	
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		String mid;
		
		if ((city2.compareToIgnoreCase(city1) < 0) && (city2.compareToIgnoreCase(city3) < 0))
		{
			mid = city1;
			city1 = city2;
			city2 = mid;
		}
		else if ((city3.compareToIgnoreCase(city1) < 0) && (city3.compareToIgnoreCase(city2) < 0))
		{
			mid = city1;
			city1 = city3;
			city3 = mid;
		}
		if (city3.compareToIgnoreCase(city2) < 0)
		{
			mid = city2;
			city2 = city3;
			city3 = mid;
		}
		System.out.println("The three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		input.close();
	}
}