import java.util.Scanner;
import java.util.Arrays;

public class Lab12Q1 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter list1 size and contents:");
		
		int size = input.nextInt();
		int list1[] = new int[size];
		
		for (int i=0;i<list1.length;i++)
			list1[i] = input.nextInt();
		System.out.print("Enter list2 size and contents:");
		
		int size2 = input.nextInt();
		int list2[] = new int[size2];
		for (int i=0;i<list2.length;i++)
			list2[i] = input.nextInt();
		
		Arrays.sort(list1);
		Arrays.sort(list2);
		System.out.print("List1 is ");
		for (int i=0;i<list1.length;i++)
			System.out.print(list1[i] + " ");
		System.out.print("\nList2 is ");
		for (int i=0;i<list2.length;i++)
			System.out.print(list2[i] + " ");
		
		System.out.print("\nThe merged list is ");
		for (int i=0;i<merge(list1,list2).length;i++)
			System.out.print(merge(list1,list2)[i] + " ");
		
		input.close();
		
	}
	
	public static int[] merge(int[] list1,int[] list2)
	{
		int mergedList[] = new int[list1.length+list2.length];
		for (int i=0;i<list1.length;i++)
			mergedList[i] = list1[i];
		for (int i=list1.length;i<((list1.length)+(list2.length));i++)
			mergedList[i] = list2[i-list1.length];
		Arrays.sort(mergedList);
		return mergedList;
	}
}
