package chapter2.casting;

public class Student implements Person{
	String id;
	String name;
	int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	protected int studyHours() {
		return age/2;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public boolean equals(Person other) {
		if (!(other instanceof Person)) return false;
		Student s= (Student) other;
		return id.equals(s.id);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
