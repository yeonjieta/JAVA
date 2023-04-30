package dailyquiz;

import java.util.Scanner;  // ( java.util : jre system 안에 있는 파일, scanner는 Class)

public class Quiz_operator_plus {
	public static void main(String[] args) {
		/*
		 * 두 정수를 입력받아서 합계를 구하고,
		 * a + b = c의 형식으로
		 * 정답을 포함한 수식을 화면에 출력해주세요
		 */
		
		// 1) 코드를 진행하기 위해 필요한 변수가 무엇이고, 몇개인지 파악  ( 위쪽에서 다 선언하는게 좋음 )
		
		Scanner sc =new Scanner(System.in);
		int n1, n2, answer;
		
		// 2) 고정값은 변수에 초기값으로 넣는다
		//	    입력값을 받아서 변수에 저장한다
		System.out.print("첫번째 정수 입력 :");
		n1 = Integer.parseInt(sc.nextLine());   // 종이에 펜으로 쓰는 격
			//2)정수로 변환할게요// 1) 문자를 입력하세요(아무거나) 가급적 정수로  써주세요
		
		System.out.print("두번째 정수 입력 :");
		n2 = Integer.parseInt(sc.nextLine());
		
		
		// 3) 연산이 필요한 값은 입력 이후 처리한다
		answer = n1 + n2;
		
		// 4) 연산이 필요한 값은 입력 이후 처리한다
		System.out.println(n1 + " + " + n2 + " = " + answer);
		
		// 5) 코드가 종료되기 전 마무리 작업을 수행한다
		sc.close();
	}

}


// next는 엔터 혹은 띄어쓰기로 구분  
// 메모리 누수 : 밥먹으러와서 차를 댔는데 한달이 지나도록 차를 뺴지않는거와 같다 .
// 본체가 키보드를 통해 들어온 입력을 다 받았음 문을 닫아야하는데 닫지 않으면 누수의 위험성이 있다.