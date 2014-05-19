package week3.day2;

import java.util.Scanner;

public class SeaFight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter field size");
		int fieldSize = input.nextInt();
		int[][] field = genField(fieldSize);
		int tarI = (int) (Math.random() * fieldSize);
		int tarJ = (int) (Math.random() * fieldSize);

		while (!shoot(field, tarI, tarJ)) { // while (! (true)) == while(false)
			System.out.println("ne popal");
		}

	}

	public static boolean shoot(int[][] field, int targetI, int targetJ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter I");

		int enteredI = sc.nextInt();
		System.out.println("Enter J");
		int enteredJ = sc.nextInt();
		// check rows
		if (enteredI < targetI) {
			System.out.println("go down");
		} else if (enteredI > targetI) {
			System.out.println("go up");
		}
		// check columns
		if (enteredJ < targetJ) {
			System.out.println("go rigth");
		} else if (enteredJ > targetJ) {
			System.out.println("go left");
		}
		if (enteredI == targetI && enteredJ == targetJ) {
			System.out.println("Congratulations");
			return true;
		}
		return false;
	}

	public static int[][] genField(int fieldSize) {
		// int[][] field = new int[fieldSize][fieldSize];
		// return field;
		return new int[fieldSize][fieldSize];
	}

}