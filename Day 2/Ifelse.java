import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		if(n<10)  //if-else
			n++;
		else if(n==10)
			n=40;
		else
			n--;
		System.out.println(n);
		String msg= n>40? "result is greater than 40":"result is less than or equal to 40"; //ternary operator
		System.out.println(msg);
	}

}
