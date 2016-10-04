
public class GameController {

	static int SumOfDice = 0;				// kommer fra Player-klasse
	static int PlayerTurn = 1;				// kommer fra min egen klasse
	static int Winner = 0; 

	static Player player1 = new Player();
	static Player player2 = new Player();
	Die die1 = new Die();
	Die die2 = new Die();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameController gc = new GameController();

		while(gc.WinState() == 0){

			if (PlayerTurn == 1){
				SumOfDice = gc.die1.Roll() + gc.die2.Roll();
				player1.SetPoints( gc.LoseOfPoints(player1) );
				System.out.println("");
				System.out.println("player1 rolled " + SumOfDice);
				System.out.println("player1's has " + player1.GetPoints() + " points");
				Winner = gc.WinState();
				PlayerTurn = 2;
			}

			if(PlayerTurn == 2){
				SumOfDice = gc.die1.Roll() + gc.die2.Roll();
				player2.SetPoints( gc.LoseOfPoints(player2) );
				System.out.println("");
				System.out.println("player2 rullede " + SumOfDice);
				System.out.println("player2 has this many pointes " + player2.GetPoints());
				Winner = gc.WinState();
				PlayerTurn = 1;
			}
		}
	}

	private int WinState() {

		if (player1.GetPoints() >= 40){
			System.out.println("Player 1 has won the g!");
			return 1;
		}

		else if (player2.GetPoints() >= 40){
			System.out.println("Lol.dk player 2 has won the g!");
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
			return p.GetPoints() + SumOfDice;		//	Kan det her lade sig gøre?? 
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