
public class GameController {

	int SumOfDice = 0;				// kommer fra Player-klasse
	int PlayerTurn = 1;				// kommer fra min egen klasse
	int Winner = 0; 

	Player player1 = new Player();
	Player player2 = new Player();
	Die die1 = new Die();
	Die die2 = new Die();
	
	public static void main(String[] args) {

		GameController gc = new GameController();

		while(gc.WinState() == 0){

			if (gc.PlayerTurn == 1){
				gc.SumOfDice = gc.die1.roll() + gc.die2.roll();
				gc.player1.SetPoints( gc.LoseOfPoints(gc.player1) );
				System.out.println("");
				System.out.println("player1 rolled " + gc.SumOfDice);
				System.out.println("player1's has " + gc.player1.GetPoints() + " points");
				gc.Winner = gc.WinState();
				gc.PlayerTurn = 2;
			}

			if(gc.PlayerTurn == 2){
				gc.SumOfDice = gc.die1.roll() + gc.die2.roll();
				gc.player2.SetPoints( gc.LoseOfPoints(gc.player2) );
				System.out.println("");
				System.out.println("player2 rullede " + gc.SumOfDice);
				System.out.println("player2 has this many pointes " + gc.player2.GetPoints());
				gc.Winner = gc.WinState();
				gc.PlayerTurn = 1;
			}
		}
	}

	private int WinState() {

		if (player1.GetPoints() >= 40){
			System.out.println("Player 1 has won the g!");
			return 1;
		}

		else if (player2.GetPoints() >= 40){
			System.out.println("Player 2 has won the g!");
			return 2;
		}
		else {
			return 0;
		}
	}


	private int LoseOfPoints(Player p) {

		if(SumOfDice == 2){
			return 0;
		}
		else {
			return p.GetPoints() + SumOfDice;		//	Kan det her lade sig gøre??. Ja det kan det :-)
		}


	}

	private int TwoOfAKind() {

		if (PlayerTurn == 1){
			if (die1 == die2 && SumOfDice > 2){

			}
		}

		return 0;
	}

}	