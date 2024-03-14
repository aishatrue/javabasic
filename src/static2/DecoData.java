package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적 변수 접근
        staticMethod();

    }

    public void instanceCall(){
        instanceValue++; //인스턴수 변수 접근
        instanceMethod();; //인스턴스 메서드 접근

        DecoData.staticValue++; //정적 변수 접근. 클래스로 가서 접근하는거기 때문
        DecoData.staticMethod(); //정적 메서드 접근
    }

    public void instanceMethod(){
        System.out.println("instanceValue"+instanceValue);

    }
    public static void staticMethod(){
        System.out.println("staticValue"+staticValue);

    }
}
