
public class Players {
	private String name;

	// each player has 13 card
	//composition
	public Card[] playerCards = new Card[13];
	

	public Players(String name) {
		setName(name);
	}

	public void ShowPlayerCards() {
		System.out.println("===============");
		for (Card card : playerCards) {
			if (card != null)
				System.out.println(card.number +"  "+ card.shape);
		}
		System.out.println("===============");

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
