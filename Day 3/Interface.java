interface test{
	int square();
}
class arithmetic implements test{
	int a;
	arithmetic(int x){
		a=x;
	}
	public int square()
	{
		return (a*a);
	}
}
public class Interface {

	public static void main(String[] args) {
		arithmetic a=new arithmetic(4);
System.out.println(a.square());
	}

}
