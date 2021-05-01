package homework3;

public class StudentManager extends UserManager{

	public void joinCourse() {
		System.out.println("Ders Eklendi.");
	}
	public void addHomework(Instructor instructor) {
		System.out.println( "öğrenci"+ " " + instructor.getCoursesName() + " " + "dersin ödevini ekledi.");
	}
}
