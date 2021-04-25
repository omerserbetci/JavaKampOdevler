package Ders2_Kodlama.io;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("C# Yazılım Geliştirici Kursu");
		course1.setCourseDetail("C# Yazılım Geliştirici Kursu");

		Course course2 = new Course(2, "Java&React Yazılım Geliştirici Kursu", "Java&React Yazılım Geliştirici Kursu",
				null);

		Student student1 = new Student();
		student1.setStudentId(1);
		student1.setStudentName("Ömer Yiğit Şerbetçi");
		student1.setStudentEMail("omerserbetciii@gmail.com");
		
		Student student2 = new Student(2, "Gökhan Gülen", "gokhan.gulen@etiya.com", null);
		
		Course[] courses = {course1, course2};
		Student[] students = {student1, student2};
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.joinCourse(course2, student1);
		studentManager.joinCourse(course2, student2);
		
		studentManager.printStudents(students);
		
		
		
	}

}
