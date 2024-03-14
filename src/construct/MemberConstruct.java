package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    MemberConstruct(String name,int age){
        //자기 자신의 생성자를 호출하는것. 생성자 오버로딩할 때, 중복 코드 막기 위해서.
        this(name,age,50);

    }


    // 생성자는 메소드와 비슷하지만, 클래스와 이름이 같아야함.
    MemberConstruct(String name,int age,int grade){
        System.out.println(name+age+grade);
        this.name= name;
        this.age= age;
        this.grade=grade;
    }

}
