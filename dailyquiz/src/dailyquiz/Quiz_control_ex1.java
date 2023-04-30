package dailyquiz;

import java.util.Scanner;

public class Quiz_control_ex1 {
	public static void main(String[] args) {
	// 두 정수를 입력받아서, 첫번째 정수와 두번째 정수의 크기를 비교하여
	// 크다, 같다, 작다로 구분하여 출력하세요
			
			Scanner sc = new Scanner(System.in);
			int a, b;  // 
			
			System.out.print("첫번째 정수 :");
			a = Integer.parseInt(sc.nextLine());
			
			System.out.print("두번째 정수 :");
			b = Integer.parseInt(sc.nextLine());
			
			if(a > b) {
				System.out.printf("%d가 %d보다 크다", a, b);
			}
			else if (a ==b) {
				System.out.printf("%d가 %d와 같다", a, b);
			}
			else{
				System.out.printf("%d가 %d보다 작다", a, b);
			}
			
			sc.close();
			
		}
		

}
