package helpers;

public class ArrayHelper {

	public static void printArr(int[] mas) {
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] genRanMas(int size){
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
	
}
