//Sint Kaung
//112776130

import java.util.Scanner;
import java.util.Arrays;

public class H2Q2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter the second string: ");
		String s2 = input.nextLine();
		
		if (sort(s1).equals(sort(s2)))
			System.out.println(s1 + " and " + s2 + " are anagrams");
		else
			System.out.println(s1 + " and " + s2 + " are NOT anagrams");
		input.close();	

	}
	public static String sort(String s)
	{
		s = s.toLowerCase();
		s = s.replaceAll("\\s","");
		char temp[] = s.toCharArray();
		Arrays.sort(temp);
		return new String(temp);
	}
}
