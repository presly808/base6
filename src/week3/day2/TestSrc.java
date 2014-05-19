package week3.day2;

import java.util.Arrays;

public class TestSrc {

	public static void main(String[] args) {
		int[] mas = {56,233,457,45,23,57,23};
		int[] addMas = {56,233,6,45,23,57,23};
		
		int[][] mat = {{1,2,3} , {4,5,6}, {7,8,9}}; 
		
		String res = Arrays.toString(mas);
		
		System.out.println(res);
		
		String res1 = Arrays.deepToString(mat);
		System.out.println(res1);
		
		// Ctrl + LMouse
		System.out.println(Arrays.equals(mas, addMas));
		
		String s = "some";
		s.charAt(0);
		s.isEmpty();
		
	}

}
