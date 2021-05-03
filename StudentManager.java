
public class StudentManager {

	
	public void login(User user) {
		System.out.println("Giriş başarılı "+ user.getName() + user.getSurname());
	}
	
	public void register(Student student) {
		System.out.println("Kayıt başarılı "+student.getName() + student.getSurname());
	}
}
