package oop1.ex;

public class Account {
    int balance=0;

    void deposit(int amount){
        balance = balance + amount;
        System.out.println("잔고:"+balance);
    }
    void withDraw(int amount){
        if(balance<amount){
            System.out.println("잔액 부족");

        }else {
            balance = balance - amount;
        }

        System.out.println("잔고:"+balance);
    }


}
