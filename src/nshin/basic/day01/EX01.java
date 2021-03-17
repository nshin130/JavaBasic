package nshin.basic.day01;
/**
 * 
 * 연습문제 실습
 *
 */
public class EX01 {
	public static void main(String[] args) {
		// 1.
		System.out.println("*   *    **    ****     ****    *   *      /////");
		System.out.println("*   *   *  *   *   *    *   *   *   *    │ o o │");
		System.out.println("*****  *    *  ****     ****     * *    (│  ^  │)");
		System.out.println("*   *  ******  *   *    *   *     *      │ [_] │");
		System.out.println("*   *  *    *  *    *   *    *    *        -----");
		System.out.println(""); //여백
		System.out.println("                 +---+");
		System.out.println("                │  │");
		System.out.println("             +---+---+");
		System.out.println("            │  │  │");
		System.out.println("         +---+---+---+        /\\__/\\      -----");
		System.out.println("        │  │  │  │       (  '  ' )   ／Hello＼");
		System.out.println("     +---+---+---+---+       (   -   )  ＜ Junior │");
		System.out.println("    │  │  │  │  │       │ │  │    ＼Coder!/");
		System.out.println("     +---+---+---+---+       (__│__ )      ------");
		
		
		//3.
		int rate1;
		//int 1stPlayer;			//숫자로 시작화면 안됨
		//int myprogram.java;		//사용가능 기호는 _,$
		//int long;					//java 예약어를 변수로 선언
		int TimeLimit;				//가능, 변수명은 소문자로 시작
		int numberOfWindows;
		
		
		//4.
		// 표현식: expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 수식과 유사
		// 표현식의 중요한 특싱은 평가(evaluate)임
		// 즉, 코드의 결과를 알아내는 과정을 의미
	
		int x, y, z, s, s0, v, t, g;	//변수선언
		int result;
		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		v = 10;
		t = 15;
		g = 20;
		
		result = 3 * x;			//3x
		System.out.print("3x = ");
		System.out.println(result);
		
		result = 3 * x + y;
		System.out.print("3x + y =");
		System.out.println(result);
		
		
		System.out.print("(x + y) / 7 =");
		System.out.println((x + y) / 7 );
		
		result = (3 * x + y) / (z + 2);
		System.out.print("(3 * x + y) / (z + 2) =");
		System.out.println(result);
		
		// result = s0 + v * t + 1/2 * g * t ^ 2;
		result = s0 + v * t +(1/2)* g * t ^ 2;
		System.out.print("s0 + v * t +(1/2)* g * t ^ 2 =");
		System.out.println(result);
		
		
		// 5.
		double number = ( 1 / 3 ) * 3;
		System.out.println(" ( 1 / 3 ) * 3 = " + number);	//위에 문제처럼 써도 되고 이렇게 표현가능
		// 예상값은 1 이지만 실제값은 0.0
		// 정수 나누기 정수의 결과값은 정수이기 때문
		
		int quotient = (7 / 3);
		System.out.println(" ( 7 / 3 )  = " + quotient);
		//정수 나누기 정수;변수 int
		// 예상값은 2.3333, 실제값은 2
		
		int remainder = ( 7 % 3 );
		System.out.println(" 7 % 3 = " + remainder);
		
		result = 11;
		result /= 2;
		System.out.println(" result /= 2 = " + result);
		// 복합대입연산자 
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// i.g. a = a + 1 / a += 1
		
		
		//6.
		double xx = 2.5;		//변수선언
		double yy = 1.5;
		int m = 18;
		int n = 4;
		
		double result2 = xx + n * yy - (xx + n ) * yy;			//왜 더블붙이는지?..
																//정수와 실수를 섞어서 계산할때, 서로 다른 숫자의 종류를 산수식에 썼을때 큰 거에 맞춰 변함(자동형 변
		System.out.println("xx + n * yy - (xx + n ) * yy = " + result2);
		
		result2= m / n + n + m % n;
		System.out.println("m / n + n + m % n =" + result2);
		
		result2= 5 * xx - n / 5;
		System.out.println("5 * xx - n / 5 =" + result2);
		
		result2= 1 - (1 - (1- (1 - (1 - n))));
		System.out.println("1 - (1 - (1- (1 - (1 - n)))) =" + result2);
		
		
		
		
		
	}
}

	
	