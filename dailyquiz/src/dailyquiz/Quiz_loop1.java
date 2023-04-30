package dailyquiz;

import java.util.Scanner;

public class Quiz_loop1 {
	public static void main(String[] args) {
		// 1) 1부터 5까지 한줄에 출력하세요.
		int num = 1;
		while(num <= 5) {
			System.out.print(num +" ");
			num +=1;
		}
		System.out.println(); // 밑에 문제와 줄 나눔을 위해 썼다.
		// 2) 1부터 100까지의 정수 중 7의 배수만 한 줄에 출력하세요.
		int num1 = 1;
		while(num1 <= 100) {
			if(num1 % 7 == 0) { // 7의 배수이기 때문에 7로 나눴을 때 나머지가 0이어야한다.
				System.out.print(num1 + " ");
			}			
			num1 +=1;
		}
		System.out.println();
		
		// 3) 점수를 입력받기 위해서 변수를 만들고,
		// 변수의 값이 0 ~ 100 사이에 포함될 때까지 반복하여 입력받고 이후 출력하세요.
		Scanner sc = new Scanner(System.in);
		int score =0 ;
		
		while(true) {
			if(score <=0 || score > 100) { // 점수가 0보다 작거나 100 보다 크면
				System.out.println("점수입력 : ");
				score = Integer.parseInt(sc.nextLine()); // 입력받아라
			}
			else {						// 아니면 
				System.out.println(score);  // score을 출력하고
				break;		//멈춰라
			}			
		}
		sc.close();
	}
}

