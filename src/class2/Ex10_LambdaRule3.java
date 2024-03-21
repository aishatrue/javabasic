package class2;

interface Unit10{
    String move();
}

public class Ex10_LambdaRule3 {
    public static void main(String[] args) {
        Unit10 unit10 = () -> "움직여";
        
        System.out.println(unit10.move());
    }

}

