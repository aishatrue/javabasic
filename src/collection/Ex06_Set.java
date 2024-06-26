package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06_Set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("orange");
        set.add("apple");
        set.add("banana");
        set.add("apple");

        System.out.println("객체 수:"+set.size());

        for(Iterator<String>itr=set.iterator();itr.hasNext();)
            System.out.println(itr.next()+"\t");

        for (String s : set) {
            System.out.println(s+"\t");

        }

    }
}
