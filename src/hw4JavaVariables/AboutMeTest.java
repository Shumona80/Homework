package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe(); //Constructor initialized here.
		aboutMe.myName = "Shumona Hoque";
		aboutMe.myAge = 25;
		aboutMe.myHouse = 14226;
		aboutMe.myEmail =10001;
		aboutMe.myBankbalance = 20000001l;
		aboutMe.myGrade = 4.12f;
		aboutMe.myHeight = 5.123;
		aboutMe.myGender = 'F';
		aboutMe.usCitizen = true;
		
				
		aboutMe.aboutMe(); //method initialized here
		
		
		
	AboutMe alex = new AboutMe(); //constructor initialized.
	alex.myName = "Alex";
	alex.myAge = 55;
	alex.myEmail = 20001;
	alex.myBankbalance = 300000000l;
	alex.myGrade =4.32f;
	alex.myHeight = 6.76543;
	alex.myGender = 'M';
	alex.usCitizen = false;
	//
			
			
			
	
	alex.aboutMe(); //method initialized here
	
	

	}

}
