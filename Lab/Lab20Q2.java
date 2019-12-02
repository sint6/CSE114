import java.util.ArrayList;

public class Lab20Q2 {
	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");
		course1.addStudent("Peter Jones");
		course1.addStudent("Kim Smith");
		course1.addStudent("Anne Kennedy");
		course2.addStudent("Peter Jones");
		course2.addStudent("Steve Smith");
		System.out.println("Number of students in course1: " +
		course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		System.out.println();
		System.out.println("Number of students in course2: " +
				course2.getNumberOfStudents());
				students = course2.getStudents();
				for(int i = 0; i < course2.getNumberOfStudents(); i++)
					System.out.print(students[i] + ", ");
	}
}

class Course {
	private String courseName;
	private ArrayList<String> students;

	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<String>();
	}
	public void addStudent(String student) {
		students.add(student);
	}
	public String[] getStudents() {
		String[] a = new String[students.size()];
		return students.toArray(a);
	}
	public int getNumberOfStudents() {
		return students.size();
	}
	public String getCourseName() {
		return courseName;
	}
	public void dropStudent(String student) {
		students.remove(student);
	}
}