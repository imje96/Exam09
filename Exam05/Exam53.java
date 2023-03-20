package Exam5;

public class Exam53 {

	public static void main(String[] args) {
		eamil("kopo@naver.com", "메서드 배우고 있어요");
		eamil("kopo2@naver.com", "공부 중이에요");
	}

	public static void eamil(String address, String text) {
		System.out.println(address + "에 아래의 메일을 송신한다.");
		System.out.println("제목 : 제목 없음");
		System.out.println("본문 : " + text);
	}
}