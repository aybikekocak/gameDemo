package homework3;

public class UserManager {

	public void singIn(User user) {
		System.out.println(user.getName() +"sisteme giriş yapıldı.");
	}
	
	public void singOut(User user) {
		System.out.println(user.getName() + "sistemden çıkış yapıldı.");
	}
}
