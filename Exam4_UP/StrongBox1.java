package Exam4_UP;

public class StrongBox1 <E>{
    private E data;
    public void put(E data) {
        this.data = data;
    }
    public E get() {
        return this.data;
    }
}