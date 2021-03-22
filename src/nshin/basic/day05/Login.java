package nshin.basic.day05;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		// 키보드 아이디 비번 입력해서
		// 로그인 성공여부를 출력하는 프로그램
		// ID: abc123
		// PW: 987xyz
		// 1. ID & PW x - 로그인 실패
		// 2. ID o PW x - 비밀번호가 틀려요 
		// 3. ID x PW o - 아이디가 틀려요
		// 4. ID o PW o - 로그인 성공
		// => 입력값에 따른 결과 처리가 복잡하므로 단순화시킴
		// 입력처리가 복잡해지면 코드도 복잡하게 짤수밖에 없음
		// => 1,2,3 로그인 실패, 4 성공
		
		//변수선언
		String userid;
		String password;
		Scanner sc=new Scanner(System.in);
		String result; 
		
		//처리 아이디 비번 입력받기
		System.out.print("아이디는?");
		userid=sc.next();
				
		System.out.print("비밀번호는?");
		password=sc.next();
		
		//  문자열 비교시 ==이 아닌 equals 메서드 사용!
		
		//	if (userid.equals("abc123")) {		//아이디를 올바르게 입력한 경
		//		if (password.equals("987xyz"))
		//			result = "로그인 성공";
		//		else
		//			result = "비밀번호가 틀려요";	
		//	} else {						//아이디를 올바르게 입력하지 않은 경우
		//		if (password.equals("987xyz"))
		//			result = "아이디는 틀리고 비밀번호는 맞아요";
		//		else 
		//			result= "아이와 비밀번호가 틀려요";
		//	}
			//로그인 성공여부를 4가지 경우에 따라 작성 - 코드 복잡
		
		// if (userid.equals("abc123")) {
		//	 if (password.equals("987xyz"))
		//		 result = "로그인 성공!";
		//	 else 
		//		 result = "로그인 실패!";
		// } else
		//	 result = "로그인 실패!";
		//로그인 성공여부를 3가지 경우에 따라 작성 - 코드 다소 단순
		
		//}
	
		if (userid.equals("abc123") &&
				password.equals("987xyz"))
			result = "로그인성공";
		else
			result = "로그인실패";
		//조건식들을 논리식으로 재작성 - 코드단순해짐
			
		// 결과 출력
		System.out.println(result);
		
	}
}

	
	
