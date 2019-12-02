import java.util.Scanner;

public class Lab11Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10]; 
		System.out.print("Enter ten numbers: ");
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = input.nextInt();
		int[] distinctNumbers = eliminateDuplicates(numbers);
		System.out.print("The distinct numbers are: ");
		for (int e: distinctNumbers) {
			if (e > 0)
				System.out.print(" " + e);
		input.close();
		}
	}
	public static int[] eliminateDuplicates(int[] list) {
		int[] distinctList = new int[list.length];
		int i = 0;
		for (int e: list) {
			if (search(distinctList, e) == -1) {
				distinctList[i] = e;
				i++;
			}
		}
		return distinctList;
	}
	public static int search(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i])
				return i;
		}
		return -1;
	}
}