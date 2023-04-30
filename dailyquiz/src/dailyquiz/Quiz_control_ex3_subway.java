package dailyquiz;

import java.util.Scanner;

public class Quiz_control_ex3_subway {
	public static void main(String[] args) {
		// 지하철 한 구간 당 약 3분의 시간이 소요된다고 가정한다
		// 이동한 지하철 구간 수를 입력받아서
		// 걸린 시간을 출력하세요
		// 단, 시간이 60분을 초과하면 시간과 분으로 나누어서 출력하고
		// 60분 이하이면, 분으로만 출력하세요
		// 문자열의 형식을 지정하기 위해서, String.fromat(format, args...) 함수를 사용
		
		Scanner sc = new Scanner(System.in);
		int pertime = 3;  // 구간당 시간 = 3분
		int time, subway; // 총 시간과 지하철 구간수 
		String result; // String.fromat 문자열을 저장하기 위한 변수
		
		System.out.println("이동한 지하철 구간 수는 ?");
		subway = Integer.parseInt(sc.nextLine()); // 구간수를 입력받고
		time = subway * pertime;  // 총 시간은 구간수 *구간당 시간
		if(time > 60) {
			result = String.format("%d시간 %d분", time / 60, time% 60);
		}   // 60(1시간이 총 60분이니까)으로 몫을 구하면 나머지는 버려지게 되므로 시간을 구할수있다,
			// 마찬가지로 60으로 나눈 나머지는, 더이상 60으로 나눌 수없는 60 이하의 분으로만 표시 될 수있는 수이기 때문에 분으로 출력 
		else {
			result = String.format("%d분", time);
		}
		System.out.println(result);
	sc.close();	
	}

}
