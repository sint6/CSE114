import java.util.ArrayList;

public class Lab21Q2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numGrades = new ArrayList<>();
        numGrades.add(100);
        numGrades.add(99);
        numGrades.add(90);
        numGrades.add(89);
        numGrades.add(80);
        numGrades.add(79);
        numGrades.add(70);
        numGrades.add(69);
        numGrades.add(60);
        numGrades.add(59);
        numGrades.add(23);
        ArrayList<Character> letterGrades = convert(numGrades);
        for (int i=0;i<numGrades.size();i++)
            System.out.println(numGrades.get(i)+ "->" + letterGrades.get(i));
    }

    public static ArrayList<Character> convert(ArrayList<Integer> list)
    {
        ArrayList<Character> cha = new ArrayList<>();
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i)>=90)
                cha.add('A');
            else if (list.get(i)>=80 && list.get(i)<90)
                cha.add('B');
            else if (list.get(i)>=70 && list.get(i)<80)
                cha.add('C');
            else if (list.get(i)>=60 && list.get(i)<70)
                cha.add('D');
            else
                cha.add('F');
        }
        return cha;
    }
}