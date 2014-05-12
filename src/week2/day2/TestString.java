package week2.day2;

public class TestString {

	public static void main(String[] args) {
		String s = "line 1 2 test";
		s.length();
		
		s.isEmpty();
		
		char c = s.charAt(3);
		
		String s1 = "soasd";
		String s2 = "some";
		if(s1.equals(s2)){
			System.out.println(s1 + " equals " + s2);
		} else {
			System.out.println(s1 + " not equal " + s2);
		}
		
		String andrey = "ANDREY".toLowerCase();
		System.out.println(andrey);

	}

}
