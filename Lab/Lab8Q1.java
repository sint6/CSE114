
public class Lab8Q1 
{
	public static void main(String[] args)
	{
	int sum = 0;
	double average = 0;
	for (int i = 0 ; i <10 ; i++)
		{
		sum += (int)(Math.random()*100);
		average = (double)sum/10;
		}
	System.out.println("The average of 10 random integers is " + average);
	}
}
