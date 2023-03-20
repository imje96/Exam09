package Exam5;

public class Exam52 {

public static void main(String[] args) {
		eamil("안녕하세요", "kopo@naver.com", "메서드 배우고 있어요");
	}

	public static void eamil(String title, String address, String text) {
		System.out.println(address + "에 아래의 메일을 송신한다.");
		System.out.println("제목 : " + title);
		System.out.println("본문 : " + text);
	}
}