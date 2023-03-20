package Exam15;

import java.io.FileWriter;
import java.io.IOException;

public class Exam154 {
    public static void main(String[] args) {

        try { // throw로 예외 발생시킴
            System.out.println("프로그램 시작");
            throw new IOException("예외를 강제로 발생시킴");
        } catch (IOException e) {
            System.out.println("종료하겠습니다");
            e.printStackTrace();
            System.exit(1); // 프로그램 강제 종료
        }
    }
}
