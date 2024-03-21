package class2;

interface Unit9{
    int calc(int a,int b);
}

public class Ex09_LambdaRule2 {
    public static void main(String[] args) {

        Unit9 unit9= (int a, int b) -> a+b;

        System.out.println(unit9.calc(1,10));

    }
}
