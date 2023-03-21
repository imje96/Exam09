package Exam10.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Exam10.Bank;

class BankTest {

    @Test
    public void getName_Test() {
            Bank bank = new Bank();
            bank.setName("다나카상"); // 이름을 4글자로 입력
            System.out.println(bank.getName());
        }
    
    @Test
    public void nameLength_Test() {
            Bank bank = new Bank();
            bank.setName("다나카"); // 이름을 3글자로 입력
            System.out.println(bank.getName());    
        }
    }



// 생성자는 없는 것. set name 했을 때 get name, 
// 이름이 정말로 3글자 이하면 이 exception이 나오는지 확인