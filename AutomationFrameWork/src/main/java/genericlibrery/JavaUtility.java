package genericlibrery;
/**
 * @Kiran
 */
import java.util.Random;
/**
 * This method is used to Generate a random numbers
 */
public class JavaUtility {
	public int getRandomNumber(int range) {

		Random r=new Random();
		return r.nextInt(range);

	}

}
