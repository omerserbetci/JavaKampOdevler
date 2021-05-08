package Ders2_Kodlama.io;

public class Course {

	int courseId;
	String courseName;
	String courseDetail;
	Student student;
	
	public Course() {
		System.out.println("Course constructor worked.");
	}
	
	public Course(int id, String name, String detail, Student student) {
		this();
		setCourseId(id);
		setCourseName(name);
		setCourseDetail(detail);
		setStudent(student);
	}
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	
	
}
