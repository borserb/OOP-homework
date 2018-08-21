package workHome4;

public class Human {
	private String male;
	private int age;
		private String name;

	public Human(String name,String male, int age) {
		super();
		this.male = male;
		this.age = age;
		
		this.name = name;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return " male=" + male + ", age=" + age + ", name=" + name;
	}


	
	

}
