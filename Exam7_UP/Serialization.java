package Exam7_UP;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        // 총무부 리더 생성
        Employee leader = new Employee();
        leader.name = "홍길동";
        leader.age = 41;

        // 총무부 생성
        Department department = new Department();
        department.name = "총무부";
        department.leader = leader;

        try {
            // 파일 출력 스트림 생성
            FileOutputStream fileOut = new FileOutputStream("company.dat");

            // 객체 출력 스트림 생성
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // 객체 직렬화
            out.writeObject(department);

            // 스트림 닫기
            out.close();
            fileOut.close();

	        System.out.println("직렬화된 객체가 company.dat파일에 저장되었습니다.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}