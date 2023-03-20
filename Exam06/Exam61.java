package Exam6;

public class Exam61 {
	public static void main(String[] args) {
		System.out.println("3초간 기다림!");

        try {
            Thread.sleep(3000); // 3초(3000밀리초) 동안 일시 중지
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		System.out.println("끝");
	}
}
