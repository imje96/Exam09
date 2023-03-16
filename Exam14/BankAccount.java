package Exam_14;

import java.util.Objects;


public class BankAccount {
    private String accountNumber;
    private int balance;

    public static void main(String[] args) {
        BankAccount a = new BankAccount("4649", 1592);
        System.out.println(a);
        
	}
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        

    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // 만일 현 객체 this와 매개변수 객체가 같을 경우 true
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BankAccount other = (BankAccount) obj;
        return Objects.equals(accountNumber.trim(), other.accountNumber.trim());
    }

    @Override
    public String toString() {
        return balance + "원 (계좌번호=" + accountNumber.trim() + ")";
    }

    public int getBalnce() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
