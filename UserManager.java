
public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi "+ user.getName() + user.getSurname());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi "+ user.getName() + user.getSurname());
	}
}
