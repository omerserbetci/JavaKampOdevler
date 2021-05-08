package Ders4_Odev3;

import java.util.Calendar;

public class Member implements IMember{

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private Calendar dateOfBirth;
	private boolean isMember;
	private String userName;
	private String password;
	
	public Member(int id, String firstName, String lastName, String nationalityNumber) {
		
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setNationalityNumber(nationalityNumber);
		setMember(false);
	}
	
	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

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
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}
	
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
    
	public void setDateOfBirth(int day, int month, int year ) {
		this.dateOfBirth = Calendar.getInstance();
		dateOfBirth.set(year, month-1, day);
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
	
}
