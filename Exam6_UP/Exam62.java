package Exam6_UP;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Exam62 {
    public static void copy(String sourceFileName, String targetFileName) throws Exception {
        FileInputStream input = null;
        GZIPOutputStream gzipOutput = null;

        input = new FileInputStream(sourceFileName);
        gzipOutput = new GZIPOutputStream(new FileOutputStream(new File(targetFileName)));

        byte[] buffer = new byte[1024];
        int len;
        while ((len = input.read(buffer)) != -1) {
            gzipOutput.write(buffer, 0, len);
        }

        input.close();
        gzipOutput.finish();
        gzipOutput.close();
    }

    public static void main(String[] args) throws Exception {
        String sourceFile = "C:\\java\\Hello.txt";
        String targetFile = "C:\\java\\Hello.zip";
        String copiedFile = "C:\\java\\Hello_copy.zip";

        // 소스파일로부터 zip파일 생성
        FileInputStream fileInputStream = new FileInputStream(sourceFile);
        GZIPOutputStream gzipOutput =
                new GZIPOutputStream(new FileOutputStream(new File(targetFile)));
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            gzipOutput.write(buffer, 0, len);
        }
        fileInputStream.close();
        gzipOutput.finish();
        gzipOutput.close();

        // zip파일을 타겟파일로 복사
        copy(targetFile, copiedFile);
    }
}
