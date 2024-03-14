package poly.ex6;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Chicken chicken = new Chicken();
        Bird bird = new Bird();

        test(dog);
        test(chicken);
        test(bird);

       


    }

    public static void test(AbstractAnimal animal){
        animal.move();
        animal.sound();
        if(animal instanceof Fly){
            ((Fly) animal).fly();
        }

    }


}
