package stream;

import java.util.Arrays;
import java.util.List;

public class Ex07_Reduce {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","전우치","손오공");

        String name1 = list.stream()
                .reduce("제갈서현",(s1,s2)->s1.length()>=s2.length()?s1:s2);
        System.out.println(name1);

        List<String> list2 = Arrays.asList("홍길동","멀린","손오공");

        String name2 = list2.stream()
                .reduce("이순신",(s1,s2)->s1.length()>=s2.length()?s2:s1);
        System.out.println(name2);

    }
}
