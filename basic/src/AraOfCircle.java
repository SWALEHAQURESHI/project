import java.util.Scanner;

public class AraOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the radius of circle ");
		double radius= scan.nextDouble();
		
		double area =Math.PI* (radius* radius);
		System.out.println( " the area of circle :"+ area);
		double circumference=Math.PI* 2*radius ;
		System.out.println("the circumference of circle :"+ circumference );
		
	}

}
