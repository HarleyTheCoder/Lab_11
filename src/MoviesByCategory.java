import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MoviesByCategory {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String category;
		
		//I used a wrong category at first so I'm just keeping it as extra.
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Spirited Away", "animated"));
		movies.add(new Movie("Leap", "animated"));
		movies.add(new Movie("Finding Nemo", "animated"));
		movies.add(new Movie("The Joker", "drama"));
		movies.add(new Movie("American History X", "drama"));
		movies.add(new Movie("Hidden Figures", "drama"));
		movies.add(new Movie("Wrong Turn", "horror"));
		movies.add(new Movie("Saw", "horror"));
		movies.add(new Movie("The Texas Chainsaw Massacre", "horror"));
		movies.add(new Movie("Maleficent", "scifi"));
		movies.add(new Movie("Jurassic Park", "scifi"));
		movies.add(new Movie("The Dark Night", "scifi"));
		movies.add(new Movie("The Heat", "comedy"));
		movies.add(new Movie("Anger Management", "comedy"));
		movies.add(new Movie("Jojo Rabbit", "comedy"));
		
		//Fill movie list with even more movies from GitHub
		for (int i = 1; i <= 100; i++) {
			movies.add(MovieIO.getMovie(i));
		}
		
		//Get desired category from user
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("\nThere are " + movies.size() + " movies in the list.");
		
		//Display movies in chosen category.
		
		
		
		while (true) {
			category = MovieMethods.pickCategory(scan);
			String capitalized = category.substring(0, 1).toUpperCase() + 
					category.substring(1);
			List<String> tempMovies = new ArrayList<>();
			for (Movie movie: movies) {
				if (movie.getCategory().contentEquals(category)) {
					tempMovies.add(movie.getTitle());
				}
			}
			//Sort movies by title
			Collections.sort(tempMovies);
			//Display list of movies
			System.out.println("\nCategory: " + capitalized);
			System.out.println(String.format("%-30s", "-").replace(" ", "-"));
			for (String movie: tempMovies) {
				System.out.println(movie);
			}
			//Ask whether to continue or not
			System.out.print("\nContinue? (y/n): ");
			if (!MovieMethods.getYesNo(scan)) {
				break;
			}
		}
		
		
		scan.close();
	}
}
