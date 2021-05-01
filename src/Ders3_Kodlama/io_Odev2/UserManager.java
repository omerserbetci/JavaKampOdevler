package Ders3_Kodlama.io_Odev2;

public class UserManager {

	public void signIn(String userName, String password, User user) {
		if(user.userName == userName && user.password == password) {
			System.out.println("Signed in.");
		} else {
			System.out.println("Wrong user name or password!");
		}
	}
	
	public void updateUser(String firstName, String lastName, String eMailAdress, User user) {
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.seteMailAdress(eMailAdress);
		System.out.println("User updated succesfully.");
	}
	
	public void changePassword(User user, String oldPassword, String newPasword) {
		if (user.password == oldPassword) {
			user.setPassword(newPasword);
			System.out.println("Password changed.");
		}		
	}
	
}
