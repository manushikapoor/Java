import java.util.*;
class Student{
	int rollno;
	String name;
	Student(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		 
        return "roll number: "+ rollno + " name: "+ name;
    }
}
public class ArrayListProg {

	public static void main(String[] args) {
		Student q=new Student(34,"manushi");
		Student w=new Student(31,"varini");
		Student e=new Student(65,"garima");
		Student r=new Student(120,"ishita");
		Student t=new Student(140,"anchal");
		ArrayList<Student> a=new ArrayList<Student>();
		a.add(q);
		a.add(w);
		a.add(e);
		a.add(r);
		a.add(t);
		ListIterator<Student> i=a.listIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("reverse order : ");
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

	}

}
