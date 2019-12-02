
public class Lab14Q2 
{
	public static void main(String[] args)
	{
		int[] count = new int[10];
		
		for (int i = 0; i < 100; i++) 
			count[(int)(Math.random() * 10)]++;
		
		System.out.println("Count of each number 0 to 9: ");
		for (int i = 0; i < count.length; i++) 
			System.out.println(i + ": " + count[i]);
	}
}
