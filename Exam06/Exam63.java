package Exam6;

//전자시계 프로그램
public class Exam63 {

	public static void main(String[] args) {
		for (int i = 00; i < 59; i++) {

			for (int j = 1; j < 12; j++) {
				// 일의 자리와 십의 자리를 깔끔하게 정리하기 위해 String.format 이용
				System.out.print(String.format("%2d", j) + ":" + String.format("%02d", i));
				// System.out.printf("%2d:%02d", j, i);
				System.out.print("   "); // j 띄어쓰기
			} // -> 가로로 출력되기 위해 println 대신 print 를 사용

			System.out.println();
		}
	}
}