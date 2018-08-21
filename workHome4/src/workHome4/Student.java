package workHome4;

public class Student extends Human {
	private String specialty;
	private int studyYear;

	public Student(String name, String male, int age, String specialty, int studyYear) {
		super(name, male, age);
		this.specialty = specialty;
		this.studyYear = studyYear;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getStudyYear() {
		return studyYear;
	}

	public void setStudyYear(int studyYear) {
		this.studyYear = studyYear;
	}

	@Override
	public String toString() {
		return "Student: specialty=" + specialty + ", studyYear=" + studyYear + " " + super.toString();
	}

}
