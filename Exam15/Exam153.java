package Exam15;

public class Exam153 {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt("Three");
        } catch (NumberFormatException e) {
            System.out.println("NumverFormatException: " + e.getMessage());
            // NumberFormatException이 발생한 경우 처리 방법
        }
    }
}
