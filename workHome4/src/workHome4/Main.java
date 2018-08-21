package workHome4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student("Serg", "male", 20, "Economic", 4);
		Student s2 = new Student("Alex", "male", 21, "Economic", 6);
		Student s3 = new Student("Irina", "female", 19, "Economic", 5);
		Student s4 = new Student("Stas", "male", 23, "Economic", 4);
		Student s5 = new Student("Igor", "male", 18, "Economic", 6);
		Student s6 = new Student("Julia", "female", 19, "Economic", 5);

		Group a1 = new Group("A1");

		try {
			a1.addStudent(s1);
			a1.addStudent(s2);
			a1.addStudent(s3);
			a1.addStudent(s4);
			a1.addStudent(s5);
			a1.addStudent(s6);

		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

		a1.toScreen();
		System.out.println();

		a1.delStudent("Serg");
		a1.delStudent("Serg");
		System.out.println();
		a1.toScreen();

		a1.search("Stas");

		try {
			a1.addStudentUser();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println();
		a1.toScreen();

	}

}
