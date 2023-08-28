package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // constructor initialize here

		System.out.println("My Name: " + aboutMe.myName + "\nMy Age:" + aboutMe.myAge + "\nMyHouse" + aboutMe.myHouse
				+ "\nMyemail:" + aboutMe.myEmail + "\nMyBankbalance:" + aboutMe.myBankbalance + "\nMyHeight:"
				+ aboutMe.myHeight + "\nMyGender:" + aboutMe.myGender + "\nMy Grade: " + aboutMe.myGrade
				+ "\nI am us Citizen :" + aboutMe.usCitizen);

		aboutMe.aboutMe(); // method initialized here
	}

}
