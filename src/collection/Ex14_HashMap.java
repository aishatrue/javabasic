package collection;

import java.util.HashMap;

public class Ex14_HashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();

        map.put("홍길동","010-1234-5678");
        map.put("전우치","010-3333-5678");
        map.put("손오공","010-9999-5678");

        System.out.println("홍길동:"+map.get("홍길동"));
        System.out.println("홍길동:"+map.get("전우치"));
        System.out.println("손오공:"+map.get("손오공"));

        map.remove("손오공");

        System.out.println("손오공:"+map.get("손오공"));


    }
}
