package Exam7_UP;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try {
            // 파일 입력 스트림 생성
            FileInputStream fileIn = new FileInputStream("company.dat");

            // 객체 입력 스트림 생성
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // 객체 역직렬화
            Department department = (Department) in.readObject();
            Employee leader = department.leader;

            // 스트림 닫기
            in.close();
            fileIn.close();

            // 객체 정보 출력
            System.out.println("부서명: " + department.name);
            System.out.println("총무부 리더: " + leader.name);
            System.out.println("총무부 리더 나이: " + leader.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
