package week5;

import java.util.Random;
import java.util.Scanner;

public class GameV2 {


	public static void ShowPlayerCards(String[] playerCards) {
		System.out.println("............");
		for (int i = 0; i < 13; i++) {
			System.out.println(playerCards[i]);
		}
		System.out.println("............");
	}
	public static void showCards(String[] allCards){
        System.out.println("***************");
        int count =0;
        for (int i=0; i<52; i++){
            System.out.print(allCards[i]);
            count++;
            if(count%4==0)
                System.out.println("");
        }
        System.out.println("***************");
    }
	
	public static void shuffleCards(String[] allCards) {
		Random rand = new Random();
		int j;
		for (int i = 0; i < 52; i++) {
			j = rand.nextInt(52);
			String temp = allCards[i];
			allCards[i] = allCards[j];
			allCards[j] = temp;
		}
	}
	public static void distribute(String[] allCards ,String[] player1Cards,String[] player2Cards,String[] player3Cards,String[] player4Cards){

        int count = 0;

        for (int i=0; i< allCards.length; i++){

            if (count>38){
                player1Cards[count%13] = allCards[i];
            }
            else if (count>25){
                player2Cards[count%13] = allCards[i];
            }
            else if (count>12){
                player3Cards[count%13] = allCards[i];
            }
            else{
                player4Cards[count%13] = allCards[i];
            } 
            count++;
        }
    }
	public static void main(String[] args) {

		String[] cardType = { "Diamonds", "Clubs", "Hearts", "Spades" };
		String[] cardValue = { "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "Ace", };
		String[] allCards = new String[52];
		String player1Name;
		String player2Name;
		String player3Name;
		String player4Name;
		String[] player1Cards = new String[13];
		String[] player2Cards = new String[13];
		String[] player3Cards = new String[13];
		String[] player4Cards = new String[13];
		int count = 0;
		for (int i = 0; i < cardType.length; i++) {
			for (int j = 0; j < cardValue.length; j++) {
				allCards[count] = cardType[i] + " " + cardValue[j];
				count++;
			}	
	}
		  System.out.println("UnShuffeled Cards.");
	        showCards(allCards);
	        shuffleCards(allCards);
	        System.out.println("Shuffeled Cards.");
	        showCards(allCards);

	        Scanner input = new Scanner(System.in);
	        System.out.println("Player One...\nEnter Name:");
	        player1Name = input.nextLine();
	        System.out.println("Player Two...\nEnter Name:");
	        player2Name= input.nextLine();
	        System.out.println("Player Three...\nEnter Name:");
	        player3Name =input.nextLine();
	        System.out.println("Player Four...\nEnter Name:");
	        player4Name =input.nextLine();

	        distribute(allCards, player1Cards, player2Cards, player3Cards, player4Cards);
	        System.out.println("---------------------------------------------");
	        System.out.println(player1Name);
	        ShowPlayerCards(player1Cards);
	        System.out.println(player2Name);
	        ShowPlayerCards(player1Cards);
	        System.out.println(player3Name);
	        ShowPlayerCards(player1Cards);
	        System.out.println(player4Name);
	        ShowPlayerCards(player1Cards);
}
	}
