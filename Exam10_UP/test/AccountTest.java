package Exam10.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Exam10.Account;

class AccountTest {

    @Test
    public void 생성자_테스트() {
        Account account = new Account("홍길동", 30000);
        assertEquals("홍길동", account.getOwner()); // 앞에는 예상 값, 뒤에는 실제 값
        assertEquals(30000, account.getBalance()); // 앞에는 예상 값, 뒤에는 실제 값
    }
    
    @Test
    public void transfer_test() {
        Account account = new Account("홍길동", 30000);
        Account account2 = new Account("한석봉", 0);
        
        account.transfer(account2, 10000);
        
        assertEquals(20000, account.getBalance()); // 앞에는 예상 값, 뒤에는 실제 값
        assertEquals(10000, account2.getBalance()); // 앞에는 예상 값, 뒤에는 실제 값
    
    
        Account account3 = new Account("한석봉(가짜)", 0);
        
        account3.transfer(account, 10000);
        assertEquals(account, 20000);
        assertEquals(account3, 0);
    }
}
