package Ders3_Kodlama.io_Odev2;

public class Student extends User{

	String studentDetail;
	String[] coursesJoined;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String eMailAdress, String userName, 
			String password, String dateOfJoin, String studentDetail, String[] coursesJoined) {
		setId(id);
		setFirstName(firstName);
		setLastName(lastName);
		seteMailAdress(eMailAdress);
		setUserName(userName);
		setPassword(password);
		setDateOfJoin(dateOfJoin);
		this.studentDetail = studentDetail;
		this.coursesJoined = coursesJoined;
	}
	
	public String getStudentDetail() {
		return studentDetail;
	}
	public void setStudentDetail(String studentDetail) {
		this.studentDetail = studentDetail;
	}
	
	public String[] getCoursesJoined() {
		return coursesJoined;
	}
	public void setCoursesJoined(String[] coursesJoined) {
		this.coursesJoined = coursesJoined;
	}
	
}
