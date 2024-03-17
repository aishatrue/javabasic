package Exception;



public class Ex06_ExceptionThrow {
    public static void main(String[] args) {

        try{
            myMethod1(3);
        }catch (Exception e){
            String str = e.getMessage();
            System.out.println(str);
        }

        System.out.println("Exception Throw!!");
    }
    public static void myMethod1(int n){
        MyMethod2(n,0);
    }

    public static void MyMethod2(int n1,int n2) {
        int r= n1/n2;
    }

}
