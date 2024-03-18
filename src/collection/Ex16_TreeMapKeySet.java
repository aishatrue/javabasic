package collection;

import java.util.Set;
import java.util.TreeMap;

public class Ex16_TreeMapKeySet {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("홍길동",20);
        map.put("전우치",25);
        map.put("손오공",27);

        Set<String> ks = map.keySet();

        for (String k : ks) {
            System.out.println(k+"\t");

        }

        for (String k : ks) {
            System.out.println(map.get(k)+"\t");

        }
        System.out.println();

    }
}
