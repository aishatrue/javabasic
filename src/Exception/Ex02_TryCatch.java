package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int num1= sc.nextInt();
            int num2 = 10/num1;
            System.out.println(num2);
            System.out.println("Good Bye~~!");
        }
        catch (Exception e)
        {
//            e.printStackTrace();
            String str = e.getMessage();
            System.out.println(str);

        }


            System.out.println("Good bye~~!!");

    }
}
