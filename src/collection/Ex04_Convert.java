package collection;

import java.util.*;

public class Ex04_Convert {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동","전우치","손오공","전우치");

        list = new ArrayList<>(list);
        list.add("해리포터");


        Iterator<String> itr = list.iterator();

        while(itr.hasNext())
            System.out.println(itr.next()+"\t");
        System.out.println();

        list = new LinkedList<>(list);

        for (String s : list)
            System.out.println(s+"\t");
        System.out.println();



    }
}
