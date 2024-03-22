package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex06_preTerminal {
    public static void main(String[] args) {

        int sum = IntStream.of(1,3,5,7,9)
                .sum();
        System.out.println(sum);


        long cnt = IntStream.of(1,3,5,7,8)
                .count();
        System.out.println(cnt);

        IntStream.of(1,3,5,7,9)
                .average()
                .ifPresent(avg-> System.out.println(avg));

    }
}
