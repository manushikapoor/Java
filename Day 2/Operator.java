public class Operator {

	public static void main(String[] args) {
		int i=10;
		System.out.println(++i + i /5 - 3); //10
		i=10;
		System.out.println(++i + i / (5-3)); //16
		i=10;
		System.out.println((++i + i) / 5 - 3); //1
	}

}