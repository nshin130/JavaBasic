package nshin.basic.day03;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		//반복문 loop
		//프로그램 내에서 똑같은 명령을 지정한 횟수만큼 
		//반복하여 수행하도록 작성하는 명령문
		//사용빈도가 높은 명령어들 중 하나
		//for(횟수지정 후 반복) while(조건을 만족할떄까지 반복)
		
		//인사말 출력 v1- 한번만 출력
		System.out.println("Hello, World!!");
		
		//인사말 출력 v2- 세번만 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		
		//인사말 출력 v2.5 - 5번 출력
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		System.out.println("Hello, World!!");
		
		//인사말 출력 v3 - 대상변경후 5번 출력 
		System.out.println("Hello, java!!");
		System.out.println("Hello, java!!");
		System.out.println("Hello, java!!");
		System.out.println("Hello, java!!");
		System.out.println("Hello, java!!");
		
		//반복횟수에 따라 코드를 복붙하기에 번거롭고
		//반복하는 내용이 바뀌면 수정하기도 번거롭고 귀찮음
		
		// for문
		// 초기식, 조건식, 증감식을 이용해서 특정코드를
		// 지정한 횟수만큼 반복하도록 작성하는 명령문
		// for ( 초기식;조건식;증감식) {
		//		 반복할 코드
		// }
		// i.g. 1 ~ 10 까지 정수출력 v1- 반복문 사용 x
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		// i.g. 1 ~ 10 까지 정수출력 v2- 반복문 사용 ㅇ
		//for(int i = 1; i <= 10; i+=1) {
		for(int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}
		
		// i.g. 1 ~ 50 사이 홀수 출력
		for(int i = 1; i <= 50; i=i+2) {
			System.out.print(i + "");
		}
		
		 System.out.println(" ");
		
		
		// i.g. 1 ~ 50 사이 짝수 출력
		 for(int i = 2; i <= 50; i=i+2) {
			 System.out.print(i+""); 	// 왜 ""?
		 }
		
		 System.out.println(" ");
		 
		 //i.g. 1 ~ 100 사이 총합 구해서 출력 v1
		 int sum = 0;
		 for(int i = 1; i <= 100; ++i) {
			 sum = sum + i;
			 System.out.println("1 ~ 100 사이 합: " + sum);
			 
		 }
		 
		 //i.g. 1 ~ 100 사이 총합 구해서 출력 v2
		 //가우스 덧셈공식 이용 
		 int gauss;
		 int n;
		 Scanner sc = new Scanner(System.in);
		 gauss = sc.nextInt(); //스캐너 쓰는 이유는 한가지 값을 입력하면 그것에 대한 값을 한번에 구하기 위해 여러번 안돌리고
		 System.out.println("총합은" + gauss + "입니다.");
		 
		 
		 //Scanner sc = new Scanner(System.in);
		 //n= sc.nextInt();
		 
		 //gauss = (1+n) * n / 2;
		 
		//System.out.println("입력한 수의 총합은: " + gauss + "입니다.");
		 
	}
	
}

	

