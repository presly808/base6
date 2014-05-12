package week2.day1;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int num = sc.nextInt();

		int i = num - 1;
		boolean isSimple = true;
		while(i > 1 && isSimple){
			if(num % i == 0){
				isSimple = false;
			}
			i--;
		}
		
		System.out.println(num + " is simple?" + isSimple);

	}

}
