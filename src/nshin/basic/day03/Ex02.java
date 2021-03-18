package nshin.basic.day03;

public class Ex02 {
	public static void main(String[] args) {
		//7
		//가
		//예상값: 15
		//int x=3, z=2, m=27, n=8;
		//double y=4.5;
		//System.out.println("3 + 4.5 * 2 + 27 / 8 연산은" + (x + y * z + m / n));
		System.out.println(3 + 4.5 * 2 + 27 / 8);
		
		//나
		//예상값:true
		//true || false && 3 < 4 || !(5==7)
		System.out.println(true || false && 3 < 4 || !(5==7));
		
		//다
		//예상값:true
		System.out.println(true || (3 < 5 &&6 >= 2));
		
		//라
		//예상값: 잘못된 비교대상으로 오류
		//System.out.println(!true > 'A');	
		
		//마
		//예상값: 오류 출력값: 6
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		//단일문자를 수식에 사용하면 자동으로 숫자형으로 바뀜
		//숫자형으로 변환시 ASCII 코드값을 참조
		//0 : 48, A : 65, a : 97
		// => Z : 9, D : 68, M :77
	
		
		//바
		//예상값: 오류 출력값:69
		System.out.println('D' + 1 + 'M' % 2 / 3);
		
		//사
		//예상값: 2.7
		System.out.println(5.0 / 3 + 3 / 3);
		
		//아
		//예상값:false
		System.out.println(53 % 21 < 45 / 18);
		
		//자
		//예상값: true
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		
		//차
		//예상값: -59
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		
		//8
		//가
		//true
		System.out.print("May 13, 2020 fell on day number ");
		
		//나
		//5 
		//특정연도-1의 12월 31일 요일 출력 수식
		//0: 일요일 1:월요일 ...
		//따라서 특정연도의 1월1일의 요일을 출력하려면 
		//계산식 결과에 +1을 해주면 
		System.out.println(((13 + (13 * 3 - 1) / 5 + 2020 % 100 + 2020 % 100 / 4 + 2020 / 400 - 2 * (2020 / 100)) % 7 + 7) % 7);
		
		//다 
		System.out.print("Check out this line");
		
		//라
		System.out.println(" //hello there " + '9' + 7); //9랑 7 차이.
		
		//마
		System.out.print('H' + 'I' + "is" + 1 + "more example "
				+ "");
		//H and I 산술연산자로 인해 숫자형으로 변환되어 +연산이 수행됨
		//72+73; ASCII
		
		//바
		System.out.print('H' + 6.5 + 'I' + "more example ");
		
		//사
		//System.out.print("Print both of us","Me too");
		System.out.print("Print both of us" + " Me too ");
		
		//아
		System.out.print("Reverse" + 'I' + 'T');
		
		//자
		System.out.print("No! Here is " + 1 + "more example ");
		
		//차
		//System.out.println("Here is" + 10 * 10 )) // that's 100;
		System.out.println("Here is " + 10 * 10); // that's 100;
		
		//카
		System.out.println("Not x is " + true); // that's true;
		
		//타
		//System.out.print();
		//System.out.print( );
		
		//파
		//System.out.println;
		
		//하
		//System.out.print("How about this one" ++ '?' + 'huh?');
		
		//9.
		//가
		//System.out.print(true && false && true || true);
		
		
		
		
		
		
		
		
	}
}
