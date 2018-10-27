public class Student{		
	private String firstName;
	private String lastName;
	private String age;
	private String height;
	private String tuition;
	private String date;
	private String phone;
	private String conduct;

	public Student(String firstName, String lastName, String age, String height, String tuition,String date, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.tuition = tuition;
		this.date = date;
		this.phone = phone;
		this.conduct = "good";
	}


	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	public String getAge() {
		return age;
	}

	
	public String getHeight() {
		return height;
	}

	
	public String getTuition() {
		return tuition;
	}

	
	public String getDate() {
		return date;
	}

	
	public String getPhone() {
		return phone;
	}

	
	public String getConduct() {
		return conduct;
	}

	
	@Override
	public String toString() {
		return "==============================================================================================================="
	+ "\n First name: " + firstName + ", Last name: " + lastName + ", Age: " + age + ", Height: " + height
				+ ", Tuition: " + tuition + ", Date: " + date + ", Phone: " + phone + ", Conduct: " + conduct;
	}

	
	



}
