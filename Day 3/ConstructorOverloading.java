class area{
	
	int side;	
	int length;
	int breadth;
 
 	public area(int s)// 1st constructor
	{
		side=s;
	}
	public area(int l,int b)// 2nd constructor
	{
		length=l;
		breadth=b;
	}
 
	int square_area()
	{
		return side*side;
	}
	int rectangle_area()
	{
		return length*breadth;
	}
}
class ConstructorOverloading
{
	public static void main(String args[])
	{
		area Square=new area(5); //object creation according to 1st constructor
         area Rectangle=new area(4,6);   // according to 2nd constructor 		
	
        System.out.println("area of square="+ Square.square_area());
        System.out.println("area of rectangle="+Rectangle.rectangle_area());
     }
}
 

