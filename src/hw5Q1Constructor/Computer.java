package hw5Q1Constructor;

public class Computer {
//variables declared
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

// default constructor declared
	public Computer() {
		System.out.print("I am default constructor");
	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.grade = grade;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println("Computer Brand: " + brand + "\nComputer Model: " + model + "\nComputer Operating System: "
				+ operatingSystem + "\nComputer Grade: " + grade + "\nComputer Price: " + price
				+ "\nThis computer is made in USA : " + madeInUSA);

	}

	public Computer(String brand, String operatingSystem, int price, char grade, boolean madeInUSA) {
		this.brand = brand;
		this.operatingSystem = operatingSystem;
		this.grade = grade;
		this.price = price;
		this.madeInUSA = madeInUSA;
		System.out.println(
				"Computer Brand: " + brand + "\nComputer Operating System: " + operatingSystem + "\nComputer Grade: "
						+ grade + "\nComputer Price: " + price + "\nThis computer is made in USA : " + madeInUSA);

	}

}
