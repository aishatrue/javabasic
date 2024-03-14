package final1;

public class FieldInit {
    //final에서 이미 값을 초기화하면 생성자로 값 못넣어줌.
    //다 같은 숫자를 인스턴스끼리 써야하고, 값이 바뀌면 안된다고 할때 static final사용
    static final int CONST_VALUE = 10;
    final int value =10;

}
