package nshin.basic.day03;

public class Operators {
	public static void main(String[] args) {
		//개발자용 폰트
		//개발자의 취향에 따라 합자(ligatures)를
		//지원하는 폰트 사용여부 
		//이것을 사용함에 따라 수학기호를 따로 표시하든지
		//붙여서 사용하든지 결정할 수 있음
		//fonts recommendations: d2coding, cascadia
		
		
		//연산자 Operator
		//여러 종류의 연산을 수행하기 위해 제공되는 기호
		//산술연산, 비교연산, 논리연산, 조건연산
		
		//산술연산: 사칙연산을 다루는 연산자
		//		  + - / * %
		
		int x = 30, y = 15; //변수선언과 값 초기화를 같이 수	
							//같은종류의 변수일 경우 한 줄에 같이써도
		System.out.println("30 + 15 연산 " + (x + y));
		System.out.println("30 - 15 연산 " + (x - y));
		System.out.println("30 × 15 연산 " + (x * y));
		System.out.println("30 ÷ 15 연산 " + (x / y));
		System.out.println("30 mod 15 연산 " + (x % y));
		
		//비교연산: 값의 상대적인 크기를 판단
		//왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교
		//논리연산의 결과는 논리값(참, 거짓)으로 반
		
		System.out.println("30 > 15" + (x > y));
		System.out.println("30 < 15" + (x < y));
		System.out.println("30 ≤ 15" + (x <= y));
		System.out.println("30 ≥ 15" + (x >= y));
		System.out.println("30 ≠ 15" + (x != y));
		System.out.println("30 = 15" + (x == y));
		
		//논리연산자: 주어진 논리식을 판단
		//and or not
		//논리연산의 결과는 논리값(참, 거짓)으로 반환
		//보통 2개 이상의 비교연산식으로 구성됨
		//논리곱연산 and: &, &&(short-circuit지원)
		//논리합연산: |, ||
		//논리부정연산: !
		
		//단축식 평가 short-circuit
		//여러개의 논리식중에서 어떤 식에 의해 참거짓이 확정되면
		//나머지 논리식을 평가하지 않음
		
		boolean result = (x > y) & (x != y);
		System.out.println("(x > y) and (x != y)" + result);
		
		//조건연산자(삼항연산자)
		//3개의 피연산자를 이용해서 조건에 따라 
		//특정 피연산자를 취하도록 사용하는 특수한 연산자
		//형식: 조건식 ? 참일때 값 : 거짓일때 
		String result2 = (x > y) ? "x가 큽니다" : "y가 큽니다";
		System.out.println(result2);
		
		
			
		
		
					
		
	}
}
