package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        //기본 세팅
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요:");
        int num = scanner.nextInt();
        ProductOrder[] orders = new ProductOrder[num];
        scanner.nextLine();

        //주문 정보 입력받고, 생성
        for(int i=0;i<num;i++){
            System.out.println((i+1)+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            scanner.nextLine();
            System.out.print("수량:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            ProductOrder order= createOrder(productName,price,quantity);

            orders[i] = order;


//            printOrders(orders);  orders라는 배열 객체의 참조값이 필요한게 아니라, 그안에 각각 담긴 객체들의 참조값이 필요해서 바깥으로 빼야함.


        }

        //정보 출력 호출
       printOrders(orders);
       int total;
       total = getTotalAmount(orders);
        System.out.println("총 계산금액:"+total);


    }
    static ProductOrder createOrder(String productName,int price,int quantity){
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity=quantity;
        return productOrder;

    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명: "+order.productName+"상품 가격: "+order.price+"상품 수량: "+order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
     int sum=0;
        for (ProductOrder order : orders) {
            sum = sum+ (order.price*order.quantity);
        }
        return sum;
    }
}
