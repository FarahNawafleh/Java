import java.util.Scanner;

public class StartGame {

	public static void main(String[] args) {

		 Game game = new Game();

	        game.shuffleCards();
	        System.out.println("Shuffele Cards...");
	        game.showAllCards();

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter Player 1 name");
	        Players player1 = new Players(sc.nextLine());
	        System.out.println("Please enter Player 2 name");
	        Players player2 = new Players(sc.nextLine());
	        System.out.println("Please enter Player 3 name");
	        Players player3 = new Players(sc.nextLine());
	        System.out.println("Please enter Player 4 name");
	        Players player4 = new Players(sc.nextLine());

	        game.distribute(player1, player2, player3, player4);
	        System.out.println("---------------------------------------------");
	        System.out.println(player1.getName());
	        player1.ShowPlayerCards();
	        System.out.println(player2.getName());
	        player2.ShowPlayerCards();
	        System.out.println(player3.getName());
	        player3.ShowPlayerCards();
	        System.out.println(player4.getName());
	        player4.ShowPlayerCards();
	}
}
