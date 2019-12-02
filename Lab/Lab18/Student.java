package Lab18;

public class Student extends Person 
{
    private String status;
    private final static String freshmen = "freshman";
    private final static String sophomore = "sophomore";
    private final static String junior = "junior";
    private final static String senior = "senior";

    public Student(String nam, String add, String num, String em, String stat) 
    {
		super(nam, add, num, em);
		status = stat;
	}

    public void setStatus(String stat) 
    {
		status = stat; 
	}

    public String getStatus() 
    {
        if (status == freshmen)
         return "freshman"; 
        if (status == sophomore)
            return "sophomore"; 
        if (status == junior)
            return "junior"; 
        if (status == senior)
            return "senior";
        else
            return "unknown"; 
    }
    
	public String toString() {
        return super.toString() + 
                "\nStatus: " + getStatus();
	}
}