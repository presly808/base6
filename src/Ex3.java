import java.util.Scanner;

//Shift + Ctrl + F  code format
public class Ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int hour = sc.nextInt();

		if (hour < 8 && hour > 2) {
			System.out.println("I'm sleeping");
		} else if (hour == 12) {
			System.out.println("Dinner time");
		} else if (hour == 15) {
			if (hour % 2 == 1) {
				if (hour * 2 != 29) {
					System.out.println("Inner if block");
				}
			}
			System.out.println("Football");
		} else {
			System.out.println("another hour");
		}
		
		hour++; // hour = hour + 1; 
		hour--; // hour = hour - 1;
		hour += 25; //hour = hour + 25;

	}

}
