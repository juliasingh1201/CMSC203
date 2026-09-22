import java.util.Scanner;

public class MovieDriver_Task2 {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String continueInput = "y";

        while (continueInput.equalsIgnoreCase("y")) {

            Movie movie = new Movie();

            System.out.print("Enter the title of a movie: ");
            movie.setTitle(keyboard.nextLine());

            System.out.print("Enter the movie's rating: ");
            movie.setRating(keyboard.nextLine());

            System.out.print("Enter the number of tickets sold at an unnamed theater: ");
            movie.setSoldTickets(keyboard.nextInt());

            System.out.println(movie);

            keyboard.nextLine();

            System.out.print("Do you want to enter another movie? (y/n): ");
            continueInput = keyboard.nextLine();
        }

        keyboard.close();
    }
}