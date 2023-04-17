package operator;

import java.util.Random;

class RandomStringBox {
	private Random ran = new Random();
	
	private String[] arr = {"Hello", "java", "world", "python", null};
	
	public String getRandomString() {
		return arr[ran.nextInt(arr.length)];
	}
}

public class Ex02_Operator {
	public static void main(String[] args) {
		// 논리 연산자 : 서로 다른 boolean 값을 연산하여 새로운 결과를 만들어 낸다
		
		// 논리 이항 연산 : && (and), || (or)
		// 논리 단항 연산 : ! (not)
		
		// and : 첫번째 조건과 두번째 조건이 모두 참이면 전체 결과가 참이다
		// or : 첫번째 조건 혹은 두번째 조건중 하나라도 참이면 전체 결과가 참이다
		// not : 부호 반전 연산과 동일하게 기존 조건의 반대 결과를 도출한다
		
		int num = 12;
		int num2 = 14;
		boolean flag1 = (num % 2 == 0) && (num % 3 == 0);
		boolean flag2 = (num2 % 2 == 0) && (num2 % 3 == 0);
		System.out.println(flag1);
		System.out.println(flag2);
		
		
		int num3 = 15;
		int num4 = 16;
		boolean flag3 = (num3 % 5 == 0) || (num3 % 4 == 0);
		boolean flag4 = (num4 % 15 == 0) || (num4 % 3 == 0);
		System.out.println(flag3);
		System.out.println(flag4);

		
		RandomStringBox box = new RandomStringBox();
		
		// 대상이 있다면 && 대상의 속성값이 원하는 조건에 맞으면
		String str = box.getRandomString();
		for(int i = 0; str != null && i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
		
		int a = 2, b = 1, c = 0, d = -1;
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		boolean bo1 = a++ + ++b < -c && ++c - -d > 0;
		System.out.println(bo1);
		
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
		// 이항 논리 연산자는 첫번째 조건의 결과에 따라서, 두번째 조건을 체크하지 않을 수도 있다
		// 따라서, 두개의 조건은 서로 동등한 것이 아니고, 먼저 체크할 조건을 앞에 배치해야 한다
		
		
		
		
		
		
		
	}
}
