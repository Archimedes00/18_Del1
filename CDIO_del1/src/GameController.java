
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

		if (PlayerTurn == 1){
			SumOfDice = gc.die1.Roll() + gc.die2.Roll();
			player1.SetPoints( gc.LoseOfPoints() );
			Winner = gc.WinState();
		}

		if(PlayerTurn == 2){
			SumOfDice = gc.die1.Roll() + gc.die2.Roll();
			player2.SetPoints( gc.LoseOfPoints() );
			Winner = gc.WinState();
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


	private int LoseOfPoints() {

		if(PlayerTurn == 1){

			if(SumOfDice == 2){
				return 0;
			}
			else {
				return player1.GetPoints();
			}
		}
		else if(PlayerTurn == 2){

			if(SumOfDice == 2){
				return 0;
			}
			else {
				return player2.GetPoints();
			}
		}
		else {
			return 0;
		}
	}
}	