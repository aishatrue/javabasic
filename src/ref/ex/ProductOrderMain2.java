package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder order1= createOrder("콜라",1500,3);
        ProductOrder order2= createOrder("가자미",9000,2);
        ProductOrder order3= createOrder("초밥",12000,3);
       ProductOrder[] orders = {order1,order2,order3};
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
