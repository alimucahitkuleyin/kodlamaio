
public class InstructorManager {

	
	public void create(User user) {
		System.out.println("Ders olu�turuldu "+user.getName()+ user.getSurname());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Ders g�ncellendi "+instructor.getName() +instructor.getSurname());
	}
}
