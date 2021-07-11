import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner (System.in);
		System.out.println("enter the lenght of rectangle ");
		double lenght = scan. nextDouble();
		System.out.println("enter the width of rectangle");
		double width= scan. nextDouble();
		double area= lenght*width;
		System.out.println("Area of rectangle:"+area);
		
		
		
	}

}
