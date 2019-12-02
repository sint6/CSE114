import java.util.Scanner;

public class Lab12Q2 {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int list[] = new int[10];
		System.out.print("Enter 10 numbers:");
		for (int i=0;i<list.length;i++)
			list[i] = input.nextInt();
		reverse(list);
		for (int i=0;i<list.length;i++)
			System.out.print(list[i] + " ");
		input.close();
	}
	public static void reverse(int[] a)
	{
		int temp;
		for (int i=0,k=a.length-1;i<a.length/2;i++,k--)
		{
			temp = a[i];
			a[i] = a[k];
			a[k] = temp;
		}
	}
}
