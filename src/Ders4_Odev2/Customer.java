package Ders4_Odev2;

import java.util.Calendar;

public class Customer implements IEntity{

	private int id;
	private String firstName;
	private String lastName;
	private String nationalityNumber;
	private Calendar dateOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String nationalityNumber) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		setNationalityNumber(nationalityNumber);
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

	public void setDateOfBirth(int year, int mounth, int day) {
		Calendar calender = Calendar.getInstance();
		calender.set(year, mounth-1, day);
		this.dateOfBirth = calender;
	}
	
	
	
}
