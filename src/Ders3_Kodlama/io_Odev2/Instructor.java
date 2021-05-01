package Ders3_Kodlama.io_Odev2;

public class Instructor extends User {

	String instructorDetail;
	String[] coursesGiven;
	
	Instructor() {
		
	}
	
	Instructor(int id, String firstName, String lastName, String eMailAdress, String userName, 
			String password, String dateOfJoin, String instructorDetail, String[] coursesGiven) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		seteMailAdress(eMailAdress);
		setUserName(userName);
		setPassword(password);
		setDateOfJoin(dateOfJoin);
		setInstructorDetail(instructorDetail);
		setCoursesGiven(coursesGiven);
	}
	
	public String getInstructorDetail() {
		return instructorDetail;
	}
	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}
	
	public String[] getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	
}
