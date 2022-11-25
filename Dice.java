import java.util.Random;

/**
 * Dice class
 * holds faceValue attribute and roll method
 */
public class Dice {
    private int faceValue;

	/**
	 * roll method that 'rolls' a random dice number
	 */
	//Task 1
	public void roll() {
		Random rand = new Random();
		faceValue = rand.nextInt(6) + 1;


    }

	//Task 1 - second bit
	public int getFaceValue() {

		return faceValue;
	}


	//Task 2
	public String toString() {

		return Integer.toString(faceValue);
	}


}
