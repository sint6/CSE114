import java.util.*;

public class ConnectFour
{
    public static void main(String[] args)
    {
        String[][] board = makeBoard();
        displayBoard(board);
        int t=0;
        while (checkWinner(board) == -1)
        {
            if (t==0)
            {
                dropRedPiece(board);
                displayBoard(board);
                t++;
            }
            else
            {
                dropYellowPiece(board);
                displayBoard(board);
                t--;
            }
        }
        if (checkWinner(board) == 0)
            System.out.println("This game is a tie!");
        else if (t==1)
            System.out.println("The red player won!");
        else
            System.out.println("The yellow player won!");
    }
    public static String[][] makeBoard()
    {
        String[][] b = new String[6][7];
        for (int row=0;row<b.length;row++)
        {
            for (int column=0;column<b[row].length;column++)
            {
                b[row][column] = " ";
            }
        }
        return b;
    }
    public static void displayBoard(String[][] b)
    {
        for (int row=0;row<b.length;row++)
        {
            for (int column=0;column<b[row].length;column++)
            {
                if (column==6)
                    System.out.print("|" + b[row][column] + "|");
                else   
                    System.out.print("|" + b[row][column]);
            }
            System.out.println();
        }
        System.out.println("...............");
    }
    public static void dropRedPiece(String[][] b)
    {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int column=0;
        do
        {
            try
            {
                System.out.print("Drop a red disk at column (0-6): ");
                column = input.nextInt();

                while (!b[0][column].equals(" "))
                {
                    System.out.print("This column is full! Choose another column for red disk: ");
                    column = input.nextInt();
                }
                loop = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.print("Invalid input. ");
                input.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException obe)
            {
                System.out.print("No such column! ");
                input.nextLine();
            }
        }
        while (loop);

        for (int row=5;row>=0;row--)
        {
            if (b[row][column].equals(" "))
            {
                b[row][column] = "R";
                break;
            }
        }
    }
    public static void dropYellowPiece(String[][] b)
    {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int column=0;
        do
        {
            try
            {
                System.out.print("Drop a yellow disk at column (0-6): ");
                column = input.nextInt();
        
                while (!b[0][column].equals(" "))
                {
                    System.out.print("This column is full! Choose another column for yellow disk: ");
                    column = input.nextInt();
                }
                loop = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.print("Invalid input. ");
                input.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException obe)
            {
                System.out.print("No such column! ");
                input.nextLine();
            }
        }
        while (loop);

        for (int row=5;row>=0;row--)
        {
            if (b[row][column].equals(" "))
            {
                b[row][column] = "Y";
                break;
            }
        }

    }

    public static int checkWinner(String[][] b)
    {
        if (checkHorizontal(b) || checkVertical(b) || checkDiagonalOne(b) || checkDiagonalTwo(b))
            return 1;
        else if (isDraw(b))
            return 0;
        else
            return -1;
    }

    public static boolean isDraw(String[][] b)
    {
        int count=0;
        for (int column=0;column<b[0].length;column++)
        {
            if (!b[0][column].equals(" "))
                count++;
            if (count == 7)
                return true;
        }
        return false;
    }
    public static boolean checkHorizontal(String[][] b)
    {
        for (int row=5;row>=0;row--)
        {
            for (int column=0;column<b[row].length-3;column++)
            {
                if (!b[row][column].equals(" "))
                    if (b[row][column].equals(b[row][column+1]))
                        if (b[row][column].equals(b[row][column+2]))
                            if (b[row][column].equals(b[row][column+3]))
                                return true;
            }
        }
        return false;
    }
    public static boolean checkVertical(String[][] b)
    {
        for (int column=0;column<7;column++)
        {
            for (int row=5;row>=3;row--)
            {
                if (!b[row][column].equals(" "))
                    if (b[row][column].equals(b[row-1][column]))
                        if (b[row][column].equals(b[row-2][column]))
                            if (b[row][column].equals(b[row-3][column]))
                                return true;
            }
        }
        return false;
    }
    
    public static boolean checkDiagonalOne(String[][] b)
    {
        for (int row=0;row<3;row++)
        {
            for (int column=3;column<b[row].length;column++)
            {
                if (!b[row][column].equals(" "))
                    if (b[row][column].equals(b[row+1][column-1]))
                        if (b[row][column].equals(b[row+2][column-2]))
                            if (b[row][column].equals(b[row+3][column-3]))
                                return true;
            }
        }
        return false;
    }
    public static boolean checkDiagonalTwo(String[][] b)
    {
        for (int row=0;row<3;row++)
        {
            for (int column=b[row].length-4;column>=0;column--)
            {
                if (!b[row][column].equals(" "))
                    if (b[row][column].equals(b[row+1][column+1]))
                        if (b[row][column].equals(b[row+2][column+2]))
                            if (b[row][column].equals(b[row+3][column+3]))
                                return true;
            }
        }
        return false;
    }
}