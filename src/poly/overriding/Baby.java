package poly.overriding;

public class Baby extends Child{
    public String value ="Baby";

    @Override
    public void method() {
        System.out.println("Baby.method");
    }
}
