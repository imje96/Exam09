package Exam6;
//구구단
public class Exam62 {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                // 일의 자리와 십의 자리를 깔끔하게 정리하기 위해 String.format 이용
                System.out.print(i + " * " + j + " =  " + String.format("%2d", i * j));
                System.out.print("    ");
            } // -> 가로로 출력되기 위해 println 대신 print 를 사용
            
            System.out.println();
        } 
    }
}

