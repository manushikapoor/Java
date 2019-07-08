import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		int i[]; //declaration of array
		i=new int[10]; //allocating memory of size 10
		System.out.println("enter 10 elements");
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<i.length;j++) {
			i[j]=sc.nextInt(); //initializing the array
		}
		for(int j=0;j<10;j++) {
			if(i[j]==10)  //using the array
				i[j]+=5;
		}
		for(int j=0;j<10;j++) {
		System.out.println(i[j]);
		}
		
		int a[][]= {{1,2,3,4,5},{2,3,4,5,6},{5,6,7,8,9}}; //multidimentional array
		for( int q=0;q<3;q++) {
			for(int k=0;k<5;k++) {
				System.out.println(a[q][k]);
			}
		}
	}

}