package Test;
//import static org.junit.Assert.*;

//import org.junit.Test;

import Game.Die;

public class DieTest {

	//@Test
	public void test() {

		Die d1 = new Die();

		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		int c5 = 0;
		int c6 = 0;

		for(int i = 0; i <= 1000; i++)
		{

			switch (d1.roll())
			{


			case 1:
				c1++;
				break;

			case 2:
				c2++;
				break;

			case 3:
				c3++;
				break;

			case 4:
				c4++;
				break;

			case 5:
				c5++;
				break;

			case 6:
				c6++;
				break;


			}



		}

		System.out.println("count of 1 eyes: " +c1);
		System.out.println("count of 2 eyes: " +c2);
		System.out.println("count of 3 eyes: " +c3);
		System.out.println("count of 4 eyes: " +c4);
		System.out.println("count of 5 eyes: " +c5);
		System.out.println("count of 6 eyes: " +c6);
	}



}


