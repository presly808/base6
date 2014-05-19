package helpers;

import java.util.Scanner;

public class ArrayHelper {

	public static void printArr(int[] mas) {
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] genRanM(int size){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			mas[i] = (int)(Math.random() * 100);
		}
		return mas;
	}
	//98 12 20 10 -5
	
	public static int findMin(int[] mas){
		int min = mas[0];
		for(int i = 0; i < mas.length; i++){
			if(mas[i] < min){
				min = mas[i];
			}
		}
		return min;
	}
	
	public static int[] genMasWithCond(int size){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			int ran = (int)(Math.random() * 100);
			
			mas[i] = i % 2 == 0 ? 
						(ran % 2 == 0 ? ran : ran +1 ) : 
							(ran % 2 == 1 ? ran : ran + 1); 
			
			if(i % 2 == 0){
				if(ran % 2 == 0){
					mas[i] = ran;
				} else {
					mas[i] = ran + 1;
				}
			} else {
				if(ran % 2 == 1){
					mas[i] = ran;
				} else {
					mas[i] = ran + 1;
				}
			}
				
		}
		return mas;
		
	}
	
	public static int[] inputMas(){
		Scanner sc = new Scanner(System.in);
		System.out.println("input array size");
		int size = sc.nextInt();
		
		int[] mas = new int[size];
		
		for(int i = 0; i < mas.length; i++){
			System.out.println("input " + (i+1) + " element");
			mas[i] = sc.nextInt();
		}
		
		return mas;
		
	}
	
}
