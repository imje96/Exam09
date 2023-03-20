package Exam4;

public class Exam42 {
    public static void main(String[] args) {
        int[] counts = null;
        float[] heights = {171.3f, 175.0f};
        System.out.println(counts[1]);
        System.out.println(counts[2]);
  }
}


//NullPointerException 
//이미 counts의 참조가 사라졌기 때문에 counts 배열에 접근하기가 어려움
