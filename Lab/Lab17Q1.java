public class Lab17Q1
{
    public static void main(String[] args)
    {
        int[][] m = new int[4][4];

        for (int i=0;i<m.length;i++)
            for (int j=0;j<m[i].length;j++)
                m[i][j] = (int)(Math.random()*2);

        for (int i=0;i<m.length;i++)
        {
            for (int j=0;j<m[i].length;j++)
            {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + findBigRow(m));
        System.out.println("The largest column index: " + findBigColumn(m));
    
    }
    public static int findBigRow(int[][] a)
    {
        int rowIndex = 0;
        int max = 0;
        for (int row = 0; row < a.length; row++) 
        {
			int sum = 0;
            for (int column = 0; column < a[row].length; column++) 
            {
                if (a[row][column] == 1)
                    sum++;
			}
            if (sum > max) 
            {
				max = sum;
				rowIndex = row;
			}
		}
		return rowIndex;
    }
    public static int findBigColumn(int[][] a)
    {
        int columnIndex = 0;
        int max = 0;
        for (int column = 0; column < a[0].length; column++) 
        {
			int sum = 0;
            for (int row = 0; row < a.length; row++) 
            {
                if (a[row][column] == 1)
                    sum++;
			}
            if (sum > max) 
            {
				max = sum;
				columnIndex = column;
			}
		}
		return columnIndex;
    }
}