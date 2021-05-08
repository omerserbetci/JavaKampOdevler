package Ders2_Kodlama.io;

public class Student {

	private int studentId;
	private String studentName;
	private String studentEMail;
	private Course course;
	
	public Student() {
		System.out.println("Student constructor worked.");
	}
	
	public Student(int id, String name, String Email, Course course) {
		this();
		setStudentId(id);
		setStudentName(name);
		setStudentEMail(Email);
		setCourse(course);
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentEMail() {
		return studentEMail;
	}
	public void setStudentEMail(String studentEMail) {
		this.studentEMail = studentEMail;
	}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
