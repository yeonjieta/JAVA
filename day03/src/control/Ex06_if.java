package control;

public class Ex06_if {
	public static void main(String[] args) {
		// 제어문 (control statement) : 프로그램의 흐름을 제어하는 구문
		
		// 분기문과 반복문, 기타 제어문으로 구분한다
		// 분기문 : if, switch ~ case
		// 반복문 : while, do ~ while, for
		// 기타 제어문 : break, continue, return
		
		int num = 10;
		
		if(num < 20) {	// 만약, 조건이 참이라면
			System.out.println(++num);	// 종속 문장을 실행한다
		}
		if(num >= 20) {	// 만약, 조건이 거짓이면
			System.out.println(--num);	// 종속 문장을 실행하지 않는다
		}
	}
}
