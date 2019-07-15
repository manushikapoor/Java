import java.util.function.BiPredicate;

public class BinaryVersion {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> divisible =
		        (t, u) -> t % u == 0;
		if(divisible.test(10, 5)) 
			System.out.println("divisible");
			else
				System.out.println("not divisible");
		
		
	}

}
