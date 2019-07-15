import java.util.Comparator;
import java.util.stream.Stream;

public class Sort {

	public static void main(String[] args) {
		Comparator<String> byLength = (s1, s2) -> Integer.compare( s1.length(), s2.length());

		Stream.of("MY","name", "is", "manushi", "kapoor")
		          .sorted(byLength)
		          .forEach(s -> System.out.println(s)); 

	}

}
