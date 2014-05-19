package examples;

import java.util.Arrays;

public class Ex11 {
	// a -> b
	// 56, 23,12 ,45 ,12    1 , 3  => 23,12
	
	// 56, 23, 12 , 45 ,12    
	// 23, 23  X
	
	// int[] mas, int st, int end
	public static int[] splitByInd(int[] mas, int start, int end){
		int[] res = new int[end - start + 1]; 
		
		for(int i = start , j = 0; i <= end; i++, j++){
			res[j] = mas[i];
		}

		return res;
	}  
	
	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6,7,8}; 
		
		int[] arr = splitByInd(mas, 2, 5); 
		
		System.out.println(Arrays.toString(arr));
	}
	
}
