
public class InstructorManager {

	
	public void create(User user) {
		System.out.println("Ders oluşturuldu "+user.getName()+ user.getSurname());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Ders güncellendi "+instructor.getName() +instructor.getSurname());
	}
}
