package workHome4;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Group{
	Student[] students = new Student[9];
	String nameGroup;

	public Group(String nameGroup) {
		super();
		this.nameGroup = nameGroup;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addStudent(Student s) throws MyException {

		for (int nStudent = 0; nStudent < students.length; nStudent++) {
			if (students[nStudent] == null) {
				students[nStudent] = s;
				return;
			}
		}
		throw new MyException();

	}

	public void addStudentUser() throws MyException {
		Student s = new Student();
		for (int nStudent = 0; nStudent < students.length; nStudent++) {
			if (students[nStudent] == null) {

				try {
					s.setName(JOptionPane.showInputDialog("Input name of student"));
					s.setAge(Integer.valueOf(JOptionPane.showInputDialog("Input age of student")));
					s.setMale(JOptionPane.showInputDialog("Input sex of student"));
					s.setSpecialty(JOptionPane.showInputDialog("Input specialty of student"));
					s.setStudyYear(Integer.valueOf(JOptionPane.showInputDialog("Input studyYear of student")));
					students[nStudent] = s;
				} catch (java.lang.NumberFormatException e) {
					System.out.println("Error - new student was not added");
				}
				return;
			}
		}
		throw new MyException();

	}

	public void delStudent(String name) {

		for (int nStudent = 0; nStudent < students.length; nStudent++) {

			try {
				if (students[nStudent].getName() == name) {
					System.out.println("Delelet " + students[nStudent].toString());
					students[nStudent] = null;
					return;
				}
			} catch (NullPointerException e) {
				// System.out.println(e.getMessage());
			}
		}
		System.out.println(name + " Not delete ");
	}

	public void search(String name) {

		for (int nStudent = 0; nStudent < students.length; nStudent++) {

			if (students[nStudent] != null && students[nStudent].getName() == name) {
				System.out.println("Find " + students[nStudent].toString());
				// students[nStudent] = null;
				return;

			}
		}
		System.out.println(name + " Not Find ");
	}

	public void sortByName(String name) {
		Student[] sortStudents = new Student[9];
		
		for (int nStudent = 0; nStudent < students.length; nStudent++) {

			if (students[nStudent] != null && students[nStudent].getName() == name) {
				System.out.println("Find " + students[nStudent].toString());
				// students[nStudent] = null;
				return;

			}
		}
		System.out.println(name + " Not Find ");
	}
	

	
	public void toScreen() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("Group " + nameGroup + " " + students[i].toString());
			}

		}
	}

}
