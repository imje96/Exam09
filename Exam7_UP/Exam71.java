package Exam7_UP;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class Exam71 {
    public static void main(String[] args) throws Exception, IOException {
        String resource = "C:\\java\\gradle.properties";
        Reader fr = new FileReader(resource);
        // Reader fr = new FileReader("gradle.properties");
        Properties prop = new Properties();
        prop.load(fr);
        String androidX = prop.getProperty("android.useAndroidX");

        System.out.println(androidX);
        fr.close();
    }
}
