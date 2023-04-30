package dailyquiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz_loop2_dice {
	public static void main(String[] args) {
		// 1 ~ 6 사이의 정수가 랜덤으로 나오는 주사위 개념을 만들어라
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int dice = ran.nextInt(6) + 1;
		// 1 ~ 6사이의 랜덤 정수를 뽑아야하는데 +1을 하는 이유는  
		// ran.nextInt(6)가 0~5까지의 범위에서 정수를 반환하기 때문이다.
		// 그래서 1을 더하면 1 ~ 6의 정수가 반환된다.
		int cnt = 0; // 몇번만에 뽑았는지 구하기 위해서
		int user;
		
		while(true) { // 조건식이 무조건 참이라 가정
			System.out.println("정답은 ? : ");
			user = Integer.parseInt(sc.nextLine());
			// 숫자를 입력받음
			cnt +=1; // 반복할 때마다 +1
			if(user == dice) { // 입력 받은 숫자와 random으로 나온 dice의 숫자가 같으면
				break;  // 반복 멈춰라.
			}
		}
		System.out.printf("정답은 %d, %d회만에 맞췄다.", dice, cnt);
		sc.close();
		
	}

}
