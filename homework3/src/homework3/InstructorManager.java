package homework3;

public class InstructorManager extends UserManager {
	
	public void creaateLessons(Instructor instructor) {
		System.out.println(instructor.getCoursesName() + " " + "Ders oluşturuldu.");
		
	}
	
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getCoursesName() + " " + "dersin ödevi eklendi.");
	}

}
