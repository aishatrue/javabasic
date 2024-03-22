package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex03_CollectionVsStream {
    public static void main(String[] args) {
        int[] arr ={1,5,3,2,4};
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            if(i%2==1){
                list.add(i);
            }
        }

        Collections.sort(list);

        for (Integer i : list) {
            System.out.println(i+"\t");

        }
        System.out.println();

        //Stream을 이용한 방식
        Arrays.stream(arr)
                .filter(n-> n%2==1)
                .sorted()
                .forEach(n-> System.out.println(n+"\t"));

        System.out.println();



    }
}
