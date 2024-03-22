package stream;

import java.util.Arrays;
import java.util.List;

public class Ex05_Map {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange");
        list.stream()
                .map(s-> s.toUpperCase())
                .forEach(n-> System.out.println(n+"\t"));
        System.out.println();

        for (String s : list) {
            System.out.println(s);

        }
    }
}
