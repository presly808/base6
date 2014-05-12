package helpers;

public class StringHelper {
	
	public static int countA(String str){
		int counter = 0; // create counter for result
		for(int i = 0; i < str.length(); i++){ // loop 
			if(str.charAt(i) == 'a'){ //compare each symbol in str
				counter++; //increase counter
			}
		}
		return counter; //exit from method with counter
	}
	
}
