package Exam8_UP;

public class Counter {
    private long count = 0;

    public synchronized void add(long i) {
        System.out.println("더하기");
        count += 1;
    }

    public synchronized void mul(long i) {
        System.out.println("곱하기");
        count *= 1;
    }
}
