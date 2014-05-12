package week2.day2;

public class FindMin {

	public static void main(String[] args) {
		int[] mas = {34,12,78,11,0,-5};
		
		int min = mas[0];
		
		for(int i = 0; i < mas.length; i++) {
			if(mas[i] < min){
				min = mas[i];
			}
		}
		
		//1
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
		
		System.out.println();
		System.out.println("min el in arr is " + min);

	}

}
