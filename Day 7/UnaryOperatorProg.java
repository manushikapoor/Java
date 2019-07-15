import java.util.function.UnaryOperator;

public class UnaryOperatorProg {

	public static void main(String[] args) {
		UnaryOperator<String> u = t -> t.substring(0,4);
		System.out.println(u.apply("manushi"));

	}

}
