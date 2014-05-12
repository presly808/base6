package week1;
import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		//Create scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("a*x + b*x*x + c");
		System.out.println("Input a");
		//get data from console
		int a = sc.nextInt();
		
		System.out.println("Input b");
		int b = sc.nextInt();
		
		System.out.println("Input c");
		int c = sc.nextInt();
		
		double d = b * b - 4 * a * c;
		//double x1 = 0;
		
		//check d and choose way
		if(d > 0){
			double x1 = (-b + Math.sqrt(d)) / 2 * a; 
			double x2 = (-b - Math.sqrt(d)) / 2 * a; 
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		} else if (d == 0){
			double x1 = (-b + Math.sqrt(d)) / 2 * a; 
			System.out.println(x1);
		} else {
			System.out.println("No answer");			
		}
		
		
	}
	
	
}
