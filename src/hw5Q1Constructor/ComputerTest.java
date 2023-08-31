package hw5Q1Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer Computer = new Computer();
		
		Computer Apple = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		
		Computer windows = new Computer("HP", "Probook", "Windows 11", 600, 'B', true);

	}

}
