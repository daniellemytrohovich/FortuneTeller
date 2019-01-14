import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// First name
		System.out.println("Please enter your first name");
		String firstNameResponse = input.nextLine();
		// Last name
		System.out.println("Please enter last name");
		String lastNameResponse = input.nextLine();
		// Age
		System.out.println("What is your age?");
		int ageResponse = Integer.parseInt(input.nextLine());
		// Siblings
		System.out.println("How many siblings do you have?");
		int siblingResponse = Integer.parseInt(input.nextLine());
		// Birth Month
		System.out.println("What is your birth month? (please enter numerical value)");
		int monthResponse = Integer.parseInt(input.nextLine());
		// ROYGBIV
		Scanner input2 = new Scanner(System.in);
		String colorResponse;
		do {
			System.out.println("Please list favorite ROYGBIV color. Enter \'help\' for list.");
			colorResponse = input.nextLine();
			if (colorResponse.equals("help")) {
				System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			}
		} while (colorResponse.equals("help"));
		input.close();
		// Retirement-ageResponse

		String retirement = " ";
		if (ageResponse % 2 == 0)
			retirement = "NEVER";
		else
			retirement = "tomorrow";

		// Vacation Home-siblingResponse

		String vacationHome = " ";
		if (siblingResponse < 0)
			vacationHome = "Akron, Ohio!";
		else
			vacationHome = "Monterey Bay!";

		// Bank Balance-monthResponse
		String bankBalance = " ";
		if (monthResponse < 0)
			bankBalance = "$0.00";
		if (monthResponse > 12)
			bankBalance = "$0.00";
		else
			bankBalance = "$100 million dollars";

		// Mode of Transportation-colorResponse
		String transportation = " ";
		if (colorResponse.toLowerCase().contains("red"))
			transportation = "Vespa";
		if (colorResponse.toLowerCase().contains("orange"))
			transportation = "bicycle";
		if (colorResponse.toLowerCase().contains("yellow"))
			transportation = "unicycle";
		if (colorResponse.toLowerCase().contains("green"))
			transportation = "horse";
		if (colorResponse.toLowerCase().contains("blue"))
			transportation = "scooter";
		if (colorResponse.toLowerCase().contains("indigo"))
			transportation = "car";
		if (colorResponse.toLowerCase().contains("violet"))
			transportation = "van";

		System.out.println(firstNameResponse + " " + lastNameResponse + " will retire" + " " + retirement + " with"
				+ " " + bankBalance + " in the bank, a vacation home in" + " " + vacationHome + ", and travel by" + " "
				+ transportation + ".");
	}
}
