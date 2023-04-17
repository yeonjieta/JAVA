package control;

public class Ex07_if_else {
	public static void main(String[] args) {
		
		// else 는 단독으로 사용하지 않고, 이전에 if가 있어야 한다
		// else 는 별도의 조건을 가지지 않는다 (if가 수행되지 않았다면 연결된 else가 작동하는 방식이다)
		// if와 else 사이에 다른 구문을 넣으면 안된다
		
		int num = 20;
		
		if(num > 20) {
			System.out.println("20보다 크다");
		}
		
//		System.out.println("안녕하세요");
		
//		else {
//			if(num == 20) {
//				System.out.println("20과 같다");
//			}
//			else {
//				System.out.println("20보다 작거나 같다");
//			}
//		}
		else if(num == 20) {
			System.out.println("20과 같다");
		}
		else {
			System.out.println("20보다 작거나 같다");
		}
	}
}
