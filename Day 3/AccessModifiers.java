class A{
	private int a=10;
	protected int b=12;
	public int c=15;
	protected void msg()
	{
		System.out.println("Hello java");
	}
}
class B{
	A a2=new A();
	public void print() {
		System.out.println(a2.c);
		System.out.println(a2.a); //private
		System.out.println(a2.b);
	}
}
public class AccessModifiers extends A {

	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.a); //compile time error since a is private
		System.out.println(a1.b); 
		a1.msg();
	}

}
