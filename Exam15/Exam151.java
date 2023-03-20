package Exam15;

public class Exam151 {
    public static void main(String[] args) throws NullPointerException {
        String s = null;
        try {
            s.length();
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException 예외를 catch 하였습니다");
            System.out.println("---- stack trace (여기부터) ----");
            e.printStackTrace();
            System.out.println("---- stack trace (여기부터) ----");
        }
    }
}
