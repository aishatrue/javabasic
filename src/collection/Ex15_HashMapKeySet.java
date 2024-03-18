package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex15_HashMapKeySet {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("홍길동",20);
        map.put("전우치",25);
        map.put("손오공",27);


        Set<String> ks = map.keySet();
        for (String k : ks) {
            System.out.println(k+"\t");
        }
        System.out.println();

        for (String k : ks) {
            System.out.println(map.get(k).toString()+"\t");

        }
        System.out.println();

        for(Iterator<String>itr=ks.iterator();itr.hasNext();)
            System.out.println(map.get(itr.next()).toString()+"\t");


    }
}
