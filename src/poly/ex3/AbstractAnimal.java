package poly.ex3;

public abstract class AbstractAnimal {
    //오버라이딩 목적
    public abstract void sound();

    //자식이 상속받아서 사용하기 위한 목적
    public void move(){
        System.out.println("동물이 움직입니다.");
    }

}
