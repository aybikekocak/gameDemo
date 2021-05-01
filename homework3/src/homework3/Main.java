package homework3;

public class Main {

	public static void main(String[] args) {
		
	
		User user = new User();
		user.setName("Aybike");
		user.setLastName("Koçak");
		user.setEmail("aa@hotmail.com");
		
		System.out.println(user.getId() + "  "+ user.getName() + " " + user.getLastName() + " " + user.getEmail());
		
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@hotmail.com");
		instructor.setCoursesName("Java");
		System.out.println( instructor.getId() + " " + instructor.getName() + " " + instructor.getLastName()  + " " + instructor.getEmail() + " " + instructor.getCoursesName() );
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.addHomework(instructor);
		studentManager.joinCourse();
		
	}

}
