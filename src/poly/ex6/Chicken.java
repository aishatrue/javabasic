package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void fly() {
        System.out.println("닭이 나는지 모르겠는데 날아다닙니다.");
    }

    @Override
    public void sound() {
        System.out.println("꼬끼옭");
    }
}
