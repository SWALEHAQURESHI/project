import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the width of triangle ");
		double width = scan.nextDouble();
		
		System.out.println("enter the heiaght of triangle ");
		double height= scan.nextDouble();
		
		double area= width * height /2;
		System.out.println(" the area of triangle:"+ area);
		
		
	}

}
