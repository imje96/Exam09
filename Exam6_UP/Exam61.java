package Exam6_UP;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Exam61 {
    public static void copy(String sourceFileName, String targetFileName) throws Exception {
        FileInputStream input = null;
        FileOutputStream output = null;
        // 복사할 대상 파일을 지정해준다.
        // FileInputStream 는 File object를 생성자 인수로 받을 수 있다.
        input = new FileInputStream(sourceFileName);
        // 복사된 파일의 위치를 지정해준다.
        output = new FileOutputStream(new File(targetFileName));


        input = new FileInputStream(sourceFileName);
        output = new FileOutputStream(targetFileName);
        int data;

        while ((data = input.read()) != -1) { //조건문은 파일에서 더 이상 읽을 데이터가 없을 때까지 반복 
            output.write(data); // data 변수에 저장된 값을 targetFileName 파일에 씀
        }
        // while 루프를 사용하여 sourceFileName 파일에서 읽은 데이터를 targetFileName 파일에 씀
        input.close();
        output.close();
    }
    
    public static void main(String[] args) throws Exception {
        copy("C:\\java\\Java_Exam.txt","C:\\java\\Java_Exam_copy.txt");
    }
}

