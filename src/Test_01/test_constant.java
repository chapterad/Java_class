package Test_01;

public class test_constant {

	public static void main(String[] args) {
		/* 상수(constant)
		 	상수란 변수와 마찬가지로 데이터를 저장할 수 있는 메모리 공간을 의미합니다.
		 	하지만 상수가 변수와 다른 점은 프로그램이 실행되는 동안 메모리에 저장된
		 	데이터를 변경할 수 없다는 점 입니다.
		 	
		 	상수는 변수와 마찬가지로 이름을 가지고 있는 메모리 공간으로, 이러한 상수는
		 	선언과 동시에 반드시 초기화해야 합니다.
		*/
		
		// 리터널(literal)
		// 리터널이란 그 자체로 값을 의미하는 것입니다.
		// 즉 변수와 상수와는 달리 데이터가 저장된 메모리 공간을 가리키는 이름을 가지고 있지 않습니다.
	
		final int AGES = 1000; // 100이 바로 리터널
		int var = 30;		   //  30이 바로 리터널
		
		System.out.println(AGES + " " + var);

	}

}
