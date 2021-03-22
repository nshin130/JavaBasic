package nshin.basic.day05;

import java.util.Scanner;

public class Switches {

	public static void main(String[] args) {
		//switch
		//둘이상의 조건의 결과값에 따라 명령문을
		//선택적으로 실행하도록 작성하는 제어문
		//switch(상수) { //상수는 반드시 정수여야함
		//	case 상수1: 실행문1; break;
		//	case 상수2: 실행문2; break;
		//	case 상수3: 실행문3; break;
		//  default: 실행문4;
		// }
		
		//현재 시간으로 시간을 의미하는 단어를 출력하는 프로그램
		// morning hours          아침시간 (7-12)  
		// midday / noon          점심시간 (12-1)
		// afternoon hours        오후 (1-6)
		// evening hours          저녁시간 (6-9)
		// night hours            밤시간 (9-12)
		// midnight               자정시간 (12)
		// early morning hours    새벽시간 (12-5)
		// small hours            새벽 (1-3)
		// dawn / daybreak        해뜰력 (5-7)
		
		int daytime; 
		String result = "";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("시간을 입력하세요 ");
		daytime = sc.nextInt();
		
		//if (daytime >= 7 && daytime <= 12)
		//	result = "morning hours";
		//else if (daytime >= 12 && daytime < 1)
		//	result = "noon";
	    // ...
		// 조건이 많은 경우 if ~ else는 다소 복잡해짐
		
		switch(daytime) { 		//스위치 안에무조건 정수형이여함 jdk8버전은 문자 가능 옛날버전은 무조건 상수만 가능
			case 7: case 8: case 9: case 10: case 11:
				result = "morning hours"; break;
				
			case 12: case 13:
				result = "noon"; break;
			
			case 14: case 15: case 16: case 17:
				result = "afternoon hours"; break;
				
			case 18: case 19: case 20:
				result = "evening hours"; break;
				
			case 21: case 22: case 23:
				result = "night hours"; break;
				
			case 24: 
				result = "midnight"; break;
				
			case 1: case 2: case 3: case 4:
				result = "early morning hours"; break;
				
			case 5: case 6:
				result = "dawn"; break;	
		}

		System.out.println(result);
		
		
	}

}
