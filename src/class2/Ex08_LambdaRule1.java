package class2;

interface Unit8{
    void move(String s);
}

public class Ex08_LambdaRule1 {
    public static void main(String[] args) {

        Unit8 unit8 = (String s) ->{
            System.out.println(s);
        };

        unit8.move("와우");

        Unit8 unit = (s) ->{
            System.out.println(s);
        };

        unit8.move("매개변수 형 생략");

        Unit8 unit1 = (s) -> System.out.println(s);

        unit8.move(" 중괄호 생략");

        Unit8 unit2 = s -> System.out.println(s);

        unit8.move("매개변수 소괄호 생략");



    }
}
