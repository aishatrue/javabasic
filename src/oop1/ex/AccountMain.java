package oop1.ex;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        int balance=0;
        while(true){
            System.out.println("1. 입금 | 2. 출금 | 3. 종료");
            int option = scanner.nextInt();
            scanner.nextLine();

            if(option ==1){
                System.out.print("얼마를 입금하시겠습니까?");
                int deposit = scanner.nextInt();
                scanner.nextLine();
                account.deposit(deposit);



            }else if(option ==2){

                System.out.print("얼마를 출금하시겠습니까?");
                int withdraw = scanner.nextInt();
                scanner.nextLine();
                account.withDraw(withdraw);

            }else if(option==3){
                System.out.println("거래를 종료합니다.");
                break;
            }

            else{
                System.out.println("올바른 옵션을 선택해주세요.");
            }

        }



    }
}
