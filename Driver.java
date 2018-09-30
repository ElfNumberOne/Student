import java.util.Scanner;
public class Driver{

public static void main(String[] args) {
	String arg1,arg2,arg3;
	Scanner reader = new Scanner(System.in);  // Reading from System.in
	System.out.println("Enter number of students to be input:");
	int n = reader.nextInt();
	Student[] list = new Student[n];
	for (int i = 0;i <n ;i++ ) {
		System.out.println("Enter first name:");
		arg1 = reader.next();
		System.out.println("Enter last name:");
		arg2 = reader.next();
		System.out.println("Enter major:");
		arg3 = reader.next();
		list[i] = new Student(arg1,arg2,arg3);
	}

	System.out.println("First Name\t\tLast Name\t\tMajor");
	for (int j = 0;j < n;j++) {
		System.out.println(list[j].getFirstName()+"\t\t\t"+list[j].getLastName()+"\t\t"+list[j].getMajor());	
	}
}
}