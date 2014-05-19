package helpers;

import java.util.Arrays;
 

// 12   22   33   4111
// 1    2    3    4
// 222  345  23   23   
public class MatrixHelper {
	
	public static void printMat(int[][] mat){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				System.out.print(mat[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static int[][] genMatRand(int rowSize, int columnSize){
		int[][] mat = new int[rowSize][columnSize];
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = (int)(Math.random() * 100);
			}
		}
		return mat;
	}
	
	public static int[][] changeMinMax(int[][] mat){
		int minI = 0, minJ = 0;
		int maxI = 0, maxJ = 0;
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				if(mat[minI][minJ] > mat[i][j]){
					minI = i; minJ = j;
				}
				
				if(mat[maxI][maxJ] < mat[i][j]){
					maxI = i; maxJ = j;
				}
			}
		}

		return switchCeils(mat, minI, minJ, maxI, maxJ);
	}
	
	public static int[][] switchCeils(int[][] mat, int aI, int aJ, 
													int bI, int bJ){
		int temp = mat[aI][aJ];
		mat[aI][aJ] = mat[bI][bJ];
		mat[bI][bJ] = temp;
		
		return mat;
	}
	
}
