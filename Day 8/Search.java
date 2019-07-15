import java.util.Optional;
import java.util.stream.Stream;

public class Search {

	public static void main(String[] args) {
		Optional<Integer> first = Stream.of(1, 10, 5, 3, 13, 20).filter(i -> i % 2 == 0).findFirst(); //returns 10
		Optional<Integer> any = Stream.of(1, 10, 5, 3, 13, 20).filter(i -> i % 2 == 0).findAny(); //return 10 or 20
		boolean any2 = Stream.of(1, 10, 5, 3, 13, 20).anyMatch(i -> i % 3 == 0); //returns true
		boolean all = Stream.of(1, 10, 5, 3, 13, 20).allMatch(i -> i % 2 == 0); //returns false
		boolean none = Stream.of(1, 10, 5, 3, 13, 20).noneMatch(i -> i % 6 == 0); //returns true

	}

}
