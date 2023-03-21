package Exam10_5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CounterTest2 {

    @Test
    public void Counter_test() {
      AfterCounter counter = new AfterCounter();
      counter.setCount(10);
      System.out.println(counter.getCount());
      System.out.println("===count(increase) 메서드 실행합니다===");
      counter.count();
      System.out.println(counter.getCount());
      System.out.println("");
    }
    
    @Test
    public void DownCounter_test() {
        AfterDownCounter downcounter = new AfterDownCounter();
        downcounter.setCount(20);
        System.out.println(downcounter.getCount());
        System.out.println("===count(decrease) 메서드 실행합니다===");
        downcounter.count();
        System.out.println(downcounter.getCount());
      }
}

