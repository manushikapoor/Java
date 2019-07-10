
public class Overriding {

	public static void main(String[] args) {
		AreaSquare s=new AreaSquare();
		AreaRectangle r=new AreaRectangle();
		s.area(); //runs area method in AreaSquare class
		r.area(); //runs area method in AreaRectangle class
	}

}
class AreaSquare{
	public void area() {
		System.out.println("square's area can be calculated by - side*side");
	}
}
class AreaRectangle{
	public void area() {
		System.out.println("rectangle's area can be calculated by - length*breadth");
	}
}