package oopIntro;

public class Course {
	//Özellik Nesnesi
	int id;
	String name;
	String instructor;
	Category categoryName;

	public Course(int id,String name, String instructor) {
		this.id=id;
		this.name=name;
		this.instructor=instructor;
	}
}
