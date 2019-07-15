import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethod {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(5);
		a.add(8);
		a.add(10);
		a.add(3);
		List<Boolean> l = a.stream().map(s -> s % 2==0).collect(Collectors.toList());
	}

}
