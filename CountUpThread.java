package Thread;
//0~50까지의 정수를 출력하는 CountUpThread 클래스를 작성하시오.
//작성한 CountUpThread 인스턴스 3개를 생성하고 실행하시오.


public class CountUpThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100); // 0.1초간 일시정지
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountUpThread thread1 = new CountUpThread();
        CountUpThread thread2 = new CountUpThread();
        CountUpThread thread3 = new CountUpThread();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}