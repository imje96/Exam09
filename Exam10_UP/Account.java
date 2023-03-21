package Exam10;

public class Account {

    public static void main(String[] args) {
        System.out.println("===테스트시작===");
        Account account = new Account("홍길동", 3000);
        System.out.println(account);
        
        Account account2 = new Account("한석봉", 0);
        System.out.println(account2);
        
        System.out.println("테스트 끝");
    }

    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }
    
    // 1원 ~ 1억까지 테스트하기
    // 1원, 1억
    // 1원, 2, 9999999, 1억 : 성공 (범위값에서 -1)
    // 0, 1억, 1원 : 실패 -> 전부 실패
    

    public void transfer(Account dest, int amount) {
//        if (balance < 0)
        dest.setBalance(dest.getBalance() + amount);
        balance -= amount;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
