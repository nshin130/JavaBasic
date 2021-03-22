package nshin.basic.day05;

import java.util.Scanner;

public class CardCheck {

	public static void main(String[] args) {
		// 신용카드 번호를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3: jcb
		// 4: visa
		// 5: master
		
		String cardnumber; // 왜 문자로 받아들여야..? charAt때
		String cardtype = ""; //왜 초기화?.. 초기화 뭔지?..
		String cardbank = "";
		String fmt="카드종류는 %s 이고요, %s 입니다.";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("카드 번호를 입력하세요. ");
		cardnumber= sc.next();
		
		switch (cardnumber.charAt(0)) {
			case '3': cardtype = " JCB card "; break; 
			case '4': cardtype = " Visa card "; break;
			case '5': cardtype = " Master card "; break;
		
		//if (cardnumber.charAt(0) == '3')
		//	cardtype = "JCB card";
		//else if (cardnumber.charAt(0) == '4')
		//	cardtype = "VISA card";
		//else if (cardnumber.charAt(0) == '5')
		//	cardtype = "Master card";
			
		}
		
		// System.out.println(cardtype);		//괄호위치 잘 확인
		
		switch (cardnumber) {
			case "356317" : cardbank = "NH농협카드"; break;
			case "356901" : cardbank = "신한카드"; break;
			case "356912" : cardbank = "KB국민카드"; break;
			case "404825" : cardbank = "비씨카드"; break;
			case "438676" : cardbank = "신한카드"; break;
			case "457973" : cardbank = "국민은행"; break;
			case "515594" : cardbank = "신한카드"; break;
			case "524353" : cardbank = "외환카드"; break;
			case "540926" : cardbank = "국민은행"; break;
		
		} //switch
		
		System.out.printf(fmt, cardtype, cardbank);
		
	} //main
}