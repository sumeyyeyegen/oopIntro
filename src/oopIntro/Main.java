package oopIntro;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Yazılım Geliştirici Kampı (C#+Angular)","Engin Demirog");
		Course course2 = new Course(2,"Yazılım Geliştirici Kampı (Java+React)","Engin Demirog");
		Course course3 = new Course(3,"Temel Kurs","Engin Demirog");
		
		Category category1 = new Category(1,"Yazılım");
		Category category2 = new Category(2,"Matematik");
		
		CourseManager manager = new CourseManager();
		
		Course[] courses = {course1,course2,course3};
		Category[] category = {category1,category2};
		
		manager.addCourse(course2);
		manager.removeCourse(course1);
		
		System.out.println(courses.length);
		System.out.println(category.length);

	}

}
