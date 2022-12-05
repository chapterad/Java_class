package Test_01;

public class test_variable {

	public static void main(String[] args) {
		int num;                 // 변수의 선언
		//System.out.println(num);  오류 발생
		num = 20;                // 변수의 초기화\
		System.out.println(num); // 20
		
		int num1, num2;     // 같은 타입의 변수를 통시에 선언.
		double num3 = 3.14; // 선언과 동시에 초기화
		double num4 = 1.23 , num5 = 4.56; // 같은 타입의 변수를 동시에 선언하면서 초기화
		
		System.out.println(num3 +" "+num4 + " "+num5);
		
	}

}
