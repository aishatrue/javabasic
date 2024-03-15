package poly.ex.pay0;

import java.util.Scanner;

public class PayService {
    public void processPay(String option, int amount) {
        boolean result = false;



        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

       // 기능1) 결제 시스템을 확인하고, 구현체를 만드는 것.
        // 기능2) 구현체를 받아와서, 실제로 결제를 진행하는 것.


        //결제 시스템 확인
        Pay pay = PayStore.findPay(option);

        //결제 진행

        result = pay.pay(amount);




        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }


}
