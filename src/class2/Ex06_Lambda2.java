package class2;

interface Unit6{

    void move(String s);
}


public class Ex06_Lambda2 {

    public static void main(String[] args) {



        Unit6 unit = (String s) ->{
                System.out.println(s);
            };

        unit.move("named : Unit6");
    }
}
