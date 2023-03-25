package Thread;

//디자인 패턴을 활용하여 다음 조건에 맞는 MyLogger 클래스를 만드시오.File을 닫는 처리는 생략해도 됨.
//
//- 인스턴스화와 동시에 dummylog.txt 파일을 연다
//- 인수로 전달하는 문자열을 파일에 쓰는 log() 메소드를 가진다
//- 다음과 같이 사용해도 에러를 내지 않고 2개의 로그 메시지가 동일 파일에 순서대로 출력되어야 한다.
import java.io.*;

public class MyLogger {
    private static MyLogger instance = new MyLogger();
    private File file;
// 로그를 기록할 파일 객체
    private MyLogger() {
        file = new File("dummylog.txt");
    }

// getInstance() 메소드를 제공하여, 내부적으로 인스턴스를 생성하고 반환
    public static MyLogger getInstance() {
        return instance;
    }

    public void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
// writer을 이용해 로그를 파일에 기록
            writer.write(message);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}