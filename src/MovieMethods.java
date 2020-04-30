import java.util.List;
import java.util.Scanner;

public class MovieMethods {
	
	//Get yes or no input
	public static boolean getYesNo(Scanner scan) {
		String input;
		while (true) {
			input = scan.nextLine().toLowerCase();
			if (input.startsWith("y")) {
				return true;
			} else if (input.startsWith("n")) {
				return false;
			} else {
				System.out.print("Invalid answer. Please try again. (y/n): ");
			}
		}
	}
	
	//Allow user to pick a category
	public static String pickCategory(Scanner scan) {
		
		String category = "";
		String input = "";
		System.out.print("Here are the movie categories: ");
		System.out.print("\n1. Animated" + 
						"\n2. Drama" +
						"\n3. Horror" +
						"\n4. Sci-fi" +
						"\n5. Musical" +
						"\n6. Comedy");
		System.out.print("\n\nWhich category are you interested in? (enter number): ");
		while(true) {
			input = scan.nextLine();
			if (input.contains("1")) {
				category = "animated";
				break;
			} else if (input.contains("2")) {
				category = "drama";
				break;
			} else if (input.contains("3")) {
				category = "horror";
				break;
			} else if (input.contains("4")) {
				category = "scifi";
				break;
			} else if (input.contains("5")) {
				category = "musical";
				break;
			} else if (input.contains("6")) {
				category = "comedy";
				break;
			} else {
				System.out.print("Please enter a valid category number: ");
			}
			//The only thing about the way I did this, if it's a double
			//digit or triple digit number entered, it only takes the
			//first digit into account. Not messing with it for now.
		}
		return category;
	}

}
