package Exam8_UP;

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
}
