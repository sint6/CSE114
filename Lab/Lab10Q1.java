import java.util.Scanner;

public class Lab10Q1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s1 = input.nextLine();
		System.out.print("Enter a character: ");
		String s2 = input.next();
		char c = s2.charAt(0);
		System.out.println("The number of occurrence(s ) of '" + s2 + "' in " + s1 + " is " + count(s1, c));
		input.close();
	}
	public static int count(String str, char a)
	{
		int numOfOccurrence = 0;
		for (int i = 0;i<str.length();i++)
		{
			if (str.charAt(i)==a)
				numOfOccurrence++;
		}
		return numOfOccurrence;
	}
}
