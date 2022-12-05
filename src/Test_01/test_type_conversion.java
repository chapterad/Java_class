package Test_01;

public class test_type_conversion {

	public static void main(String[] args) {
		double num1 = 10;
		// int num = 3.14;
		double num2 = 7.0f + 3.14;
		
		System.out.println(num1);
		System.out.println(num2);
		
//		byte num3 = 100; // ok
//		byte num4 = 200; // type mismatch
//		int num5 = 98765643210; out of range
//		long num6 = 9876543210; out of range
//		float num7 = 3.14; type mismatch 
		
		long num3 = 9876543210L;
		System.out.println(num3);
		// 강제 타입 변환
		
		int a = 1, b = 4;
		
		double result1 = a/b;
		double result2 = (double) a/b;
		
		System.out.println(result1);
		System.out.println(result2);
	}

}
