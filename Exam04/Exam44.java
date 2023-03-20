package Exam4;

public class Exam44 {
	// for 문
	public static void main(String[] args) {
		int[] numbers = { 3, 4, 9 };
		System.out.println("1자리의 숫자를 입력 해 주세요");
		int input = new java.util.Scanner(System.in).nextInt();

		for (int i = 0; i < numbers.length; i++) {
			if (input == numbers[i]) {
				System.out.println("정답!");
			}
		}
	}

}
//  for each문

//	public static void main(String[] args) {
//		int[] numbers = { 3, 4, 9 };
//		System.out.println("1자리의 숫자를 입력 해 주세요");
//		int input = new java.util.Scanner(System.in).nextInt();
//
//		for (int result : numbers) {

//			if (input == result) {
//				System.out.println("정답!");
//			}
//		}
//	}
//}