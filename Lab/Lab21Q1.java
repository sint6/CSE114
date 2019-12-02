import java.util.ArrayList;
import java.util.Scanner;

public class Lab21Q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>();
        System.out.print("Enter five numbers: ");
        for (int i=0;i<5;i++)
            lst.add(input.nextInt());
        sort(lst);
        System.out.print("The sorted numbers are ");
        for (int i=0;i<lst.size();i++)
            System.out.print(lst.get(i)+ " ");
        input.close();
    }

    public static void sort(ArrayList<Integer> list)
    {
        int temp;
        for (int i=0;i<list.size();i++)
        {
            for(int j=0;j<list.size()-1;j++)
            {
                if (list.get(j)>list.get(j+1))
                {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}