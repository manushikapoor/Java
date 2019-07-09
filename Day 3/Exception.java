import java.util.Scanner;
public class Exception
 {
    public static void main(String[] args) 
    {
		try 
		{
			Scanner s1=new Scanner(System.in);
			String name[]=new String[10];
			int rollno[]=new int[10];
			System.out.println("enter name and roll number of 10 students:");
			for(int i=0;i<10;i++)
			{
	            name[i]=s1.next();
	            rollno[i]=s1.nextInt();
			}
			System.out.println(name[12]);
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
 }
