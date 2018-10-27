import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;




public class StudentLogic {
	List<Student> students = new ArrayList<>();

	public void readFile() {
		try {			
			Scanner input = new Scanner(new File("C:\\Users\\John\\Desktop\\CB6 files\\weekly 3\\Lab3_Names.txt"));
			input.useDelimiter(",|\n");

			input.nextLine();
			while(input.hasNext()) {
				String firstName = input.next().toLowerCase().trim();
				String lastName = input.next().toLowerCase().trim();
				String age = input.next();
				String height= input.next();
				String tuition = input.next();
				String date = input.next();
				String phone = input.next();				

				Student newStudent = new Student(firstName, lastName, age, height, tuition, date, phone);
				students.add(newStudent);

			}


		}catch(FileNotFoundException e) {
			System.out.println("Wrong path or file does not exist");
		}

	}

	public void print() {
		for (Student student : students) {
			System.out.println(student);
		}
	}


	public void sortLast() {
		Collections.sort(students, Comparator.comparing(Student::getLastName));
		for (Student student : students) {
			System.out.println(student);
		}

	}

	public void sortAge() {
		Collections.sort(students, Comparator.comparing(Student::getAge));
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void sortPhone() {
		Collections.sort(students, Comparator.comparing(Student::getPhone));
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void changeCon() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student last name to change conduct");
		String name = scanner.next();
		for (Student student : students) {
			if (name.equals(student.getLastName())) {
				System.out.println("Enter conduct ");
				String con = scanner.next();
				student.setConduct(con);
				System.out.println(name + "'s conduct changed to " +con);
				System.out.println(student);
				break;
			}
		}
	}

	public void searchSt() {
		System.out.println("Please enter the student you want to search.");
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		for (Student student : students) {
			if (name.equals(student.getLastName())) {
				System.out.println(student);
				break;
			}			 
		}
}


	public void startApp() {
		Scanner sc = new Scanner(System.in);
		boolean exit=false;


		printMenu();

		while(!exit) {

			String input = sc.next();

			switch(input) {
			case "load" :
				readFile();
				System.out.println("File 'Lab3_Names.txt' was read successfully");
				break;
			case "print" :
				print();
				break;
			case "sl" :
				sortLast();
				break;
			case "sa" :
				sortAge();
				break;
			case "sp" :
				sortPhone();
				break;
			case "cc" :
				changeCon();
				break;
			case "ss" :
				searchSt();
				break;
			case "menu" :
				printMenu();
				break;
			case "q" :			
				System.out.println("Thank you for using our app. \n App terminated.");
				exit=true;
				break;
			default :
				System.out.println("Invalid command");
			}
		}

	}

	public void printMenu() {
		System.out.println("Welcome to the StudentBook® app. How you want to procced? "
				+"\n========================================================"
				+ "\n1. Type 'load' to load the student catalog. "
				+ "\n2. Type 'print' to see the complete student list. "
				+ "\n3. Type 'sl' to sort student list according to the last name. "
				+ "\n4. Type 'sa' to sort student list according to the age. " 
				+ "\n5. Type 'sp' to sort student list according to the phone number. "
				+ "\n6. Type 'cc' to change student's conduct. "
				+ "\n7. Type 'ss' to search for student. "
				+ "\n8. Type 'menu' to see the menu again. "
				+ "\n9. Type 'q' to quit. ");

	}

}
