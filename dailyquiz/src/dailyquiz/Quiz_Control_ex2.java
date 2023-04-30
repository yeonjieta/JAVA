package dailyquiz;

import java.util.Scanner;

public class Quiz_Control_ex2 {
	public static void main(String[] args) {
	
	// 세 정수를 입력받아서, 그 중 가장 큰 수를 화면에 출력하세요
	
	//변수선언
	Scanner sc = new Scanner(System.in);
	int a, b, c, max;
	
	//입력
	System.out.print("정수1 :");
	a = Integer.parseInt(sc.nextLine());
	System.out.print("정수2 :");
	b = Integer.parseInt(sc.nextLine());
	System.out.print("정수3 :");
	c = Integer.parseInt(sc.nextLine());
	
	max = a; // a가 가장 크다고 가정
	if(max < b) {  // b가 max보다 크면 
		max = b;   // b가 max가 된다.
	}
	if(max < c) {   // c가 max보다 크면 
		max = c;	// c가 max가 된다. 
	}
	
	System.out.println("최대값은 " + max);
	// 첫번째 코드가 실행되든 말든 두번째 코드 실행 ( 이전 값을 저장은 해두지만 코드가 맞으면 출력하고 아니면 지나가)
	
	sc.close();
	}
	
}
