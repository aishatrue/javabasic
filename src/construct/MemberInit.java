package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 초기값 설정을 위한 메소드
    void initMember(String name, int age, int grade){
        this.name = name;
        this.grade = grade;
        this.age = age;
    }
}
