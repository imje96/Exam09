package Exam10.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Exam10.Counter;
import Exam10.DownCounter;

public class CounterTest {

    @Test
    public void counter_Test() {
        Counter counter = new Counter();
        System.out.println("[Counter test 시작합니다]");
        counter.setCount(10);
        System.out.println(counter.getCount());
        System.out.println("===increment 메서드 실행합니다===");
        counter.count();
        System.out.println(counter.getCount());
        System.out.println("");        
    }


    @Test
    public void downcounter_Test() {
        DownCounter downcounter = new DownCounter();
        System.out.println("[DownCounter test 시작합니다]");
        downcounter.setCount(50);
        System.out.println(downcounter.getCount());
        System.out.println("===decrement 메서드 실행합니다===");
        downcounter.count();
        System.out.println(downcounter.getCount());
    }
}

