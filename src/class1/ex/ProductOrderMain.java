package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
      ProductOrder productOrder1 = new ProductOrder();
      ProductOrder productOrder2 = new ProductOrder();
      ProductOrder productOrder3 = new ProductOrder();

      ProductOrder[] productOrders = new ProductOrder[3];

      productOrder1.productName ="김치";
      productOrder1.price =3000;
      productOrder1.quantity =2;

      productOrder2.productName ="바나나";
      productOrder2.price =2000;
      productOrder2.quantity =1;

      productOrder3.productName ="콜라";
      productOrder3.price =1000;
      productOrder3.quantity =3;


      productOrders[0] = productOrder1;
      productOrders[1] = productOrder2;
      productOrders[2] = productOrder3;






        int sum=0;
        for (ProductOrder orders : productOrders) {
          sum = sum + (orders.price* orders.quantity);
          System.out.println("상품명:"+orders.productName+"가격: "+orders.price+"수량:"+orders.quantity);



    }


    }
}
