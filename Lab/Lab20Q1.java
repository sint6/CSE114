public class Lab20Q1 {
    public static void main(String[] args) 
    {
		Course course1 = new Course("Data Structures");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course1.dropStudent("Kim Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < students.length; i++)
			System.out.print(students[i] + ", ");
		
	}
}
class Course{
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents;
	public Course(String courseName) {
		this.courseName = courseName;
	}
	public void addStudent(String student) {
        if (numberOfStudents>students.length) {
            String[] temp = students;
            String[] students = new String[numberOfStudents];
            for(int i = 0; i < students.length; i++)
			    students[i] = temp[i];
        }
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	public String[] getStudents() {
        String[] temp = students;
        String[] students = new String[numberOfStudents];
        for(int i = 0; i < students.length; i++)
			students[i] = temp[i];
		return students;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		for(int i = 0; i < students.length; i++) {
            if (student == students[i]) {
                for (int j = i; j < students.length; j++) {
                    students[j - 1] = students[j];
				}
				break;
            }
		}
		numberOfStudents--;
    }
    public void clear() {
        for(int i = 0; i < students.length; i++)
			students[i] = "";
    }
}