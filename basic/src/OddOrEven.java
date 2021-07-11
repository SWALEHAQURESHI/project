import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println( " enter the number");
		num = scan.nextInt();
		if(num % 2==0) {	
			System.out.println("entered number is even");
		}
		else {
		System.out.println("entered number is odd");
		}
	
		
	}

}
