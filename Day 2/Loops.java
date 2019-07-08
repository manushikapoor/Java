import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose : \n 1. For loop \n  2.While loop \n 3.do while loop ");
		int n=sc.nextInt();
		switch(n) {
		case 1:
	        int num = 5;
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.println(num+"*"+i+"="+num*i);
	        }
	        break;
		
		case 2:
	        int num1 = 10, i = 1;
	        while(i <= 10)
	        {
	            System.out.println(num1+"*"+i+"="+num1*i);
	            i++;
	        }
	        break;
		case 3:
			int num2=4 , j= 1;
			do {
				System.out.println(num2+"*"+j+"="+num2*j);
				j++;
			}while(j<11);
			break;
			
		default :
			System.out.println("wrong input");
			
			}
		
		}

	}


