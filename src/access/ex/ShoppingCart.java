package access.ex;

import java.util.List;

public class ShoppingCart {

    private Item[] itemList = new Item[10];
    private int count;


    public void addItem(Item item){

        if(count>=itemList.length) {
            System.out.println("장바구니가 가득찼습니다.");
            return;
        }
                itemList[count] = item;
                count++;







    }
    public void displayItems(){


        for(int i=0;i<count;i++){
            System.out.println("장바구니 상품 출력");
            System.out.println("상품명:"+itemList[i].getItemName()+" 합계:"+itemList[i].getTotalPrice());

        }

        System.out.println("전체 가격 합:"+calculateTotalPrice());

    }
    private int calculateTotalPrice(){
        int totalPrice=0;
        for(int i=0;i<count;i++){

            totalPrice = totalPrice + itemList[i].getTotalPrice();

        }
        return totalPrice;

    }


}
