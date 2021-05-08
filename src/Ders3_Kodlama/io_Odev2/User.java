package Ders3_Kodlama.io_Odev2;

public class User {

	int id;
	String firstName;
	String lastName;
	String eMailAdress;
	String userName;
	String password;	
	String dateOfJoin;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String geteMailAdress() {
		return eMailAdress;
	}
	public void seteMailAdress(String eMailAdress) {
		this.eMailAdress = eMailAdress;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(String dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
}
