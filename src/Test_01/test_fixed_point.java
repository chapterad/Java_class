package Test_01;

public class test_fixed_point {

	public static void main(String[] args) {
		//부동 소수점 방식으로 실수를 표현할 때 발생할 수 있는 오차를 보여주는 예제
		double num = 0.1;
		
		for(int i =0; i< 1000; i++) {
			num = num+0.1;
		}
		System.out.println(num);
		// 자바의 실수형 탕입의 double형과 float형이 표현할 수 있는 정밀도를 보여주는 예제
		float num3 = 1.23456789f;
		double num4 = 1.23456789;
		
		System.out.println("float형 변수 num3 : " + num3);
		System.out.println("double형 변수 num4 : "+ num4);

	}

}
