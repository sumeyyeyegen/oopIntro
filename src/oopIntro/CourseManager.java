package oopIntro;

public class CourseManager {
	//is nesnesi
	public void addCourse(Course course) {
		System.out.println(course.instructor + " kişisi " + course.name + " isimli kursu ekledi." );
	};
	public void removeCourse(Course course) {
		System.out.println(course.name + " " + course.instructor + " tarafından silindi." );
	};
}
