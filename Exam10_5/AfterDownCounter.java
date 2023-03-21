package Exam10_5;

public class AfterDownCounter implements Counter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int count() {
        count--;
        return count;
    }

}
