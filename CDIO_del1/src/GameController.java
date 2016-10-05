/*
 * Metoden WinState er blevet flyttet til klassen "Player"
 * Derudover er der blevet flyttet et par variabler.
 * De kan nu også findes under "Player" klassen.
 * 
 * Metoderne LoseOfPoints og TwoOfAKind skal rykkes ind i Helenes 
 * klasse "DiceCup" og er derfor også ud kommenteret :)
 * 
 * Main metoden skal opdateres så den passer til de nye ændringer.
 * 
 * Med venlig hilsen 
 * Kasper :)
 */

public class GameController {


	
	public static void main(String[] args) {

		int SumOfDice = 0;				

		Player player1 = new Player();
		Player player2 = new Player();
		Die die1 = new Die();
		Die die2 = new Die();

		while(WinState() == 0){

			if (PlayerTurn == 1){
				SumOfDice = die1.roll() + die2.roll();
				player1.SetPoints( LoseOfPoints(player1) );
				System.out.println("");
				System.out.println("player1 rolled " + SumOfDice);
				System.out.println("player1's has " + player1.GetPoints() + " points");
				Winner = WinState();
				PlayerTurn = 2;
			}

			if(PlayerTurn == 2){
				SumOfDice = die1.roll() + die2.roll();
				player2.SetPoints( LoseOfPoints(player2) );
				System.out.println("");
				System.out.println("player2 rullede " + SumOfDice);
				System.out.println("player2 has this many pointes " + player2.GetPoints());
				Winner = WinState();
				PlayerTurn = 1;
			}
		}
	}
	
//	private int WinState() {
//
//		if (player1.GetPoints() >= 40){
//			System.out.println("Player 1 has won the g!");
//			return 1;
//		}
//
//		else if (player2.GetPoints() >= 40){
//			System.out.println("Player 2 has won the g!");
//			return 2;
//		}
//		else {
//			return 0;
//		}
//	}
//
//	private int LoseOfPoints(Player p) {
//
//		if(SumOfDice == 2){
//			return 0;
//		}
//		else {
//			return p.GetPoints() + SumOfDice;		//	Kan det her lade sig gÃ¸re??. Ja det kan det :-)
//		}
//	}
//
//	private int TwoOfAKind() {
//
//		if (PlayerTurn == 1){
//			if (die1 == die2 && SumOfDice > 2){
//
//			}
//		}
//
//		return 0;
//	}

}	