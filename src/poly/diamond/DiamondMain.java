package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodCommon();
        a.methodA();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();
    }
}
