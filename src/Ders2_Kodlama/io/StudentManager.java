package Ders2_Kodlama.io;

public class StudentManager {

	public void joinCourse(Course course, Student student) {
		course.setStudent(student);
		student.setCourse(course);
	}
	
	public void printStudents(Student[] students) {
		for(Student student : students) {
			System.out.println(student.getStudentName() + "\n" +
							   student.getStudentEMail() + "\n" + 
							   student.getCourse().courseName);
		}
	}
}
