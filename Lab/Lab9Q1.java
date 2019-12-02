import java.util.Scanner;

public class Lab9Q1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the phone number: ");
		String phoneNum = input.nextLine().replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
		System.out.println(phoneNum);
		input.close();
	}

}
