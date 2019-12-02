import java.util.Scanner;
public class HeadsAndTails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] arr = new char[3][3];
        System.out.print("Enter an integer representing the state of the coins:");
        int num = input.nextInt();
        String binary = Integer.toBinaryString(num);
        binary = String.format("%09d", Integer.parseInt(binary));
        int index = 0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                char a = binary.charAt(index);
                if (a == '0') 
                {
                    arr[i][j] = 'H';
                } 
                else if (a == '1')
                {
                    arr[i][j] = 'T';
                }
                index++;
            }
        }
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (j==2)
                    System.out.print(arr[i][j]);
                else
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}