//Sint Kaung
//112776130

import java.util.Scanner;

public class Hw1q3 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = input.nextLine();
		int vowel = 0, consonant = 0;
		for (int i = 0; i < s.length(); i++)
		{
			char letter = Character.toUpperCase(s.charAt(i));
			if (Character.isLetter(letter))
			{
				if (letter == 'A' ||
					letter == 'E' ||
					letter == 'I' ||
					letter == 'O' ||
					letter == 'U')
				vowel++;
				else
				consonant++;
			}
			
		}
		System.out.println("The number vowels is " + vowel);
		System.out.println("The number consonants is " + consonant);
		input.close();
	}

}