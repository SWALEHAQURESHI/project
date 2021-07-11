import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter length of the side = ");
		double side = scan.nextDouble();
		double area= side*side;
		System.out.println("the area of square :"+ area);

	}

}
