package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod();//문제 없음.

        Parent parent2 = new Parent(); //부모 타입으로 객체를 생성하기 때문에, 메모리 상에 자식 타입은 전혀 존재 안함.(자식은 부모를 상속받으니까 둘다 생기지만)
        Child child2 = (Child)parent2; //런타임 오류 - ClassCastException
        child2.childMethod();//실행 불가




    }
}
