package poly.ex.pay0;

public class PayService {
    public void processPay(String option,int amount){
        boolean result;
        System.out.println("결제를 시작합니다: option= "+option+", amount= "+amount);
        PaySystem paySystem = PayStore.findPay(option);

        result = paySystem.pay(amount);


        if(result){
            System.out.println("결제가 성공했습니다.");
        }else{
            System.out.println("결제가 실패했습니다.");
        }
    }

  
}
