
public class StudentManager {

	
	public void login(User user) {
		System.out.println("Giri� ba�ar�l� "+ user.getName() + user.getSurname());
	}
	
	public void register(Student student) {
		System.out.println("Kay�t ba�ar�l� "+student.getName() + student.getSurname());
	}
}
