package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField=1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
//        data.defaultField = 2;
//        data.defaultMethod();

        //private 호출 불가
//        data.privateField = 3;
//        data.privatMethod();

        //public메소드이기 때문에 호출 가능하고,일단 호출하면 메소드 내부 호출이 되는것.
        data.innerAccess();
    }
}
