package Inheritance;

public class SingleInheritanceDemo1 {
	public static void main(String[] args) {
		Student1 s = new Student1();
		s.showPersonINfo();
		s.showStudentInfo();
	}

}
class Student1 extends Person1 {
	void showStudentInfo() {
		System.out.println("Student: showStudentInfo()");
	}
}
class Person1 {
	void showPersonINfo() {
		System.out.println("Person: showPersonInfo()");
	}
}