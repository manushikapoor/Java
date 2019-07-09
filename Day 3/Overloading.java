class Sum{
	public int add(int a) {
		return a+10;
	}
	public int add(int x,int y) {
		return x+y;
	}
}
public class Overloading {

	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.add(6)); //add method with single parameter is called
		System.out.println(s.add(7,8)); //add method with 2 parameters is called
	}

}
