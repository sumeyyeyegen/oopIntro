package oopIntro;

public class Course {
	//�zellik Nesnesi
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
