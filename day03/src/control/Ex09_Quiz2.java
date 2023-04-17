package control;

import java.util.Scanner;

public class Ex09_Quiz2 {
	public static void main(String[] args) {
		
		// 세 정수를 입력받아서, 그 중 가장 큰 수를 화면에 출력하세요
		
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max1, max2;
		
		// 입력
		System.out.print("n1 입력 : ");
		n1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("n2 입력 : ");
		n2 = Integer.parseInt(sc.nextLine());
		
		System.out.print("n3 입력 : ");
		n3 = Integer.parseInt(sc.nextLine());
		
		// 연산 1 (논리 연산으로 한번에 비교하기)
		if(n1 > n2 && n1 > n3) {
			max1 = n1;
		}
		else if(n2 > n1 && n2 > n3) {
			max1 = n2;
		}
		else {
			max1 = n3;
		}
		
		// 연산2 (순서대로 하나씩 비교하면서 큰 값만 저장하기)
		max2 = n1;			// n1의 값이 가장 크다고 가정한다
		if(max2 < n2) {		// 만약 n2의 값이 max2보다 더 크면
			max2 = n2;		// n2를 max2에 대입한다
		}
		if(max2 < n3) {		// 만약 n3의 값이 max2보다 더 크면
			max2 = n3;		// n3를 max2에 대입한다
		}
		
		// 출력
		System.out.println("max1 : " + max1);
		System.out.println("max2 : " + max2);
		
		// 마무리
		sc.close();
	}
}










