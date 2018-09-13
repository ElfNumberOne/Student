import java.lang.String;

public class Student{
	String fname;
	String lname;
	String age;
	String major;
	String gpa;
	public Student(){

	}

	public Student(String name, String major){
		this.name = name;
		this.major = major;
	}

	public String getFirstName(){
		return fname;
	}

	public String getLastName(){
		return lname;
	}

	public String getAge(){
		return age;
	}

	public String getMajor(){
		return major;
	}

	public String getGpa(){
		return gpa;
	}//getgpa

	public void setName(String fname,String lname){
		this.fname = fname;
		this.lname = lname;
	}

	public void setAge(String age){
		this.age = age;
	}

	public void setMajor(String major){
		this.major = major;
	}

	public void setGpa(String gpa){
		this.gpa = gpa;
	}//getgpa



}//class