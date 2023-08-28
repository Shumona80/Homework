package hw4JavaVariables;


public class AboutMe {

	// variable declared here

	public String myName;
	public byte myAge;
	public short myHouse;
	public int myEmail;
	public long myBankbalance;
	public float myGrade;
	public double myHeight;
	public boolean usCitizen;
	public char myGender;

	public AboutMe() { //Constructor declared here
		System.out.println("This is all about us");
	}

	public void aboutMe() { //method implemented here
		System.out.println("My Name: " + myName + "\nMy Age:" + myAge + "\nMyHouse" + myHouse + "\nMyemail:" + myEmail
				+ "\nMyBankbalance:" + myBankbalance + "\nMyHeight:" + myHeight + "\nMyGender:" + myGender
				+ "\nMy Grade: " + myGrade + "\nI am us Citizen :" + usCitizen);

	}
}
