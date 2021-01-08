package project5;
import java.util.Random;
public class T4 {
	public static void main(String[] args) {
		Random randpos = new Random(1000);
        System.out.println(String.format("%.0f",50 * randpos.nextDouble()));
	}
}
