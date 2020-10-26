import java.util.Random;

class Game {
	private final int size = 52;
	Card[] allCards = new Card[size];

	public Game() {
//construct all cards 
		int count = 0;

		String[] shape = { "Spades", "Diamonds", "Hearts", "Clubs" };
		String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (String s : shape) {
			for (String r : number) {
// dependency , object from another class inside a method 
				Card card = new Card(s, r);
				this.allCards[count] = card;
				count++;
			}
		}

	}

	public void shuffleCards() {
		Random rand = new Random();
		int j;
		for (int i = 0; i < size; i++) {
			j = rand.nextInt(52);
			// swap each index with random index
			Card c = allCards[i];
			allCards[i] = allCards[j];
			allCards[j] = c; // the first value to the random index to avoid duplication
		}
	}

	public void showAllCards() {
		System.out.println("---------------------------------------------");
		int count = 0;
		// composition
		for (Card card : allCards) {
			System.out.print(card.number +" "+ card.shape + "     ");
			count++;
			if (count % 4 == 0) // print every 4 card on one line
				System.out.println("");
		}
		System.out.println("---------------------------------------------");
	}

	public void distribute(Players player1, Players player2, Players player3, Players player4) {

		int counter = 0;

		for (Card card : allCards) {

			if (counter > 38) {
				player1.playerCards[counter % 13] = card;
				/* 39 mod 13 =0
				 * 40 mod 13 = 1
				 * 41 mod 13 = 2
				 * 42 mod 13 =3
				 * ...
				 * 51 mod 13 = 12 -> index 12 = card number 13
				*/
			} else if (counter > 25) {
				player2.playerCards[counter % 13] = card;
				/*
				 * 26 mod 13= 0
				 * 
				 * */
			} else if (counter > 12) {
				player3.playerCards[counter % 13] = card;
			} else {
				player4.playerCards[counter % 13] = card;
			}
			counter++;
		}
	}
}