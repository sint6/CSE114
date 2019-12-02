import java.util.Scanner;
import java.util.ArrayList;

public class Lab19Q1
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String s1 = input.nextLine();
        ArrayList<Character> lst = toCharacterArray(s1);
        for (int i=0;i<lst.size();i++)
            System.out.print(lst.get(i) + " ");
        input.close();

    }
    public static ArrayList<Character> toCharacterArray(String s)
    {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i=0;i<s.length();i++)
            {
                list.add(s.charAt(i));
            }
        return list;
    }
}