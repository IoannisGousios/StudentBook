public class Student{		
	public String firstName;
	public String lastName;
	public String age;
	public String height;
	public String tuition;
	public String date;
	public String phone;
	public String conduct;

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

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getConduct() {
		return conduct;
	}

	public void setConduct(String conduct) {
		this.conduct = conduct;
	}


	@Override
	public String toString() {
		return "==============================================================================================================="
	+ "\n First name: " + firstName + ", Last name: " + lastName + ", Age: " + age + ", Height: " + height
				+ ", Tuition: " + tuition + ", Date: " + date + ", Phone: " + phone + ", Conduct: " + conduct;
	}

	
	



}
