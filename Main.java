
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		user.setName("Mühendislikte");
		user.setSurname("İnovasyon");
		
		UserManager userManager = new UserManager();
	    userManager.add(user);
	    userManager.delete(user);
		
		Student student = new Student();
		student.setName("Mücahit");
		student.setSurname("Kuleyin");
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student);
		studentManager.register(student);
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin");
		instructor.setSurname("Demiroğ");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.create(instructor);
		instructorManager.update(instructor);
	}
	    
	    
	    

}
