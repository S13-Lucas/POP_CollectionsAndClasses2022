import java.awt.*;
import java.util.Random;

/**
 * craps class; holds rollX and rollY attributes
 */
public class Craps {

    public static Dice diceX = new Dice(); // instantiating new dice objects
    public static Dice diceY = new Dice();
	//Task 1
	public void shoot() {
      diceX.roll();
	  diceY.roll();

    }


	//Task 1
	public Dice getDice1() {
		return diceX;
	}
	//Task 1
	public Dice getDice2() {
		return diceY;
	}


	//Task 2
	public int addUpScore() {
	   return	diceX.getFaceValue() + diceY.getFaceValue();

	}


	//Task 3
	public String decideOutcome(int total) {
		String out = "";

		if (total == 7 || total == 11) {
			out = "You win";
		} else if (total == 2 || total == 3 || total == 12) {
			out = "You lose";
		} else {
			out = "Throw again";
		}
		return out;
	}


	//Task 4 - No UNIT TEST FOR THIS ONE - Check the output
	public String getResults() {
		String d1 = "Dice 1 is " + getDice1() + "\n";
		String d2 = "Dice 2 is " + getDice2() + "\n";
		String total = "Total is: " + addUpScore() + "\n";
		String winner = "Result is " + decideOutcome(addUpScore());

		return d1 + d2 + total + winner;
	}


	//Task 5 - No UNIT TEST FOR THIS ONE - Check the output
	public String playCraps() {
		String resultLog = "";

		while(decideOutcome(addUpScore()).equalsIgnoreCase("Throw again")) {
			shoot();
			resultLog += ("Dice one before two: " + diceX.getFaceValue() + "\n");
			resultLog += getResults();

			resultLog += "\n*************************\n";
		}
		return resultLog;
	}


	/*Task 6 Additional tasks - OPTIONAL AND NOT ASSESSED
	Can you add a method that asks the user if they want to play again?
	public ?? playAgain(??){

	}*/
}
