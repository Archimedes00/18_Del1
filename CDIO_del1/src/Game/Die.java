package Game;

public class Die {  // test om github virker. gør det? 12/10?

	public int roll() { //opretter metode roll
		return (int) (Math.random() * 6+1) ; //returnere random tal mellem 0.0 og 1.0 * 6 + 1
	}
}
