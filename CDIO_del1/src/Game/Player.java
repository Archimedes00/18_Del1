package Game;
public class Player 
{
	private static int playerTurn = 1;
	private int points = 0;
	
	public void SetTurn(int value)
	{
		playerTurn = value;
	}
	
	public int GetTurn()
	{
		return playerTurn;
	}
	
	public void SetPoints(int value)
	{
		points = value;
	}
	
	public int GetPoints()
	{
		return points;
	}
	
	public boolean isWinner()
	{
		if (points >= 40) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
