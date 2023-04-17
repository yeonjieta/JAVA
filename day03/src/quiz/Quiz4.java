package quiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		// 생년월일 6자리를 정수로 입력받아서, 년, 월, 일로 구분하고
		// 현재 연도를 이용하여 나이를 계산하세요
		// 그런 다음, 출생년도는 4자리로 만들어서 연월일과 현재 나이를 출력해주세요
		// 나이가 20이상이면 성인, 아니면 미성년자로 만들어서 함께 출력합니다
		
		// 입력 : 930516
		// 출력 : 1993년 5월 16일 출생, 31세, 성인입니다
		
		// 입력 : 110203
		// 출력 : 2011년 2월 3일 출생, 13세, 미성년자입니다
		
		Scanner sc = new Scanner(System.in);
		int input;
		int year, month, day, age, currentYear = 2023;
		String adult, result;
		
		System.out.print("생년월일 6자리 입력 : ");
		input = Integer.parseInt(sc.nextLine());
		
		day = input % 100;		// 뒤에서 2자리 떼어내서 저장
		input = input / 100;	// 뒤에 2자리는 별도로 저장했으니 원래 변수에서 제거한다
		
		month = input % 100;
		year = input / 100;
		
		if(year <= 23) {
			year = year + 2000;
		}
		else {
			year += 1900;
		}
		age = currentYear - year + 1;
		
		if(age >= 20) {
			adult = "성인";
		}
		else {
			adult = "미성년자";
		}
		
//		System.out.printf("%d, %d, %d, %d, %s\n", year, month, day, age, adult);
		result = "%d년 %d월 %d일 출생, %d세, %s입니다\n";
		result = String.format(result, year, month, day, age, adult);
		System.out.println(result);
		
		sc.close();
	}
}
