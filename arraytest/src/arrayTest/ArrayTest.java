package arrayTest;

import java.util.Random;
import java.util.Arrays;




public class ArrayTest {
	public static void main(String[] args) {
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		Random ran = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();

		// 컬렉션을 사용하지 않고 다음 문제를 풀어보세요

		// 1) 배열의 각 요소를 역순으로 출력해보세요
		// 정렬이 아닙니다. 먼저 출력된 값의 역순으로 출력되어야 합니다
		int[] arr2 = new int[arr.length];
		// 역순을 담을 배열을 생성
		for (int i = 0; i < arr2.length; i++) {
			int j = arr.length-i-1;
			// 예를들어 i = 0 이면 j는 9이다. 
			arr2[j] = arr[i];
			// 이런식으로 arr2의 9번째와 arr의 0번째가 같으므로 반복문을 통해 0 ~ arr2.length -1 까지 역순으로 출력된다  . 
		}
		System.out.println("arr의 역순 arr2 : " + Arrays.toString(arr2));
		System.out.println();

		// 2) 홀수와 짝수가 몇개인지 각각 파악하여 출력하세요
		int odd = 0; // 홀수 개수를위한 변수 선언
		int even = 0; // 짝수 개수를 위한 변수 선언
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) { // 2로 나눴을 때 0이 아니면 홀수란 뜻
				odd++ ;  // 이 경우 odd에 +1을 해준다. 
			}
			else {  // 2로 나눴을 때 0이면 짝수란 뜻
				even++;  // 이 경우 even에 +1을 해준다. 
			}
		}
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
		System.out.println();

		// 3) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		
//
//		int[] oddArray = new int[arr.length];
//		int[] evenArray = new int[arr.length];
//		for(int i = 0; i < arr.length; i++) {
//			if( arr[i] % 2 != 0) {
//				oddArray[i] += arr[i];
//			}
//			else {
//				evenArray[i] += arr[i];
//			}
//		}
//		System.out.println("oddArray: " + Arrays.toString(oddArray));
//		System.out.println("evenArray: " + Arrays.toString(evenArray));
//		
//		--- 배열의 길이가 arr.length로 정해져있어, 빈자리에 0이 들어가서 길이를 맞춘다. 그래서 실패
//		
		
		
//		int oddCount = 0; 
//		int evenCount = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 != 0) {
//				oddArray[i] += arr[i];
//				oddCount++;
//			}
//			else {
//				evenArray[i] += arr[i];
//				evenCount++;
//			}
//		}
//		oddArray = new int[oddCount];
//		evenArray = new int[evenCount];
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] % 2 != 0) {
//				oddArray[i] += arr[i];
//			}
//			else {
//				evenArray[i] += arr[i];
//			}
//		}
//		
//		System.out.println("oddArray: " + Arrays.toString(oddArray));
//		System.out.println("evenArray: " + Arrays.toString(evenArray));
		


		// 배열의 길이를 알아야 풀 수 있기 때문에 각 배열의 길이를 구한 후 배열 생성하여 문제 풀기
		// 컬렉션 써도 가능하면 리스트로 푸는게 더 빠름
		// 향상된 for문으로 풀어보기(깔끔해 보이긴 한데 그냥 for문이 가독성이 더 좋은거 같기두,,)~
		
		int oddCount = 0;
		int evenCount = 0;

		for (int i : arr) {
			if (i % 2 != 0) {
				oddCount++; //홀수 개수 구하기
			} else {
				evenCount++; // 짝수 개수 구하기
			}
		}

		int[] oddArray = new int[oddCount];
		int[] evenArray = new int[evenCount];

		int oddIndex = 0;  // 홀수인덱스 
		int evenIndex = 0; // 짝수인덱스

		for (int i : arr) {
			if (i % 2 != 0) {
				oddArray[oddIndex] = i; // 홀수를 oddArray에 추가
				oddIndex++;
			} else {
				evenArray[evenIndex] = i; // 짝수를 evenArray에 추가
				evenIndex++;
			}
		}

		System.out.println("oddArray: " + Arrays.toString(oddArray));
		System.out.println("evenArray: " + Arrays.toString(evenArray));
		System.out.println();


		// 4) 배열의 합을 구하여 출력하세요
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		System.out.println("배열의 합 : " + total);
		System.out.println();
		

		// 5) 배열의 값을 오름차순으로 변환하여 출력하세요
		// 오름차순이니 젤 작은 수가 맨 앞으로 와야한다. 
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length -1; j++) { // j+1을 넣기 때문에 범위를 -1 해줘야함
				if(arr[j] > arr[j+1]) {
					int min = arr[j];
					// 첫번째 요소를 min에 저장하고
					// arr[j+1]이 arr[j]보다 더 작으니 앞으로 배치해야 하기 때문에 두 개의 위치를 바꿔준다.
					arr[j] = arr[j+1];
					arr[j+1] = min;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();

		// 6) 위 내용들을 각각 서로 다른 함수로 작성하여 새로운 배열을 반환하게 작성하세요
		// 만들어진 함수를 각각 호출하여 결과를 확인하세요
		
		
		// 1)
		int[] reverse = reverse(arr);
		System.out.println("함수로 작성한 reverse :" + Arrays.toString(reverse));
		System.out.println();
		
		// 2)
		int odd2 = oddcount(arr);
		System.out.println("함수로 작성한 홀수개수 : " + odd2);
		
		int even2 = evencount(arr);
		System.out.println("함수로 작성한 짝수개수 : " + even2);
		
		// 3)
		oddArray2(oddArray);
		evenArray2(evenArray);
		System.out.println("함수로 작성한 oddArray: " + Arrays.toString(oddArray));
		System.out.println("함수로 작성한 evenArray: " + Arrays.toString(evenArray));
		System.out.println();
		
		// 4)
		int total2 = totalArray(arr);
		System.out.println("함수로 작성한 합계 : " + total2);
		
		// 5)
		ascArray(arr);
		System.out.println("함수로 작성한 오름차순 : " +Arrays.toString(arr));
		
		
		
	}

	public static int[] reverse(int[] arr) {
		int[] reverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int j = arr.length - i - 1;
			reverse[j] = arr[i];
		}
		return reverse;
	}

	public static int oddcount(int[] arr) {
		int odd2 = 0;
		for (int i : arr) {
			if (i % 2 != 0) {
				odd2++;
			}
		}
		return odd2;
	}

	public static int evencount(int[] arr) {
		int even2 = 0;
		for (int i : arr) {
			if (i % 2 == 0) {
				even2++;
			}
		}
		return even2;
	}

	public static int totalArray(int[] arr) {
		int total2 = 0;
		for (int num : arr) {
			total2 += num;
		}
		return total2;
	}

	public static int[] ascArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int min = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = min;
				}
			}
		}
		return arr;
	}

	public static int[] oddArray2(int[] arr) {
		int oddCount = 0;

		for (int i : arr) {
			if (i % 2 != 0) {
				oddCount++; // 홀수 개수 구하기
			}
		}

		int[] oddArray = new int[oddCount];

		int oddIndex = 0;

		for (int i : arr) {
			if (i % 2 != 0) {
				oddArray[oddIndex] = i; // 홀수를 oddArray에 추가
				oddIndex++;
			}
		}
		return oddArray;
	}

	public static int[] evenArray2(int[] arr) {
		int evenCount = 0;

		for (int i : arr) {
			if (i % 2 == 0) {
				evenCount++;
			}
		}
		int[] evenArray = new int[evenCount];

		int evenIndex = 0; // 짝수인덱스

		for (int i : arr) {
			if (i % 2 == 0) {
				evenArray[evenIndex] = i;
				evenIndex++;
			}
		}
		return evenArray;

	}
}

