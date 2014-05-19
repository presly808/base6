package week3.day1;

import helpers.MatrixHelper;

public class TestMatrix {

	public static void main(String[] args) {
		int[][] mat = {	{1,2,3,5,6},
						{4,5,6},
						{1,2}
					};

		int[][] res = MatrixHelper.genMatRand(10, 10);
		MatrixHelper.printMat(res);
		

	}

}
