package control;

import java.util.Scanner;

public class Ex08_Quiz {
	public static void main(String[] args) {
		
		// 두 정수를 입력받아서, 첫번째 정수와 두번째 정수의 크기를 비교하여
		// 크다, 같다, 작다로 구분하여 출력하세요
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("첫번째 정수 입력 : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 입력 : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		if(n1 > n2) {
			System.out.printf("%d는 %d보다 크다\n", n1, n2);
		}
		else if(n1 == n2) {
			System.out.printf("%d와 %d는 같다\n", n1, n2);
		}
		else {
			System.out.printf("%d는 %d보다 작다\n", n1, n2);
		}
		
		sc.close();
	}
}
