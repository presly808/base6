
public class Ex2 {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		int b = 12;
		
		double res = ((a + b) / 12) * 2.0;
		
		String resultString = "((a + b) / 12) * 2.0 < 22";
		
		resultString = resultString + " " + (res < 22);
		
		System.out.println(resultString);
		
		boolean boolRes = ((a != b) && ((a * a / 2.0 > 80) || true));
		
		System.out.println(boolRes + " is your answer");
		

		// types casting
		int num1 = 78;
		double num2 = num1;
		
		int num3 = 133;
		byte num4 = (byte) num3;
		System.out.println("num4 = " + num4);
		
		
		
	}
}
