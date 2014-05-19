package week3.day2;

public class Recursion {
	
	public static int fact(int num){
		if(num < 2){
			return 1;
		}
		int returnedNum = fact(num - 1);
		return num * returnedNum;
	}
	
	public static void main(String[] args) {
		printSome();
	}
	
	public static void printSome(){
		System.out.println("Some");
	}
	
}
