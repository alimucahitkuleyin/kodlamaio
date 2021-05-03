
public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi "+ user.getName() + user.getSurname());
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi "+ user.getName() + user.getSurname());
	}
}
