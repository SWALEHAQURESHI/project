
public class Largestno {
public static void main(String[] args) {
	double n1 = 45, n2=65, n3 = 22;
	
	if(n1>=n2 && n1>=n3) {
		System.out.println(n1 + "is a prime number");
	}
	
	else if (n2>=n1 && n2>=n3)
		System.out.println(n2 + " is the largest number");
	
	else 
		System.out.println(n3 + " is the largest number");
	
	}
}