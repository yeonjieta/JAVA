package dailyquiz;

import java.util.Random;

public class Quiz_loop3_updown {
	public static void main(String[] args) {
		
		// 1 ~ 100 사이의 up&down 게임을 만들어라
		// 숫자는 컴퓨터가 랜덤으로 맞춘다.
		Random ran = new Random();
		int cnt = 0; // 몇번했는지 세기 위해서
		int answer = ran.nextInt(100) +1;
		// 범위를 1 ~ 100 으로 잡아야해서 +1, +1 안하면 0~ 99
		int user;  // 컴터가 맞출 값
		int min = 1; // 최소값
		int max = 100; // 최대값
		
		while(true) {
			System.out.printf("up & down(%d ~ %d)? ", min, max);
			
			user = (min + max)/2; // 범위를 좁혀야 하기 때문에 최소값과 최대값의 중간 범위를 지정
			System.out.println("컴퓨터가 말할 숫자는 ?!" + user); // Scanner에서는 사용자로부터 입력을 받는 부분과 같지만, 이건 random이라 컴퓨터가 알아서 숫자를 뽑아오기 때문에 이런식으로 입력
			
			cnt +=1;  // 몇번만에 맞췄는지 확인해야 하기 때문에 cnt
			
			if(user > answer) {
				System.out.println("down");
				max = user - 1;  
				// 만약 user가 50이였다고 가정하자, 답이 아니라면 범위가 1 ~ 50로 될것이다. 
				// 하지만  50은 정답이 아니므로 굳이 포함될 필요가 없이 49부터 정답을 생각하면 된다 . 그래서 -1을해서 최대값 자리에 49가 나오도록 하는 것이다.
			}
			
			else if(user < answer ) {// 컴퓨터가 뽑은 답이 answer보다 작다면
				System.out.println("up");
				min = user +1;   // 위와 같은 개념으로 +1을 해준다.
			}
			
			else {   // user == answer 
				System.out.printf("정답은 %d 입니다. %d번만에 맞췄습니다.", answer, cnt);
				break;
			}

		}	
		
		
		
	}

}
