import java.util.Scanner;

public class Whileloop {

public static void main(String[] args) {
	

	int num , sum = 0;	
	Scanner scan = new Scanner(System.in);
	System.out.println(" please enter a value below 10");
	
	 num = scan.nextInt();
	
	 while ( num<=10){
	sum = sum + num ;
	num++;
	System.out.println( "sum of the numbers from the while loop is :"+ sum);
	
	 }

}

}