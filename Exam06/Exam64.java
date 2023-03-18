package Exam6;

// 반지름이 1인 원 안에 다트를 던져서 원주율 구하기
import java.util.Random;
import java.util.Scanner;

public class Exam64 {

	public static void main(String[] args) {
		System.out.println("던질 횟수를 입력해주세요");
		Scanner sc = new Scanner(System.in);
		long tries = sc.nextLong();
		int hits = 0;

		for (int i = 0; i < tries; i++) {
			Random rand = new Random();
			double x = rand.nextDouble() * 2 - 1; // nexDouble이 0~1, -1 ~ 1까지
			double y = rand.nextDouble() * 2 - 1;
			double result = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
			if (result <= 1) { //
				hits += 1;
			}
		}
		double PI = 4 * (double) hits / (double) tries; // 4 hits tries -> 하나만 double만 해도 될 듯,
// 4를 4.0으로 써도 됨 
		double piEstimate = PI; // 반복이 끝나면 piEstimate 선언
		System.out.println(piEstimate);

	}
}
