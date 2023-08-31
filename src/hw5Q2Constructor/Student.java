package hw5Q2Constructor;

public class Student {
// variables declare here

	public String studentName;
	public int studentID;
	public char studentGender;
	public boolean isProgrammer;
	public float studentGrade;

//default constructor declared here

	public Student() {
		System.out.println("This is from the default Constructor of the Student Class");
	}

	public Student(String studentName, int studentID, char studentGender, boolean isProgrammer, float studentGrade) {
		super();
		this.studentName = studentName;
		this.studentID = studentID;
		this.studentGender = studentGender;
		this.isProgrammer = isProgrammer;
		this.studentGrade = studentGrade;
		System.out.println("Student Name: " + studentName + ", ID: " + studentID + ", Gender: "
				+ studentGender +  ", Grade: " + studentGrade + ", Java Programmer? Ans: " + isProgrammer);
	}

}
		



