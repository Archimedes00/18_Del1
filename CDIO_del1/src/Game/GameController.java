package Game;
import java.awt.event.ActionEvent;

/*
 * Metoden WinState er blevet flyttet til klassen "Player"
 * Derudover er der blevet flyttet et par variabler.
 * De kan nu ogs� findes under "Player" klassen.
 *
 * Metoderne LoseOfPoints og TwoOfAKind skal rykkes ind i Helenes
 * klasse "DiceCup" og er derfor ogs� ud kommenteret :)
 *
 * Main metoden skal opdateres s� den passer til de nye �ndringer.
 *
 * Med venlig hilsen
 * Kasper :)
 */

public class GameController {

	static boolean click = false;

	public static void main(String[] args) {

		int SumOfDice = 0;

		Player player1 = new Player();
		Player player2 = new Player();
		Die die1 = new Die();
		Die die2 = new Die();

		MyFrame f = new MyFrame();
		f.setVisible(true);



		while(player1.isWinner() == false && player2.isWinner() == false){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}

			if (player1.GetTurn() == 1 && click)
			{
				f.infoLab.setText("player1 tur");

				SumOfDice = die1.roll() + die2.roll();
				player1.SetPoints(player1.GetPoints() + SumOfDice);
				//								player1.SetPoints( LoseOfPoints(player1) );
				System.out.println();
				System.out.println("player1 rolled: " + SumOfDice);

				f.infoLab.setText("player1 rolled: " + SumOfDice);

				System.out.println("player1's has " + player1.GetPoints() + " points");

				f.PointPlayer1.setText(player1.GetPoints() + "points");

				player1.SetTurn(2);
				f.turnLab.setText("player 2 turn");
				click = false;

			}
			else if(player2.GetTurn() == 2 && click)
			{
				f.infoLab.setText("player2 tur");

				SumOfDice = die1.roll() + die2.roll();
				player2.SetPoints(player2.GetPoints() + SumOfDice);
				//				player2.SetPoints( LoseOfPoints(player2) );
				System.out.println();
				System.out.println("player2 rullede: " + SumOfDice);

				f.infoLab.setText("player2 rolled: " + SumOfDice);

				System.out.println("player2 has this many pointes " + player2.GetPoints());

				f.PointPlayer2.setText(player2.GetPoints() + "points");

				player2.SetTurn(1);
				f.turnLab.setText("player 1 turn");
				click = false;

			}
		}

		if(player1.isWinner()) {
			System.out.println("");
			f.infoLab.setText("Player 1 is the winner!");
			System.out.println("Player 1 is the winner!");
		}
		if(player2.isWinner()) {
			System.out.println("");
			f.infoLab.setText("Player 2 is the winner!");
			System.out.println("Player 2 is the winner!");
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
//			return p.GetPoints() + SumOfDice;		//	Kan det her lade sig gøre??. Ja det kan det :-)
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

