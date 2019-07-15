import java.util.*;
import java.util.function.IntPredicate;
public class IntPredicateProg {

	public static void main(String[] args) {
		IntPredicate even = t -> t % 2 == 1;
		boolean result = even.test(5);
		if(result) 
			System.out.println("odd number");
			else
				System.out.println("even number");
		
	}

}
