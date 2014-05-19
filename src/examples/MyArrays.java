package examples;

import java.util.Arrays;

public class MyArrays {
	
	public static int[] shift(int[] mas, int pos){
		int[] arr = new int[mas.length];
		int rightPos = mas.length - 1 - pos;
		
		for(int i = 0; i < mas.length; i++){
			arr[i%rightPos] = mas[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(shift(mas, 2)));
	}
	
}
