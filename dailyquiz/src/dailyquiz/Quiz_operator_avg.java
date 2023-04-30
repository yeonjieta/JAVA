package dailyquiz;

import java.util.Scanner;

public class Quiz_operator_avg {
	public static void main(String[] args) {
		/*
		 *  세 과목의 점수를 정수형태로 입력받고, 이름은 문자열로 입력받으세요
		 *  그런다음, 점수의 합계와 평균을 구합니다.
		 *  이 때, 평균은 실수 형태로 소수점 둘째자리 까지 출력할 수 있도록 준비하세요
		 *  
		 *  모든 준비가 끝나면 이름과 합계와 평균만 출렵합니다.
		 *  
		 *  추가내용 ) boolean 타입의 변수를 선언하여, 평균이 60점 이상인지 아닌지 판별하여
		 *  결과를 출력하세요
		 *  합격여부 : true
		 */
		
		// 디버깅 시작 : F11
		// 중단점 설정 : Ctrl + Shift + b
		// 다음 코드 실행 : F5(Step into), F6(Step over)
		// 제어문(반복문)에서 값의 변화를 추적하기 위해서 사용할 수 있음
		
		// 1) 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int a,b,c, total;
		double avg;
		boolean pass;
		
		// 2) 입력
		System.out.print("이름 : ");
		name = sc.nextLine();

		System.out.print("점수1 : ");
		a = Integer.parseInt(sc.nextLine());
		System.out.print("점수2 : ");
		b = Integer.parseInt(sc.nextLine());
		System.out.print("점수3 : ");
		c = Integer.parseInt(sc.nextLine());
	
		
		// 3) 연산
		total = a + b + c;
	
		avg = total/3.0;
		
		pass = avg >=60;
		
		
		// 4) 출력
		System.out.printf("이름 : %s, 합계 : %d, 평균 : %.2f", name, total, avg);
		System.out.print("합격 여부 : " + pass);
		
		// 5) 마무리
		sc.close();
	}

}
