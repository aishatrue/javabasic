package collection;
import java.util.Set;
import java.util.TreeSet;

class Student2 implements Comparable<Student2>{
    private String name;
    private int age;
    public Student2(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+":"+age;
    }

    @Override
    public int compareTo(Student2 p) {
        return this.age - p.age; //나이 오름차순 정렬
//        return p.age-this.age; //나이 내림차순 정렬
//        return this.name.compareTo(p.name); //이름 오름차순 정렬
//        return p.name.compareTo(this.name); //이름 내림차순 정렬
    }
}
public class Ex09_Comparable {
    public static void main(String[] args) {
        Set<Student2> tree = new TreeSet<>();
        tree.add(new Student2("홍길동",30));
        tree.add(new Student2("전우치",40));
        tree.add(new Student2("손오공",20));

        for (Student2 student2 : tree) {
            System.out.println(student2);

        }

    }
}
