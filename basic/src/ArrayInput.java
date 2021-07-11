import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		int[]array=new int [5];
		int sum =0;
		System.out.println(" enter the elements ");
		for (int i=1; i<5; i++)
				array[i]= scan.nextInt();
				

	for (int num:array) {
		sum=sum+num;
		System.out.println(" sum of array element :"+ sum );
	}
	}
}
	

	
	

