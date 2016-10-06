package Game;

public class Dicecup 
{
	Die die1=new Die();
	Die die2=new Die();
	
	private int sumOfDice;
	
	public void TwoOfAKind()//accesstype public, datatype int, name of method
	{ 
		Player p1=new Player();
		int one = die1.roll();
		int two = die2.roll();
		
		System.out.println("rolled: " + one + " " + "rolled: " + two);
		
		if(one==1 && two==1)
		{
			sumOfDice = 0; //Returns points to player
		}
		else if(one!=1 && two!=1 && one!=6 && two!=6 && one==two)
		{
			if(p1.GetTurn()==1)
			{
				p1.SetTurn(1);
			}
			else 
			{
				p1.SetTurn(2);
			}
			sumOfDice+=(one+two);
		}
		else if(one==6 && two==6)
		{
			sumOfDice+=(one+two);

			if(one == die1.roll() && two == die2.roll())
			{
				sumOfDice= 40;
			}
		}
		else
		{
			sumOfDice+=(one + two);
		}
	}
	
	public int GetSum()
	{
		return sumOfDice;
	}
}
