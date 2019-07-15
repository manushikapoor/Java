import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalClass {

	public static void main(String[] args) {
		OptionalInt max = IntStream.of(4,87,3,5,22).max();
		OptionalDouble avg = IntStream.of(34,77,45,22,6,7).average();
		System.out.println("max is :" + max);
		System.out.println("Average is :" + avg);
	}

}
