
public class Location 
{
	public int row;
	public int column;
	private double maxValue;
	
	public double getMaxValue(double[][] a)
	{
	    maxValue = a[0][0];
	    for (int i = 0; i < a.length; i++) 
	    {
	    	for (int j = 0; j < a[i].length; j++) 
	    	{ 
	    		if (maxValue < a[i][j]) 
	    		{
	    			maxValue = a[i][j];
	            }
	        }
	    }
		return maxValue;
	}
	
	public Location locateLargest(double[][] a)
	{
	    double maxValue = a[0][0];
	    for (int i = 0; i < a.length; i++) 
	    {
	    	for (int j = 0; j < a[i].length; j++) 
	    	{ 
	    		if (maxValue < a[i][j]) 
	    		{
	    			maxValue = a[i][j];
	                row = i;
	                column = j;
	            }
	        }
	    }
	    return this;
	}
}
