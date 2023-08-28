package hw4JavaVariablesInitialized;

public class AboutMe {

// variable is declared here
	public String myDocument;
//variable is initialized here 
	public String myName = "Shumona Hoque";

	public byte myAge = 25;
	public short myHouse = 14226;
	public int myEmail = 1001;
	public long myBankbalance = 2000001l;
	public float myGrade = 3.123f;
	public double myHeight = 5.1234545;
	public boolean usCitizen = true;
	public char myGender = 'F';

	public AboutMe() { // constructor declared here
		System.out.println("This is all about Myself");
	}

	public void aboutMe() { // method implemented here
		System.out.println("My Name: " + myName + "\nMy Age:" + myAge + "\nMyHouse" + myHouse + "\nMyemail:" + myEmail
				+ "\nMyBankbalance:" + myBankbalance + "\nMyHeight:" + myHeight + "\nMyGender:" + myGender
				+ "\nMy Grade: " + myGrade + "\nI am us Citizen :" + usCitizen);
	}

}
