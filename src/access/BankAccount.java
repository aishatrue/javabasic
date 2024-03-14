package access;

public class BankAccount {
    private  int balance;

    public BankAccount(){
        this.balance = 0;
    }

    //public 메서드: deposit
    public void deposit(int amount){
        if(isAmountValue(amount)){
            balance +=amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }

    }
    //public 메서드:withdraw
    public void withdraw(int amount){
        if(isAmountValue(amount)&&balance-amount >=0){
            balance -=amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }
    public int getBalance(){
        return balance;
    }

    //내부에서만 쓰는거라 막았음.
    private boolean isAmountValue(int amount){
        return amount>0;
    }



}
